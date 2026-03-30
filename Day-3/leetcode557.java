class Solution {
    char[] rev(char[] ch,int start,int end){
        while(start<end){
                char temp = ch[start];
                ch[start] = ch[end];
                ch[end] = temp;
                start++;
                end--;
        }
        return ch;
    }
    public String reverseWords(String s) {
        int start = 0,end = 0;
        char[] ch = s.toCharArray();
        for(int i=0;i<ch.length;i++){
            if(ch[i] == ' '){
                end = i-1;
                rev(ch,start,end);
                start = i+1;
            }
            if(i == ch.length-1){
                end = i;
                rev(ch,start,end);
                return new String(ch);
            }
        }
        return s;
    }
}
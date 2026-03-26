class Solution {
    public String reverseVowels(String s) {
        char[] arr = s.toCharArray();
        int start = 0, end = arr.length-1;
        while(start<end){
            if(!isvowel(arr[start])){
                start++;
            }
            if(!isvowel(arr[end])){
                end--;
            }
            if(isvowel(arr[start]) && isvowel(arr[end]) && start<end){
                char temp = arr[start];
                arr[start] = arr[end];
                arr[end] = temp;
                start++;
                end--;
            }
        }
        return new String(arr);
    }
    public boolean isvowel(char val){
        val = Character.toLowerCase(val);
        return(val == 'a' || val == 'e' || val == 'o' || val == 'u' || val == 'i') ;
    }
}
public class test1 {
    public static void main(String[] args) {
        String nick = "AK is a red dragon";
        int count = 0,flag = 0;
        for(int i=0;i<nick.length();i++){
            char ch = nick.charAt(i);
            if(((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z')) && flag == 0){
                count++;
                flag = 1;
            }
            else if(ch == ' '){
                flag = 0;
            }
    }
        System.out.println("Number of words: " + count);
    }
}
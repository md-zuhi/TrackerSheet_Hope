public class evensizewords {
    public static void main(String[] args) {
        String str = "words with even length";
        int count=0;
        char[] arr = str.toCharArray();
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<str.length();i++){
            if(arr[i] != ' '){
                count++;
                sb.append(arr[i]);
            }
            else{
                if(count%2==0){
                    System.out.print(sb.toString()+" ");
                }
                sb.setLength(0);
                count=0;
            }
        }
        if(sb.length()>0&& count%2==0){
            System.out.print(sb.toString());
        }
        
    }
    
}

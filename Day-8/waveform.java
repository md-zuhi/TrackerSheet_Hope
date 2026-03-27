public class waveform {
    public static void main(String[] args) {
        
    
    String str= "aiaiaiaiaiaiaiaiaia";
    for(int i = 0;i<str.length();i+=2){
        System.out.print(str.charAt(i));
    }
    for(int i=1;i<str.length();i+=2){
        System.out.print(str.charAt(i));
    }
}
}

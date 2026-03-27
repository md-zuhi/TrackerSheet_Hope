class waveform_strbuilder{
    public static void main(String[] args) {
        String  str= "qwqwqwqwqwqwqwqwqw";
        StringBuilder sb = new StringBuilder();
        StringBuilder sb2 = new StringBuilder();
        for(int i=0;i<str.length();i++){
            if(i%2==0){
                sb.append(str.charAt(i));
            }
            else{
                sb2.append(str.charAt(i));
            }
        }
        System.out.print(sb.toString()+sb2.toString());
    }
}
import java.util.Scanner;
public class pattern6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        for(int row=n;row>=1;row--,System.out.println()){
            //for(int col = 1;col<=n-row;col++){
            for(int col=n-row;col>=1;col--){
                System.out.print(" ");
            }
            for(int col = (row*2)-1; col>=1;col--){
                System.out.print("*");
            }
        }
    }
}

import java.util.Scanner;
public class pattern5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();//4   4-1=3
        for(int row = 1;row<=n;row++,System.out.println()){
            for(int col =1; col <= n-row;col++){
                System.out.print(" ");
            }
            for(int col=1;col<=(row*2)-1;col++){
                System.out.print("*");
            }
        }
    }
}

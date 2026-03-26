import java.util.Scanner;
public class pattern4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        for(int row = 1;row<=n;row++,System.out.println()){
            for(int col=n;col>=row;col--){
                System.out.print("* ");
            }
        }
    }
}

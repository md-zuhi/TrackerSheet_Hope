import java.util.Scanner;

public class pattern2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        for(int row=1;row<=n;row++,System.out.println()){
            for(int col=1;col<=row;col++){
                System.out.print(row+" ");
            }
        }
    }
}
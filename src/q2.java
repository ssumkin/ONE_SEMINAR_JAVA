import java.util.Scanner;

public class q2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = 0;
        for(int i = 1; i <= a; i++) { 
            for(int j = a-1; j >= i; j--) {
                System.out.print(" ");
            }
            b = i;

            for(int j = 0 ; j < i; j++) {
                
                System.out.print(b);
                b--;
            }

            for(int j = 1; j < i; j++) {
                System.out.print(j+1);
            } 
            

            System.out.println();
        }
    }
}

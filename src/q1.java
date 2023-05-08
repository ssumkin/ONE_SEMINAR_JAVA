import java.util.Scanner;

public class q1 {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        
        int a = sc.nextInt();

        for(int i = 0; i < a; i++) {
            for(int j = a-1; j > i; j--) {
                System.out.print(" ");
            }

            for(int j = 0; j <= i; j++) {
                System.out.print("*");
            }

            System.out.println();
        }
    }
}

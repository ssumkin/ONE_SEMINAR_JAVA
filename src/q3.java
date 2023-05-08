import java.util.Scanner;

public class q3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 

        int num = sc.nextInt();

        int count = 0;

        for(int i = 1; i <= num; i++) {
            int cnt = 0; 
            for(int j = 1; j <= num; j++) {
                if(i % j == 0) { 
                    cnt++;
                }
            }



            if(cnt == 2) {
                count++;
            }
        } 


        
        System.out.println(count);

    }
}

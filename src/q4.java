import java.util.Scanner;

public class q4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] arr = new int[10];
        arr[0] = 1;
        
        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println();
        System.out.print(">> ");
        int moveLocation = sc.nextInt();
        

        while(true) {
            if(moveLocation >= 1 || moveLocation <= 10) {
                arr[0] = 0;
                arr[moveLocation-1] = 1;
                break;
            } else {
                System.out.println("1 ~ 10 사이의 숫자를 입력해 주세요.");
            }
        }

        for (int i : arr) {
            System.out.print(i + " ");
        }
    }
}

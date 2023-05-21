import java.util.Scanner;

public class q5 {
    int nowLocation(int[] arr) {
        int check = 0;

        for(int i = 0; i < arr.length; i++) {
            if(arr[i] == 1) {
                check = i;
            }
        }
        return check;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        q5 quiz5 = new q5();

        int[] arr = new int[10];
        arr[0] = 1;
        int now, after;
         
        while(true) {
            for (int i : arr) {
                System.out.print(i + " ");
            } 
            System.out.println();
            System.out.print(">> ");
            int moveLocation = sc.nextInt();
            now = quiz5.nowLocation(arr);
            
            if(moveLocation == 1) {
                after = now+1 < 10 ? now+1 : now;
                arr[now] = 0;
                arr[after] = 1;
            } else if(moveLocation == -1) {
                after = now-1 > -1 ? now-1 : now;
                arr[now] = 0;
                arr[after] = 1;
            } else if(moveLocation == 0) {
                break;
            } else {
                System.out.println("다시 입력해 주세요.");
            } 
        }
    }
}
import java.util.Scanner;

public class q6 {



    int[] nowLocation(int[][] arr) {
        int[] index = new int[2];

        for(int i = 0; i < arr.length; i++) {
            for(int j = 0; j < arr[i].length; j++) {
                if(arr[i][j] == 1) {
                    index[0] = i;
                    index[1] = j;
                }
            }
        }
        return index;
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        q6 quiz6 = new q6();

        int[][] arr = new int[5][5];
        arr[0][0] = 1;
        
        for (int[] is1 : arr) {
            for (int is2 : is1) {
                System.out.print(is2 + " ");
            }
            System.out.println();
        } 
        
        int[] now;
        int[] after = new int[2];

        while(true) {
            System.out.println();
            System.out.print(">> ");
            int moveLocation = sc.nextInt();

            now = quiz6.nowLocation(arr);
            
            if(moveLocation == 6) {
                arr[now[0]][now[1]] = 0;

                after[0] = now[0];
                after[1] = now[1]+1 < 5 ? now[1]+1 : now[1];

                arr[after[0]][after[1]] = 1;


            } else if(moveLocation == 4) {
                arr[now[0]][now[1]] = 0;

                after[0] = now[0];
                after[1] = now[1]-1 > -1 ? now[1]-1 : now[1];

                arr[after[0]][after[1]] = 1;
            } else if(moveLocation == 8) {
                arr[now[0]][now[1]] = 0;

                after[0] = now[0]-1 > -1 ? now[0]-1 : now[0];
                after[1] = now[1];

                arr[after[0]][after[1]] = 1;
            } else if(moveLocation == 2) {
                arr[now[0]][now[1]] = 0;

                after[0] = now[0]+1 < 5 ? now[0]+1 : now[0];
                after[1] = now[1];

                arr[after[0]][after[1]] = 1;
            } else if(moveLocation == 0) {
                break;
            } else {
                System.out.println("다시 입력해 주세요.");
            }
 
            for (int[] is1 : arr) {
                for (int is2 : is1) {
                    System.out.print(is2 + " ");
                }
                System.out.println();
            } 
            
        }

        
 
    }
}

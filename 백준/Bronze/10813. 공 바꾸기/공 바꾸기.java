import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt(); //교환할 횟수
        int[] ary = new int[n]; // n = 5 -> 5칸짜리 배열 생성
        int temp = 0;
        for(int i=0;i<ary.length;i++){
            ary[i] = i+1; // ary[0] = 1 ~ ary[4] = 5
        }
        for(int i=0;i<m;i++){
            int a = sc.nextInt(); // 1
            int b = sc.nextInt(); // 2
            temp = ary[b-1];
            ary[b-1] = ary[a-1];
            ary[a-1] = temp;
        }

        for(int i=0;i<ary.length;i++) {
            System.out.print(ary[i] + " ");
        }


    }
}

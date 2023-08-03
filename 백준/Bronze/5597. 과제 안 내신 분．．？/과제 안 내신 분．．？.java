import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] ary = new int[30];


        for(int i=0;i<28;i++){
            int m = sc.nextInt();
            ary[m-1] += 1;
        }
        for(int i=0;i<30;i++){
            if(ary[i] == 0) {
                System.out.println((i + 1));
            }

        }

    }
}

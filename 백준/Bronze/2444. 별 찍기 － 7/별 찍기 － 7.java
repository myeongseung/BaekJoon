import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();

        for(int i=-a+1;i<a;i++){
            for(int j=(Math.abs(i));j>0;j--){
                System.out.print(" ");
            }
            for (int k= 2*(a-Math.abs(i))-1;k>0;k--){
                System.out.print("*");
            }
            System.out.println();
        }

    }
}
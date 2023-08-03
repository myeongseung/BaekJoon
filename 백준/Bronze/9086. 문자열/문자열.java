import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();
        for(int i=0;i<num;i++){
            String word = sc.next();
            int a = word.length();
            System.out.println(word.substring(0,1) + word.substring(a-1,a));
        }


    }
}
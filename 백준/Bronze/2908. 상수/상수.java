import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String w1 = sc.next();
        String w2 = sc.next();

        StringBuffer sb1 = new StringBuffer(w1);
        String rsb1 = sb1.reverse().toString();
        StringBuffer sb2 = new StringBuffer(w2);
        String rsb2 = sb2.reverse().toString();

        int f1 = Integer.parseInt(rsb1);
        int f2 = Integer.parseInt(rsb2);

        if(f1 > f2){
            System.out.print(f1);
        }else{
            System.out.print(f2);
        }

    }
}
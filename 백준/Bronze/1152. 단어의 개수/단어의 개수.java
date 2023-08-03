import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();
        String str2 = str.trim();
        //System.out.println(str2);
        if(str2.isBlank()){
            System.out.print(str2.split(" ").length-1);
        }else{
            System.out.print(str2.split(" ").length);
        }
    }
}
import java.util.Scanner;
public class q1 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter positive number.");
        int n = sc.nextInt();
        String i = "*";
        if (n <1){
            System.out.println("INVALID NUMBER");
        } else {
            for (int num = 0;num < n ; num++  ) {
            System.out.println(i);
            i = (i + "*");
            }
        }

    }
}

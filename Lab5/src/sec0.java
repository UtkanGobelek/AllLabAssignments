import java.util.Scanner;
public class sec0 {
    public static int Factorial(int n){
        if ( n == 0) return 1;
        else {
            return n * Factorial(n - 1);
        }

    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter number to find out factorial of that number");
        int num = sc.nextInt();
        if ( num <0) System.out.println("invalid number");
        else System.out.println("factorial(" + num + ") equals:" + Factorial(num));
    }
}

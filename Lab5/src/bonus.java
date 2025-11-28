import java.util.Scanner;
public class bonus {
    public static int fib(int n){
        if (n == 0) return 0;
        if ( n == 1) return 1;
        else return fib(n - 1) + fib(n - 2);
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number to find out what number corresponds to that number in the fibonacci sequence");
        int num = sc.nextInt();
        if ( num < 0 ) {
            System.out.println("invalid number");
        } else {
            System.out.println(fib(num));
        }
    }
}

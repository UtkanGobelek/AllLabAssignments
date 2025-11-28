import java.util.Scanner;
public class q3 {
    public static int Factorial(int a){
       int first = 1;
       int total = 1;
        for (; first <= a; first++) {
           total = total * first;
        }
        return total;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter number to find out factorial of that number");
        int num = sc.nextInt();
        System.out.println("factorial(" + num + ") equals:" + Factorial(num));
    }
}

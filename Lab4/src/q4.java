import java.util.Scanner;
public class q4 {
    public static int reverseNumber(int a) {
        int reversed = 0;
        while (a != 0) {
            int digit = a % 10;
            reversed = reversed * 10 + digit;
            a = a / 10;
        }
        return reversed;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter number to reverse its order of numbers");
        int i = sc.nextInt();
        System.out.println("Reversed number is " +reverseNumber(i));
    }
}
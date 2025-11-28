import java.util.Scanner;
public class sec2 {
    public static long power(long base, int exp){
        long output = 0;
        if (exp == 1) return base;
        else if (exp == 0) return 1;
        else {
            return base * power( base, exp -1);
        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter base");
        long num1 = sc.nextLong();
        System.out.println("enter exponent");
        int num2 = sc.nextInt();
        if (num2 < 0){
            System.out.println("invalid second number");
        } else System.out.println(power( num1, num2));

    }
}

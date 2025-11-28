import java.util.Scanner;
public class sec1 {
    public static int sumDigit(int a){
        int sum =0;

        if (a % 10== a) {
            sum += a;
        } else{
            int i = a % 10 + sumDigit(a / 10);
            sum += i;
        }

        return sum;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number to find out the sum of its digits");
        int number = sc.nextInt();
        if ( number < 0 ){
            System.out.println(sumDigit(number) * (-1));
        } else System.out.println(sumDigit(number));
    }
}
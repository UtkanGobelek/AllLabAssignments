import java.util.Scanner;
public class q2 {
    public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int sum = 0;
    System.out.println("enter start:");
    int num1 = sc.nextInt();
    int start = num1;
    System.out.println("enter end:");
    int num2 = sc.nextInt();
        if ( num1 > num2){
            System.out.println("INVALID ENTER ORDER");
        }else {
            for (; num1 <= num2; num1++) {
                sum += num1;
            }
            System.out.println("The sum of numbers from " + start + " to " + num2 + " is " + sum);
        }
    }
}

import java.util.Scanner;
public class q6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter start");
        int start = sc.nextInt();
        System.out.println("enter end");
        int end = sc.nextInt();

        int numberLoop = 1;
        int result =start;

        while (true){
            result = mainPremise(result);
            System.out.printf("Step=%d  ->  Result=%d %n" , numberLoop, result);
            if (numberLoop >= 1000){
                System.out.println("its an infinite loop");
                break;
            }
            if ( result == end){
                System.out.println("you reached the end");
                break;
            }
            numberLoop++;
        }
    }

    public static boolean isPrime(int a) {
        boolean prime = true;

        if (a < 2) prime = false;

        for (int i = 2; i < a; i++) {
            if (a % i == 0) prime = false;
        }
        return prime;
    }

    public static int mainPremise(int n) {
        if (n % 2 == 0) { //Then it's even
            return n / 2;
        } else if (n % 3 == 0) {
            return n + 4;
        } else if (isPrime(n)) {
            return n * 2;
        } else {
            return n++;
        }
    }
}
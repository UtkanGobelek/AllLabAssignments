import java.util.Scanner;
public class q5 {
    public static String FizzBuzz(int a){
        String output = "";
        for (int i = 1; i <=a; i++){
            String current = "";
          if (i % 3 == 0){
              current = current + "Fizz";
          }
          if ( i % 5 == 0){
              current = current + "Buzz";
          }
          if (current.equals("")){
              current =((i + " ") + " ");
          }
          output = output + current;
        }
        return output;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter number");
        int num = sc.nextInt();
        System.out.println(FizzBuzz(num));
    }
}

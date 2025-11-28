import java.util.Scanner;
public class Scenario2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        BankAccount customer = new BankAccount();
        int id = customer.setAccountID();
        int balance =0;
        System.out.println("id is: " + id);
        System.out.println("balance is: " + balance);
        System.out.println("○ 1 → Deposit\n" +
                "○ 2 → Withdraw\n" +
                "○ 3 → Account Details\n" +
                "○ 4 → Exit");
        int input= sc.nextInt();
        if(input == 1){
            System.out.println("enter amount");
            int depoAmount = sc.nextInt();
            customer.deposit(depoAmount);
            System.out.println(balance);
        }

    }
}

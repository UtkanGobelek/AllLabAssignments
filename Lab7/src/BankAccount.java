import java.util.Random;
public class BankAccount{
    private int accountID;
    private int balance;

    BankAccount(){
        this.accountID = accountID;
        this.balance = balance;
    }
    Random random = new Random();
    int id = random.nextInt(1000000);

    public int setAccountID() {
        accountID=id;
        return accountID;
    }
    public int deposit(int depAmount){
        if ( depAmount > 0){
            this.balance += depAmount;

        } else System.out.println("invalid amount");
        return balance;
    }
}

package day_44_method_overriding.task_1;

public class BankAccount {

    protected long accountNumber;
    protected  String accountHolder;
    protected double balance;

    public void deposit(double amount ){
        this.balance = amount;
    }

    public void withdraw(double amount){
        if ( amount <=balance){
            balance -= amount;
            System.out.println("Withdraw amount: $"+amount);
        }
        else {
            System.out.println("Withdraw amount must be less than or equal to available balance");
        }
    }
    public void checkBalance(){
        System.out.println("Available balance: $"+balance);
    }

}

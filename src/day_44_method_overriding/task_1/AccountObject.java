package day_44_method_overriding.task_1;

public class AccountObject {
    public static void main(String[] args) {

        CheckingAccount checkingAccount = new CheckingAccount();

        checkingAccount.accountHolder = "Sara Jackson";
        checkingAccount.accountNumber = 22222;

        checkingAccount.deposit(500);

        checkingAccount.checkBalance();

        checkingAccount.withdraw(100);

        checkingAccount.checkBalance();

        System.out.println("==============================================");


        SavingAccount savingAccount = new SavingAccount();
        savingAccount.accountHolder = "Mark Smith";
        savingAccount.accountNumber = 111111;

        savingAccount.deposit(400);

        savingAccount.checkBalance();

        savingAccount.withdraw(200);

        savingAccount.checkBalance();

    }
}

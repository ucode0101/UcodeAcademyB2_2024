package day_41_review_and_oop_encapsulation;

public class BankAccount {
    String firstName;
    String lastName;
    String email;
    private long ssn;
    private long accountNumber;
    private double balance;
    private long pinCode;

    public BankAccount(long ssn, long accountNumber){
        this.ssn = ssn;
        this.accountNumber = accountNumber;
    }

    public long getSsn(){
        return  ssn;
    }
    public long getAccountNumber(){
        return  accountNumber;
    }

    public double getBalance(){
        return balance;
    }

    public void setBalance(double balance){
        this.balance = balance;
    }
    public long getPinCode(){
        return pinCode;
    }
    public void setPinCode(long pinCode){
        this.pinCode = pinCode;
    }

}

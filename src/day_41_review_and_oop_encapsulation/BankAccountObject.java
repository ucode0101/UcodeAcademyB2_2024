package day_41_review_and_oop_encapsulation;

public class BankAccountObject {
    public static void main(String[] args) {

        BankAccount person1 = new BankAccount(1000000000, 123123123);

        person1.firstName = "James";
        person1.lastName = "Mike";
        person1.email = "jmike@test.com";
        person1.setBalance(252.50);
        person1.setPinCode(1000);

        System.out.println(person1.firstName);
        System.out.println(person1.lastName);
        System.out.println(person1.email);
        System.out.println(person1.getSsn());
        System.out.println(person1.getAccountNumber());
        System.out.println(person1.getBalance());
        System.out.println(person1.getPinCode());




    }
}

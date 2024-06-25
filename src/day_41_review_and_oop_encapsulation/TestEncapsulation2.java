package day_41_review_and_oop_encapsulation;

public class TestEncapsulation2 {
    public static void main(String[] args) {

        Encapsulation2 obj = new Encapsulation2("Jame Bond","james@test.com",1111111111);

        System.out.println(obj.getName());
        System.out.println(obj.getEmail());
        System.out.println(obj.getSsn());
        //obj.name = "test";

    }
}

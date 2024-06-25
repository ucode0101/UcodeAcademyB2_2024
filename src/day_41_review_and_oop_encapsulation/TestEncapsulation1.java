package day_41_review_and_oop_encapsulation;

public class TestEncapsulation1 {

    public static void main(String[] args) {
        Encapsulation1 obj1 = new Encapsulation1();

        // obj1.name  we cannot access private instance variable

        obj1.setName("Jack");
        System.out.println(obj1.getName());

        obj1.setAge(44);
        System.out.println(obj1.getAge());

        obj1.setEmail("test@test.com");
        System.out.println(obj1.getEmail());
    }
}

package day_51_oop_polymorphism_continue;

public class ReferenceTypeCasting {

    public static void main(String[] args) {

        // Example with primitive data types
        // implicit & explicit casting
        double d = 5.5;

        int i = 10;

        double a = i; // implicit casting

        int j = (int) d; // explicit casting

        System.out.println(a);
        System.out.println(j);

        System.out.println("=======================================================");

        // Reference type casting / Upcasting & Downcasting


        Parent obj1 = new Parent();
        Child obj2 = new Child();

        Parent obj3 = obj2; // Upcasting -> done automatically

        Child obj4 = (Child) obj1; // Downcasting -> done manually/explicitly


    }
}


class Parent{

}

class Child extends Parent{

}
package day_50_oop_polymorphism_intro;

public class TestInstanceof extends Animal{
    public static void main(String[] args) {
        String str = "java";

        boolean b = str instanceof String;

        System.out.println(b);

        TestInstanceof obj1 = new TestInstanceof();

        boolean b1 = obj1 instanceof TestInstanceof;
        System.out.println(b1);

        Animal obj3 = new TestInstanceof();

        boolean b2 = obj3 instanceof Animal;  // true of false?
        boolean b3 = obj3 instanceof TestInstanceof; // true or false?

        System.out.println(b2);
        System.out.println(b3);

        System.out.println("===========================================");

       Object[] all = {"java", 10, 'c',"test",20 };

       for (Object each : all){

           if (each instanceof String ){
               System.out.println("It is instance of String, it is string");
               System.out.println(each);

           } else if (each instanceof Character){
               System.out.println("It is instance of Character, it is character");
               System.out.println(each);
           } else if (each instanceof Integer){
               System.out.println("It is instance of Integer, it is int");
               System.out.println(each);
           } else {
               System.out.println("None of them");
               System.out.println(each);
           }

       }

    }
}

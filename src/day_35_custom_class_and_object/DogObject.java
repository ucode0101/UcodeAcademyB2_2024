package day_35_custom_class_and_object;

public class DogObject {
    public static void main(String[] args) {

        Dog dog1 = new Dog();

        dog1.name = "Cooper";
        dog1.age = 1;
        dog1.color = "Brown";
        dog1.size = "Small";

        System.out.println(dog1.name);
        System.out.println(dog1.age);
        System.out.println(dog1.color);
        System.out.println(dog1.size);

        System.out.println("================================");

        Dog dog2 = new Dog();
        dog2.name = "Archy";
        dog2.age = 2;
        dog2.color = "White";
        dog2.size = "Medium";

        System.out.println(dog2.name);
        System.out.println(dog2.age);
        System.out.println(dog2.color);
        System.out.println(dog2.size);

        System.out.println("============================================");

        dog1.getInfo();

        System.out.println("==============================================");

        dog2.getInfo();

        System.out.println("================================================");

        dog1.eat();
        dog1.bark();

        System.out.println("========================================================");

        dog2.eat();
        dog2.bark();

        System.out.println("============================================================");

        Dog dog3 = new Dog();

        dog3.setInfo("Rembo",3, "Black","Large");

        dog3.getInfo();

        System.out.println("=============================================================");


        System.out.println(dog1);
        System.out.println(dog2);
        System.out.println(dog3);

        System.out.println("===============================");

        System.out.println(dog1.height);
        System.out.println(dog2.gender);
        System.out.println(dog2.abc);





    }
}

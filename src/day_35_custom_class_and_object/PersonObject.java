package day_35_custom_class_and_object;

import java.util.ArrayList;

public class PersonObject {
    public static void main(String[] args) {
        Person person1 = new Person();

        person1.setPersonInfo("Mike","Jackson","Male",33, 5.6, "Black");

        System.out.println(person1);
        person1.getPersonInfo();
        person1.eat();
        person1.speak();
        person1.run();
        person1.study();
        person1.sleep();

        System.out.println("======================================================================");

        Person person2 = new Person();

        person2.setPersonInfo("Sara","Smith","Female",41, 5.5, "Black");
        System.out.println(person2);
        person2.getPersonInfo();
        person2.eat();
        person2.speak();
        person2.run();
        person2.study();
        person2.sleep();


    }
}

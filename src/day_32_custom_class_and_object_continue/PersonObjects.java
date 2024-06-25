package day_32_custom_class_and_object_continue;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.function.Predicate;

public class PersonObjects {
    public static void main(String[] args) {

        Person person1 = new Person();

        person1.firstName = "Sara";
        person1.lastName = "Jackson";
        person1.age = 59;
        person1.gender = "Female";
        person1.height = 5.3;

        System.out.println(person1.firstName);
        System.out.println(person1.lastName);
        System.out.println(person1.age);

        String str = person1.firstName;
        System.out.println(str);

        System.out.println("==================================");

        person1.eat();
        person1.run();
        person1.talking();

        System.out.println("==============================================");

        Person person2 = new Person();

        person2.firstName = "Mike";
        person2.lastName = "Smith";
        person2.age = 45;
        person2.gender = "Male";
        person2.height = 5.3;

        System.out.println(person2.firstName);
        System.out.println(person2.lastName);
        person2.eat();


        System.out.println("=========================================================");

        Person person3 = new Person();

        person3.setPersonInfo("Jame","John", 55, "Male",5.4);

        person3.eat();
        person3.talking();
        person3.run();

        person3.getPersonInfo();

        System.out.println("========================================");
        System.out.println(person3);

        System.out.println("====================================");

        String [] st = {"java","java"};

        Person [] people = {person1, person2, person3};

        System.out.println(Arrays.toString(people));

        System.out.println("==========================================");


        for (Person eachPerson : people){

           //eachPerson.getPersonInfo();
            System.out.println(eachPerson.firstName.toUpperCase());

        }
        System.out.println("=========================================");

        Predicate<Person> predicate = x -> x.firstName.startsWith("S");

        ArrayList<Person> personList = new ArrayList<>(Arrays.asList(person1, person2,person3));
        personList.removeIf(predicate);


        System.out.println(personList);

    }
}

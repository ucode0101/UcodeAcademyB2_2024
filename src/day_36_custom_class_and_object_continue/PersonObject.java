package day_36_custom_class_and_object_continue;

import java.util.Arrays;

public class PersonObject {

    public static void main(String[] args) {

        Person person1 = new Person();
        person1.setPersonInfo("Sara","Jackson", 49, "Female");

        Person person2 = new Person();
        person2.setPersonInfo("Mike", "Smith", 55, "Male");

        Person person3 = new Person();
        person3.setPersonInfo("James", "John",47, "Male");


        Person [] people = { person1, person2, person3};

        System.out.println(Arrays.toString(people));

        System.out.println("================================================");

//        people[0].getPersonInfo();
        System.out.println(people[0]);

        // write a program to go through each person and multiply the age by 2

//        for (int i=0; i< people.length; i++){
//            people[i].age = people[i].age * 2;
//        }

        for (Person each : people){

            each.age = each.age * 2;
        }

        System.out.println(Arrays.toString(people));
    }
}

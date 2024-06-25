package day_35_custom_class_and_object;

import java.util.ArrayList;

public class Person {

    String firstName;
    String lastName;
    String gender;
    int age;
    double height;
    String hairColor;


    public void speak(){
        System.out.println(firstName+" "+lastName+" is speaking");
    }

    public void eat(){
        System.out.println(firstName+" "+lastName+" is eating");
    }

    public void study(){
        System.out.println(firstName+" "+lastName+" is studying Java");
    }
    public void run(){
        System.out.println(firstName+" "+lastName+" is running");
    }

    public void sleep(){
        System.out.println(firstName+" "+lastName+ " is sleeping");
    }

    public void setPersonInfo(String fName, String lName, String pGender, int pAge, double pHeight, String pHairColor){
        firstName = fName;
        lastName = lName;
        gender = pGender;
        age = pAge;
        height = pHeight;
        hairColor = pHairColor;
    }

    public void getPersonInfo(){
        System.out.println(firstName+" "+lastName+" "+gender+" "+age+" "+ height+" "+hairColor);

    }

    public String toString(){
        return firstName+" "+lastName+" "+gender+" "+age+" "+ height+" "+hairColor;
    }


}

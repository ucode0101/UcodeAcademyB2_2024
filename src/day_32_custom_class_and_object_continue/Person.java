package day_32_custom_class_and_object_continue;

public class Person {
    String firstName;
    String lastName;
    int age;
    String gender;
    double height;

    public void talking(){
        System.out.println(firstName+" "+lastName+" is talking");
    }

    public void run(){
        System.out.println(firstName+" "+ lastName+" is running");
    }

    public void eat(){
        System.out.println(firstName+" "+lastName+" is eating");
    }

    public void setPersonInfo(String firstName, String lastName, int age, String gender, double height){

        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.gender = gender;
        this.height = height;


    }


    public void getPersonInfo(){
        System.out.println(firstName);
        System.out.println(lastName);
        System.out.println(gender);
        System.out.println(age);
        System.out.println(height);
    }


    public String toString(){
        return firstName+" "+lastName+" "+gender+" "+age+" "+height;
    }




}

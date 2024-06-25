package day_32_custom_class_and_object_continue;

public class Student {

    String name;
    String nationality;
    int age;
    boolean married;
    char gender;

    public void setStudentInfo(String name, String nationality, int age, boolean married, char gender){
        this.name = name;
        this.nationality = "Tajik";
        this.age = age;
        this.married = married;
        this.gender = gender;
    }

    public String toString(){
        return name+" "+nationality+" "+age+" "+married+" "+gender;
    }



}

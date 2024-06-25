package day_36_custom_class_and_object_continue;

public class Student {

    String name;
    String nationality;
    boolean isMarried;
    char gender;


    public void setStudentInfo(String name, String nationality, boolean isMarried, char gender){
        this.name = name;
        this.nationality = nationality;
        this.isMarried = isMarried;
        this.gender = gender;
        //this.nationality = "Tajik";


    }

    public String toString(){
        return "Name: "+name+" Nationality: "+ nationality+" Is married: "+isMarried+" Gender "+gender;
    }



}

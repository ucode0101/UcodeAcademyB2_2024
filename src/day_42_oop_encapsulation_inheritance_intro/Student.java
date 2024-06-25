package day_42_oop_encapsulation_inheritance_intro;

import java.util.ArrayList;

public class Student {

    private String name;
    private int age;
    private String email;
    private ArrayList<Student> studentList;

    public Student(){

    }

    public Student(String name, int age, String email){
        this.name = name;
        this.age = age;
        this.email = email;
    }

    public void setStudentList(ArrayList<Student> studentList){
        this.studentList = studentList;
    }

    public ArrayList<Student> getStudentList(){
        return studentList;
    }

    public String getName(){
        return name;
    }
    public int getAge(){
        return  age;
    }

    public String getEmail(){
        return  email;
    }


}

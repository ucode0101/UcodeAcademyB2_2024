package day_39_constructor_intro;

public class Student {

    String name;
    int age;
    static String school = "U-Code Academy";

    public void setStudentInfo(String name, int age){
        this.name = name;
        this.age = age;

    }
    public void getStudentInfo(){
        System.out.println(name+" "+age+" "+school);
    }

    {
        System.out.println("You will see me everytime you create an object of Student class");
    }
}

package day_39_constructor_intro;

public class Students {
    String name;
    int age;
    char gender;
    static String university = "U-Code Academy";

    // this is default constructor/no-argument constructor
    public  Students(){

    }

    public Students(String name, int age, char gender){
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    public Students(String name, int age){
        this.name = name;
        this.age = age;
    }
    public Students(String name){
        this.name = name;
    }

    public String toString(){
        return "Name: "+name+" Age: "+age+" Gender: "+gender+" University: "+university;
    }



    // we don't need custom method to set the info
//    public void setStudentInfo(String name, int age, char gender){
//        this.name = name;
//        this.age = age;
//        this.gender = gender;
//    }




}

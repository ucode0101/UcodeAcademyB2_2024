package day_37_statics_and_static_block;

public class Student {

    String fullName;
    int studentId;
    static String schoolName = "U-Code Academy";


    public void setInfo(String fullName, int studentId){
        this.fullName = fullName;
        this.studentId = studentId;
    }

    public String toString(){

        return "Full Name: "+ fullName+" Student ID: "+studentId+ " School name: "+schoolName;
    }

    public void displaySchoolName(){
        System.out.println(schoolName); // Instance method can call/access static variable directly
        //displaySchoolName2(); // Instance method can call/access static method directly

        //this.fullName = "James Bond"; // We can use 'this' keyword in Instance method
    }

    public static void displaySchoolName2(){
        // System.out.println(fullName);  // Static method can Not call/access instance variable
        // displaySchoolName(); // Static method can Not call/access instance method
        // this.fullName = "Mike Smith"; // we cannot use 'this' keyword in Static Method

        System.out.println(schoolName); // Static method can call/access static variable
        //testStaticMethod(); // Static method can call/access static method
    }

    public static void testStaticMethod(){
        System.out.println("Hello static method");
    }


}

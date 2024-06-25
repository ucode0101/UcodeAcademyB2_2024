package day_37_statics_and_static_block;

import java.util.Arrays;

public class StudentObject {
    public static void main(String[] args) {

        Student student1 = new Student();

        student1.setInfo("Sara Jackson",1);

        System.out.println(student1);

        student1.displaySchoolName(); // calling instance method through the object

        student1.displaySchoolName2(); // calling static method through the object

        Student.displaySchoolName2(); // calling static method through the class (preferred/recommended)

        System.out.println("===================================================");

        Student student2 = new Student();
        student2.setInfo("Mike James", 2);

        System.out.println(student2.schoolName); // calling/accessing static variable through the object
                                                   // preferred/recommended through the class name
        System.out.println(Student.schoolName); // calling/accessing static variable through the call (recommended)

        student2.schoolName = "XYZ School";  // after this line school name will be XYZ School for all students
                                             // accessing/calling static variable (schoolName) through the object


       student1.displaySchoolName();
       student2.displaySchoolName();

        System.out.println("====================================================");

        student2.studentId = 99; // studentId changes only for student2

        System.out.println(student1);
        System.out.println(student2);

        Student.schoolName = "ABC School"; // after this line school name will be ABC School for all students
        // accessing/calling static variable (schoolName) through the class (recommended)








    }
}

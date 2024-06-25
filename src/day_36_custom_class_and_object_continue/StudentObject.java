package day_36_custom_class_and_object_continue;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.function.Predicate;

public class StudentObject {

    public static void main(String[] args) {

        Student s1 = new Student();

        s1.setStudentInfo("Mike Smith","Tajik", true, 'M');

        System.out.println(s1);

        Student s2 = new Student();
        s2.name = "Sara Hamilton";
        s2.nationality = "German";
        s2.isMarried = true;
        s2.gender = 'F';

        System.out.println(s2);

        Student s3 = new Student();
        s3.setStudentInfo("Jack Moris", "Italian", false, 'M');

        System.out.println("============================================================");

        // Create an ArrayList<Student> and store all students in it
        ArrayList<Student> studentList = new ArrayList<>(Arrays.asList(s1,s2,s3));

        System.out.println(studentList);

        System.out.println("======================================");

        for (Student eachStudent: studentList){
            System.out.println(eachStudent.name);

        }


        System.out.println("=====================================");

        // write a program to remove the student whose name start or ends with 'S' or 's'

        // using for loop and some logic
//        for (int i=0; i< studentList.size(); i++){
//            String temp = studentList.get(i).name;
//
//            if (temp.startsWith("S") || temp.endsWith("s")){
//                studentList.remove(i);
//                i--;
//            }
//        }

        // Using Predicate with lambda expression
//        Predicate<Student> predicate = x -> x.name.startsWith("S") || x.name.endsWith("s");
//        studentList.removeIf(predicate);

        // using lambda expression directly in removeIf()

        studentList.removeIf(x ->x.name.startsWith("S") || x.name.endsWith("s"));


        System.out.println(studentList);




    }
}

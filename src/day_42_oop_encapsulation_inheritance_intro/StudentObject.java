package day_42_oop_encapsulation_inheritance_intro;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class StudentObject {
    public static void main(String[] args) {

        Student student1 = new Student("Sam",39, "sam@test.com");
        Student student2 = new Student("Sofia", 43, "sofia@test.com");
        Student student3 = new Student("Mark", 55, "mark55@test.com");

        ArrayList<Student> allStudents = new ArrayList<>(Arrays.asList(student1,student2,student3));

        for (Student eachStudent : allStudents){
            System.out.println(eachStudent.getName());
            System.out.println(eachStudent.getAge());
            System.out.println(eachStudent.getEmail());
            System.out.println("=============================");
        }

        System.out.println("========================================");

        Student obj = new Student();
        obj.setStudentList(allStudents);

       for (Student eachStudent : obj.getStudentList()){

           System.out.println(eachStudent.getName()+" "+ eachStudent.getAge()+" "+ eachStudent.getEmail());
           System.out.println("==============================================================");
       }

//       List<Student> students = Arrays.asList(new Student("test",22,"test"),new Student("test",22,"test"));
//       Student obj2 = new Student();
//       //obj2.setStudentList(students);



    }
}

package day_32_custom_class_and_object_continue;

import java.util.ArrayList;
import java.util.Arrays;

public class StudentObjects {

    public static void main(String[] args) {

        ArrayList<Student> allStudents = new ArrayList<>();

        Student s1 = new Student();
        s1.setStudentInfo("Kudrat Negmatov", "Tajik", 34, true, 'M');

        Student s2 = new Student();
        s2.setStudentInfo("Aminbek Hasanov", "Tajik",23, true, 'M');

        Student s3 = new Student();
        s3.setStudentInfo("Mark Smith","German",38, true, 'M');

        allStudents.addAll(Arrays.asList(s1,s2,s3));

        for (int i=0; i< allStudents.size(); i++){

            int studentAge = allStudents.get(i).age;

            if ( studentAge % 2 ==0){

                allStudents.get(i).age = studentAge * 2;
            }
            else {
                allStudents.get(i).age =  studentAge * 3;
            }


        }
        System.out.println(allStudents);

    }

}

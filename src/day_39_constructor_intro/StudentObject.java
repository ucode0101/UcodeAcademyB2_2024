package day_39_constructor_intro;

public class StudentObject {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.setStudentInfo("Mike Smith",39);
        s1.getStudentInfo();

        Student s2 = new Student();
        s2.setStudentInfo("Sara Jackson", 44);
        s2.getStudentInfo();



    }
}

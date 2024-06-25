package day_39_constructor_intro;

public class TestStudents {

    public static void main(String[] args) {
        // we just create s1, but didn't initialize it
        Students s1 = new Students();
        System.out.println(s1);

        System.out.println("================================");

        // create an object and initialize it
        Students s2 = new Students("Jame Bond", 55, 'M');

        System.out.println(s2);

        System.out.println("================================");
        // create an object and initialize name and age
        Students s3 = new Students("Mark Smith", 57);

        System.out.println(s3);
        System.out.println("================================");
        // create an object and initialize name
        Students s4 = new Students("Sara Smith");
        System.out.println(s4);
    }
}

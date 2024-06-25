package day_45_recap;

public class TestStatics {
    public static void main(String[] args) {

        System.out.println(Statics.name); // accessing static/class member through the class name

        Statics object = new Statics();

        System.out.println(object.name); // can be accessed through the object, but preferred via Class

        System.out.println("=========================================");

        System.out.println(object.name2);

        object.name = "Selenium";
        System.out.println(object.name);

        Statics.method1();
        object.method1();




    }
}

package day_31_custom_class_and_object;

public class CarObject {
    public static void main(String[] args) {

        Car car1 = new Car();

        car1.make = "Mercedes";
        car1.model = "E350";
        car1.color = "Black";
        car1.year = 2022;

        System.out.println(car1.make);
        System.out.println(car1.model);
        System.out.println(car1.color);
        System.out.println(car1.year);

        car1.start();
        car1.drive();

        System.out.println("==================================");

        Car car2 = new Car();

        car2.make = "Audi";
        car2.model = "Q5";
        car2.color = "White";
        car2.year = 2020;

        System.out.println(car2.make);
        System.out.println(car2.model);
        System.out.println(car2.color);
        System.out.println(car2.year);

        car2.start();
        car2.drive();

        System.out.println("===============================");

        Car car3 = new Car();
        car3.setCarInfo("BMW","M5",2023, "Blue");

        car3.start();
        car3.drive();

        car3.getCarInfo();

        System.out.println("==============================================");

        System.out.println(car1);
        System.out.println(car2);
        System.out.println(car3);

    }
}

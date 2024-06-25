package day_35_custom_class_and_object;

public class CarObject {
    public static void main(String[] args) {

        Car car1 = new Car();
//        car1.make = "Mercedes";
//        car1.model = "E350";
//        car1.color ="Black";
//        car1.year = 2020;

        car1.setCarInfo("Mercedes","E350",2020, "Black");

        System.out.println(car1.year);

        car1.getCarInfo();
        System.out.println(car1);

        car1.start();
        car1.drive();

        System.out.println("============================================================");

        Car car2 = new Car();
        car2.setCarInfo("BMW","M4",2024,"White");

        System.out.println(car2);
        car2.getCarInfo();

        car2.start();
        car2.drive();





    }
}

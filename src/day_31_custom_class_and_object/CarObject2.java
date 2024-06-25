package day_31_custom_class_and_object;

public class CarObject2 {
    public static void main(String[] args) {

        Car2 audi = new Car2();

        audi.carName = "Audi Q7 2020";
        audi.color = "Red";
        audi.topSpeed = 200;

        System.out.println(audi.carName);

        audi.getCarInfo();

        System.out.println("=====================================");

        Car2 bmw = new Car2();

        bmw.setCarInfo("BWW M3 2022","Green",220);
        bmw.getCarInfo();

        System.out.println("====================================");

        System.out.println(audi);
        System.out.println(bmw);

    }
}

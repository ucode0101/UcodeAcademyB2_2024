package day_31_custom_class_and_object;

public class ClassAndObjectPractice {
    public static void main(String[] args) {

        Car car = new Car();
        car.setCarInfo("Toyota","Camry",2021, "White");
        car.getCarInfo();

        System.out.println("===========================================");

        Car2 car2 = new Car2();
        car2.setCarInfo("Honda Accord","Green",180);
        car2.getCarInfo();

        System.out.println("============================================");

        Dog dog = new Dog();
        dog.setDogInfo("Rex",3,"Brown","Small");
        dog.getDogInfo();



    }
}

package day_31_custom_class_and_object;

public class Car2 {

    String carName;
    String color;
    int topSpeed;

    public void start(){
        System.out.println("Starting "+carName);
    }
    public void drive(){
        System.out.println("Driving "+carName);
    }

    public void setCarInfo(String name, String carColor, int speed){

        carName = name;
        color = carColor;
        topSpeed = speed;
    }

    public void getCarInfo(){
        System.out.println("Car name: "+carName+" Color: "+color+" Top speed "+topSpeed);
    }

    public String toString(){
        return carName+" "+color+" "+topSpeed;
    }
}

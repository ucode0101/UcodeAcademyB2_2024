package day_31_custom_class_and_object;

public class Car {
    String make;
    String model;
    int year;
    String color;


    public void start(){
        System.out.println(make+" "+model+" is starting the engine");
    }

    public void drive(){

        System.out.println("Driving "+make+" "+model+" "+color+" "+year);
    }

    public void setCarInfo(String carMake, String carModel, int carYear, String carColor){
        make = carMake;
        model = carModel;
        year = carYear;
        color = carColor;
    }

    public void getCarInfo(){
        System.out.println("Car info: "+ make+" "+model+" "+color+" "+year);
    }


    public String toString(){

        return make+" "+model+" "+color+" "+year;
    }






}

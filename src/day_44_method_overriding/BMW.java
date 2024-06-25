package day_44_method_overriding;

public class BMW extends Car{

    public void showColor(){
        System.out.println("BMW Black color");
    }

    public void start(){
        System.out.println(this.make);
        System.out.println(this.model);

        System.out.println("Starting the engine");
    }

    public static void main(String[] args) {
        BMW bmw = new BMW();
        bmw.make = "BMW";
        bmw.model = "M5";

        bmw.showColor();
        bmw.start();
    }
}

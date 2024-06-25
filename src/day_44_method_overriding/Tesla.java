package day_44_method_overriding;

public class Tesla extends Car{

    public void showColor(){
        System.out.println(this.make);
        System.out.println(this.model);
        System.out.println("White color");
    }

    public void start(){
        System.out.println("No engine for Tesla");
        System.out.println(this.make+" "+this.model+" is ready to drive");

    }

    public static void main(String[] args) {
        Tesla tesla = new Tesla();
        tesla.make = "Tesla";
        tesla.model = "Y";

        tesla.showColor();
        tesla.start();
    }
}

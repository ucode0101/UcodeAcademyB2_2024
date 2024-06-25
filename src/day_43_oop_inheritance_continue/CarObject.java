package day_43_oop_inheritance_continue;

public class CarObject extends Car{

    int topSpeed = 130;

    public void showSpeed(){
        System.out.println("Showing top speed from parent class");
        // super.showSpeed(); // calling super class's method using super keyword
        System.out.println(super.topSpeed); // calling/accessing super class's field using super keyword
        System.out.println("Showing top speed from current/child class");
        System.out.println(this.topSpeed);// calling/accessing current class's field using this keyword
    }

    // cannot use this & super keywords in static method
    public static void test(){
        //System.out.println(this.topSpeed);
        //super.showSpeed();
    }

    public static void main(String[] args) {
        CarObject car1 = new CarObject();

        car1.showSpeed();
    }
}

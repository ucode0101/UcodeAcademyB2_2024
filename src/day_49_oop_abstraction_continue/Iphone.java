package day_49_oop_abstraction_continue;

public class Iphone extends Phone{
    public void calling(long phoneNumber){
        System.out.println("iPhone is Calling: "+phoneNumber);
    }

    public void texting(long phoneNumber){
        System.out.println("iPhone is Texting:  "+phoneNumber);
    }


    public void faceTime(long phoneNumber){
        System.out.println("iPhone face timing: "+phoneNumber);
    }

    public Iphone( String  model, double price, String size){
        this.model = model;
        this.price = price;
        this.size = size;
    }
    static {
        brand = "iPhone";
    }
}

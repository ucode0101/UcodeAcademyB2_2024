package day_49_oop_abstraction_continue;

public class Samsung extends Phone{

   public void calling(long phoneNumber){
       System.out.println("Samsung is calling + "+phoneNumber);
   }
   public void texting(long phoneNumber){
       System.out.println("Samsung is texting + "+phoneNumber);
   }

   public void takePicture(){
       System.out.println("Taking picture with Samsung");
   }

   public Samsung(String model, double price, String size){
       this.model = model;
       this.price = price;
       this.size = size;
   }

   static {
       brand = "Samsung";
   }

}

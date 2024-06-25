package day_50_oop_polymorphism_intro;

public class Iphone extends Phone implements IphoneApps {

    static {
        brand = "Apple";
    }
    public Iphone(String model, double price, String size){
        this.model = model;
        this.price = price;
        this.size = size;
    }




  public void download(){
      System.out.println("iPhone is downloading App from "+ storeName);
  }

  public void calling(long number){
      System.out.println("iPhone is calling: "+number);
  }
  public void texting(long number){
      System.out.println("iPhone is texting "+number);
  }

}

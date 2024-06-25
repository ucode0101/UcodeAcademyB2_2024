package day_50_oop_polymorphism_intro;

public interface Downloadable {
    boolean isDownloadable = true;
    void download();
}


interface IphoneApps extends Downloadable{
    String storeName = "Apple";
}

interface AndroidApps extends Downloadable{
    String storeName = "Android";
}

abstract class Phone{
    public static String brand;
    public String model;
    public double price;
    public String size;

    public abstract void calling(long number);
    public abstract void texting(long number);

    public String toString(){
        return "Brand: "+ brand+" Model: "+model+" Price: $"+price+" Size: "+size;
    }
}
package day_50_oop_polymorphism_intro;

public class PhoneObject {
    public static void main(String[] args) {

        Iphone iphone15 = new Iphone("iPhone 15 Pro", 799.99, "5.9");

        System.out.println(iphone15);
        iphone15.calling(2121212121);
        iphone15.texting(111441112);
    }
}

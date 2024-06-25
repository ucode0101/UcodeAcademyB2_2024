package day_49_oop_abstraction_continue;

public class PhoneObjects {
    public static void main(String[] args) {

        Iphone iphone = new Iphone("15 Pro", 999.99, "6.5");

        iphone.calling(1111111111);

        iphone.texting(2212121212L);

        iphone.faceTime(33232323232L);

        System.out.println(iphone);

        System.out.println("===========================================");

        Samsung samsung = new Samsung("S24 Ultra", 1199.99, "6.9");

        samsung.calling(1212121212L);

        samsung.texting(23232323232L);

        samsung.takePicture();

        System.out.println(samsung);

    }
}

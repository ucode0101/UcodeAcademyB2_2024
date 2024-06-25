package day_33_methods_method_overloading_recap;

import java.util.Random;

public class MethodOverloadingPractice4 {
    public static char getRandomChar(String str){

        Random r = new Random();
        int index = r.nextInt(str.length());

        return str.charAt(index);
    }

    public static void main(String[] args) {
        Random t = new Random();
        //System.out.println(t.nextInt());
        //System.out.println(t.nextInt(10));

        String str = "selenium";

        System.out.println(getRandomChar(str));


    }
}

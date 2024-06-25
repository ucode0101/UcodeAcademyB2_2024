package day_48_oop_abstraction;

public class FinalKeywordReview {

    final public void method1(){

        System.out.println("Hello method 1");
    }

    public final void method2(){

        System.out.println("Hello method 2");
    }

    public static void main(String[] args) {

        final String STR = "selenium";
        //STR = STR.toUpperCase(); // cannot be modified

        String str2 = "selenium";
        str2 = str2.toUpperCase();


    }



}


class TestFinal extends FinalKeywordReview{

   //public void method2(){} // final method cannot be Overridden
}

final class FinalClass{
    public void method11(){
        System.out.println("Hello");
    }
}

class TestFinalClass { // extends FinalClass -> cannot inherit final class

}


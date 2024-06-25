package day_37_statics_and_static_block;

public class TestStaticMethods {
    public static void main(String[] args) {

       int n =  MathUtilClass.sum(10, 3);
       int x = MathUtilClass.sum(5,2,10);

        System.out.println(n);
        System.out.println(x);

    }
}

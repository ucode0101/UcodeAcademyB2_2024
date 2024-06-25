package day_44_method_overriding;

public class MethodOverloading {

    public void sum(int a, int b){
        System.out.println(a + b);
    }

    public int sum(int a, int b, int c){
        return a + b + c;
    }
    public void sum(double a, double b){
        System.out.println(a + b);
    }

    public static void divide(int a, int b){
        System.out.println(a / b);
    }

    public static void divide(double a, double b){
        System.out.println(a / b);
    }

}

class TestMethodOverloading{
    public static void main(String[] args) {

        MethodOverloading obj = new MethodOverloading();
        obj.sum(5, 5);
        System.out.println(obj.sum(5, 5, 5));
        obj.sum(3.5, 4.5);

        MethodOverloading.divide(10, 2);
        MethodOverloading.divide(5.2, 2.0);
    }
}

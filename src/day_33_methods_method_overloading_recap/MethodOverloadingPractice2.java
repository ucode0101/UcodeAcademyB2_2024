package day_33_methods_method_overloading_recap;

public class MethodOverloadingPractice2 {

    public static void overloadMethod(){
        System.out.println("Hello");
    }

    public static int overloadMethod(int a){
        return a;
    }

    public static String overloadMethod(String s){
        return "Hi"+s;
    }


}

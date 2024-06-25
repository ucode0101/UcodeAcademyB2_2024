package day_33_methods_method_overloading_recap;

public class VoidVsReturnMethod {

    public static void sayHi(){
        System.out.println("Hi");
    }

    public static String sayBye(){
        System.out.println("Hello");
        return "Bye";

    }

    public static void main(String[] args) {
        sayHi();
        //String str = sayHi(); we cannot store the result because it is void method

        System.out.println(sayBye());

        String str = sayBye();
        System.out.println(str);

        String str2 = "java";

        int i = str2.length();


    }
}

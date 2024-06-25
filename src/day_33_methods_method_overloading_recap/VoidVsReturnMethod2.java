package day_33_methods_method_overloading_recap;

public class VoidVsReturnMethod2 {

    public static void doSomeAction(){

        System.out.println("Doing some action");

    }

    public static void doSomething(int i, String str){
        System.out.println(str+" "+i);
    }

    public static String doingSomeAction(){


        return "doing some action with return method";
    }

    public static String doSomeAction2(String str, int i){
        return str +" "+ i;
    }

    public static void main(String[] args) {
        doSomeAction();
        doSomething(5, "java");

        String s = doingSomeAction();

        String s2 = doSomeAction2( "API", 89);

        System.out.println(s);
        System.out.println(s2);
    }


}

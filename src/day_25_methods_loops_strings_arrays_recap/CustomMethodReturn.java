package day_25_methods_loops_strings_arrays_recap;

public class CustomMethodReturn {

    public static void main(String[] args) {

        System.out.println(tenTimesTen());
        System.out.println(tenTimesTen());
        System.out.println(tenTimesTen());
        System.out.println(tenTimesTen());

        int i = tenTimesTen();
        System.out.println("====================");

        int num =numTimesNum(11, 5);
        System.out.println(num);
        System.out.println(numTimesNum(90, 2));
        System.out.println(numTimesNum(89, 78));
    }

    public static int tenTimesTen(){

        return 10 * 10;

    }

    public static int numTimesNum(int a, int b){

        return a * b;
    }

    // Method return type String
    public static String strMethod(int a, String s){// it can have none or many parameters

        return "java";
    }
    // Method return type char
    public static char charMethod(char ch){// it can have none or many parameters

        return ch;
    }

    // Method return type boolean
    public static boolean aBoolean(){ // it can have none or many parameters

        return true;
    }

    // Method return type double
    public static double aDouble(){ // it can have none or many parameters
        return 1.999;
    }

    // Method return type StringBuilder
    public static StringBuilder stringBuilder(){ // it can have none or many parameters
        StringBuilder str = new StringBuilder("java");

        return new StringBuilder("java");
    }

    // Method return type int Array
    public static int[] intArray(){// it can have none or many parameters
        int [] ar = {1,2,3};

        return new int[]{5,6,7,8};

    }



}

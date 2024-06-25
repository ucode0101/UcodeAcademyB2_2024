package day_27_wrapper_class_arraylist_intro;

public class CustomMethodWithWrapperClass {

    // create a method that takes two int parameters and return sum

    public static int sum(int a, int b){
        return a +b;
    }

    public static Integer sum(int x, Integer y){

        return x + y;
    }

    public static void main(String[] args) {

        Integer ab =122;

        int a = sum(12, ab);
    }
}

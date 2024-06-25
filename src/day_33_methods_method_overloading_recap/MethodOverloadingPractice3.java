package day_33_methods_method_overloading_recap;

public class MethodOverloadingPractice3 {
    // create an overloading method that take 1 string/int array/String array and 1 number
    // and return char/element at given index

    public static char returnAtIndex(String str, int index){
        if (index < str.length()){
            return str.charAt(index);
        }
        return '\0';
    }

    public static String returnAtIndex(String [] arr, int index){
        if (index < arr.length){
            return arr[index];
        }
        return null;
    }

    public static int returnAtIndex(int [] arr, int index){
        if (index < arr.length){
            return arr[index];
        }
        return -1;
    }

    public static void main(String[] args) {
        int [] arr = { 3,4,3,22,1,1,23,67};
        String [] arr2 = {"java","api","db","selenium"};
        String s = "java";

        System.out.println(returnAtIndex(s, 2));
        System.out.println(returnAtIndex(arr, 3));
        System.out.println(returnAtIndex(arr2, 1));
    }
}

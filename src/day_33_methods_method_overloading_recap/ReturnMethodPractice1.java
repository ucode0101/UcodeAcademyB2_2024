package day_33_methods_method_overloading_recap;

public class ReturnMethodPractice1 {

    // Create a method that takes 2 parameters as an argument
    // 1 int array, and 1 int as index, and return the element at the given index


    public static int getElementAtIndex(int [] arr, int index){
        if(index >= arr.length){

            return -1;
        }
        return arr[index];
    }

    public static char getCharAt(String str, int index){
        if (index >= str.length()){
            System.out.println(index+ " out of range");
            return 0;
        }
        return str.charAt(index);
    }



    public static void main(String[] args) {
        int [] intArr = {1,3,4,5,7,11,23,2,22,221};

        System.out.println(getElementAtIndex(intArr, 9));

        String str = "java";

//        System.out.println(str.charAt(100));

        System.out.println(getCharAt(str, 1));
    }


}

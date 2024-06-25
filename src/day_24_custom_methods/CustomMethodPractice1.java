package day_24_custom_methods;

public class CustomMethodPractice1 {
    public static void main(String[] args) {
        // write a program to reverse string
        String str = "java";

        // declare variable (any variable)
        String s;
        s= "java";



        // reverse string using for loop
//        for (int i=str.length()-1; i>=0; i--){
//            System.out.print(str.charAt(i)+" ");
//        }
      //  System.out.println("\n=====================================");
        // reverse string using our own custom method
        reverseString(str);
        System.out.println("\n===============");

        reverseString("selenium");
        System.out.println("\n===============");

        reverseString("custom method is useful");

    }

    // creating our own custom method to reverse string

    public static void reverseString(String str){

        for (int i=str.length()-1; i>=0; i--){
            System.out.print(str.charAt(i)+" ");
        }

    }

}

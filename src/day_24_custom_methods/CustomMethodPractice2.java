package day_24_custom_methods;

public class CustomMethodPractice2 {

    public static void main(String[] args) {
        showNumber(10);
        showNumber(222);
        showNumber(190090);
        System.out.println("====================");

        sumOfTwoNumbers(10,20);

        System.out.println("======================");

        printOneToGivenNumber(20);

        System.out.println("=======================");
        printCharAt("selenium", 20);


        System.out.println("================");
    }


    // create a method that takes int as an argument, and prints it
    public static void showNumber(int number){
        System.out.println("The number is: "+number);
    }

    // create a method that take 2 int as arguments and prints the sum
    public static void sumOfTwoNumbers(int num1, int num2){
       // System.out.println("sum of "+num1+" and "+ num2+" is: "+ (num1+num2));
        System.out.println(num1+num2);
    }

    // create a method that takes an int as an argument
    // and print from 1 to given number

    public static void printOneToGivenNumber(int number){
        for (int i=1; i<=number; i++){
            System.out.println(i);
        }
    }

    // create a method that take 2 arguments, one String, and one int as an index
    // and prints character at the given index

    public static void printCharAt(String str, int index){
        // we need to check if index is in the range, not higher than the length of str
        if (index > str.length()-1){
            System.out.println("The index not in the range");
        } else {
            System.out.println(str.charAt(index));
        }

    }


}

package day_23_decimal_format_arrays_loops_review;

public class TaskReverseNumber {
    public static void main(String[] args) {
        // Task:
        // Write a program to reverse number
        // 1234 -> 4321

        int num = 1234;

        // if you want to return it as String
        String s = new StringBuilder(""+num).reverse().toString();
        System.out.println(s);

        System.out.println("======================");


        StringBuilder stringBuilder = new StringBuilder(""+num);
        stringBuilder.reverse();
        String reverse = stringBuilder.toString();

        System.out.println(reverse);







    }
}

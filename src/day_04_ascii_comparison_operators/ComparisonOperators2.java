package day_04_ascii_comparison_operators;

public class ComparisonOperators2 {

    public static void main(String[] args) {

        char c1 = 'A';
        char c2 = 'a';

        boolean isEqual = c1 == c2;
        System.out.println(isEqual);

        boolean isEqual2 = 97 == 'a';
        System.out.println(isEqual2);

        String str1 = "java";
        String str2 = "java";

        boolean isEqual3 = str1 == str2;

        System.out.println(isEqual3);

        System.out.println("==============================");

        // find if a number is even
        boolean isEvenNumber = 11 % 2 == 0;
        System.out.println("is it even number? "+ isEvenNumber);

        // find if a number is evenly divisible by 5
        boolean isDivisibleBy5 = 20 % 5 == 0;
        System.out.println(isDivisibleBy5);

        // find if a number is odd

        boolean isOddNumber = 19 % 2 !=0;

        System.out.println("is it odd number? "+ isOddNumber);


        System.out.println("=========================");
        System.out.println(5 != 6);
        System.out.println(19 != 19);

        System.out.println("===================");








    }
}

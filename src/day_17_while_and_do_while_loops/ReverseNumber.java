package day_17_while_and_do_while_loops;

public class ReverseNumber {

    public static void main(String[] args) {

        // write a program to reverse a number
        int num = -1234; // -> 4321

        String str = ""+num;
        String result = "";

        // this solution is not a valid solution,
        // but it only works with positive number
        // what if we have to return as int, Not String
        for (int i=str.length()-1; i>=0; i--){
            result += str.charAt(i);
        }
        System.out.println(result);

        // Reverse number using while loop
        // This logic reverses any number, positive or negative

        int reverse = 0;
        while (num !=0){
            // 1234
            int tem = num % 10; // 4
           // System.out.println("Temp "+tem);
            reverse = reverse * 10 + tem;
           // System.out.println("Reverse" +reverse);

            num /=10;
          //  System.out.println("Num: "+num);


        }

        System.out.println(reverse);

    }
}

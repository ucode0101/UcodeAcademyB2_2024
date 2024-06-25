package day_17_while_and_do_while_loops;

public class WhileLoopPractice4 {

    public static void main(String[] args) {
        // Reverse String using while loop
        String str = "java and selenium";
        String reverse = "";

        int len = str.length()-1;

        while (len >=0){
            reverse += str.charAt(len);
            len --;
        }

        System.out.println(reverse);

        // print 'z' to 'a' using while loop
        char ch ='z';
        while (ch >='a'){
            System.out.print(ch);
            ch --;
        }
    }
}

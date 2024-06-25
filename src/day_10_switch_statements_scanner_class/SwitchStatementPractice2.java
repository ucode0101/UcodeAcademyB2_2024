package day_10_switch_statements_scanner_class;

public class SwitchStatementPractice2 {

    public static void main(String[] args) {
        // write a program to find if check, if the number is less than 11
        // and use switch statement to find it is even or odd number
        // assume the number is positive

        int number = 10;

        if (number <11){

            switch (number){
                case 2:
                case 4:
                case 6:
                case 8:
                case 10:
                    System.out.println("It is even number");
                    break;
                case 1:
                case 3:
                case 5:
                case 7:
                case 9:
                    System.out.println("It is odd number");
                    break;
            }

        }
        else {
            System.out.println("The number is greater than 11");
        }
    }
}

package day_10_switch_statements_scanner_class;

public class SwitchStatementPractice {
    public static void main(String[] args) {

        // write a program to check if the number is less than 8
        // and use switch to find the number

        int number = 5;
        if (number < 8){

            switch (number){
                case 1:
                    System.out.println("One");
                    break;
                case 2:
                    System.out.println("Two");
                    break;
                case 3:
                    System.out.println("Three");
                    break;
                case 4:
                    System.out.println("Four");
                    break;
                case 5:
                    System.out.println("Five");
                    break;
                case 6:
                    System.out.println("Six");
                    break;
//                default: // default to print seven, because it only comes to switch if number <8
//                    System.out.println("Seven");
//                    break;
                case 7:
                    System.out.println("Seven");
                    break;

            }


        }
        else {
            System.out.println("The number is greater than 8");
        }

        System.out.println("=======================================");

        if (number <8){ // it only goes inside if the condition is true

            switch (number){ // it only runs if the number is less than 8
                case 1 -> System.out.println("One");
                case 2 -> System.out.println("Two");
                case 3 -> System.out.println("Three");
                case 4 -> System.out.println("Four");
                case 5 -> System.out.println("Five");
                case 6 -> System.out.println("Six");
                case 7 -> System.out.println("Seven");
            }

        }
        else {
            System.out.println("The number is greater than 8");
        }

    }
}

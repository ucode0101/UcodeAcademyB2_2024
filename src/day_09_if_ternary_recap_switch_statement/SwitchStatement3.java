package day_09_if_ternary_recap_switch_statement;

public class SwitchStatement3 {
    public static void main(String[] args) {
        /*
§ Create a new switch statement using char instead of int.
§ Create a new char variable
§ Create a switch statement testing for A, B, C, D or E
§ Display a message if any of these are found and then break
§ Add a default which displays a message saying not found.
         */


        char ch = 'O';
        switch (ch){
            case 'A':
                System.out.println("It is A");
                break;  // exit the switch statement
            case 'B':
                System.out.println("IT is B");
                break;// exit the switch statement
            case 'C':
                System.out.println("It is C");
                break;// exit the switch statement
            case 'D':
                System.out.println("It is D");
                break;// exit the switch statement
            case 'E':
                System.out.println("It is E");
                break;// exit the switch statement
            default:
                System.out.println("Not found");
                break;// exit the switch statement
        }

    }
}

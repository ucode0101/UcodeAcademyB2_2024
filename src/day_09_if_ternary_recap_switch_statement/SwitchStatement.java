package day_09_if_ternary_recap_switch_statement;

public class SwitchStatement {
    public static void main(String[] args) {

        int n1 = 59;
        int n2 = 89;
        char ch = 'a'; // we assume ch is a, b, c or d

        switch ( ch ){  // -> expression

            case 'a' : // -> we compare the value of ch with the value of the case
                System.out.println("It is a");
                break;


            case 'c': // -> we compare the value of ch with the value of the case
                System.out.println("It is c");
                break;
            case 'd': // -> we compare the value of ch with the value of the case
                System.out.println("It is d");
               break;

            default:
                System.out.println("It is d");
        }

        char c = (char) 97;
        System.out.println(c);

    }
}

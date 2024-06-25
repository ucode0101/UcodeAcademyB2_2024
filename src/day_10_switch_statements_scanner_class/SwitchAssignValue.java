package day_10_switch_statements_scanner_class;

public class SwitchAssignValue {
    public static void main(String[] args) {
        // write a program to check if character is vowels
        // vowel -> a,e,i,o,u

        char ch = 'i';
        String result ="";

       switch (ch){

            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
                result = "Vowel";
                break;

            default:
                result = "Not vowel";
                break;

        }
        System.out.println(result);

        System.out.println("=============================");

        String result2 = switch (ch){
            case 'a','e','i','o','u' -> "Vowel";
            default -> "Not vowel";
        };

        System.out.println(result2);




    }
}

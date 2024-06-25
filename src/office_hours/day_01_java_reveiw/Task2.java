package office_hours.day_01_java_reveiw;

public class Task2 {

    public static void main(String[] args) {
        // Write a program to check if character is upper case or lower case
        // (ASCII -> a to z represented from 97 to 122)

        char ch = '@';
        boolean isLower = ch >='a' && ch <='z';
        boolean isUpper = ch >='A' && ch <='Z';

        if (isLower == true){
            System.out.println(ch+" is lower case character");
        }
        if (isUpper == true){
            System.out.println(ch+" is upper case character");
        }
        // one way
//        if (isLower == false && isUpper == false){
//            System.out.println(ch+" is not upper case or lower case character");
//        }

        if (!isLower && !isUpper){
            System.out.println(ch+" is not upper case or lower case character");
        }



    }
}

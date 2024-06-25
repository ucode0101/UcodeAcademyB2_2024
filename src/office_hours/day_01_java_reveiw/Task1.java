package office_hours.day_01_java_reveiw;

public class Task1 {
    public static void main(String[] args) {
        //  Write a program to convert character to int example 'a' -> 97, 'b' -> 98

        char ch = 'a'; // ASCII 97
        int num = ch; // the decimal that represents character will be assigned to int variable

        byte b =(byte) ch; // assigning char to num variables, the decimal from ASCII table will be as int
       char ch2 = 113; // the character that is represented in ASCII table will be assigned to char variable

        System.out.println(num);
        System.out.println(ch2);

        System.out.println("=====================================");

        //  Write a program to check if character is upper case or lower case
        //   (ASCII -> a to z represented from 97 to 122)

        char ch3 = '%';

        // one way to use decimal from ASCII
        if (ch3 >= 97 && ch3 <=122){
            System.out.println(ch3+" is lower case character");
        }

        if (ch3 >=65 && ch3 <=90){
            System.out.println(ch3+" is upper case character");
        }

        System.out.println("====================================");

        // second way to characters
        if (ch3 >='a' && ch3 <='z'){
            System.out.println(ch3 +" is lower case character");

        }
        if (ch3 >='A' && ch3 <='Z'){
            System.out.println(ch3 + " is upper case character");
        }

        // when we cover else statement we don't need this confusing part
        if ( !(ch3 >='a' && ch3 <='a') && !(ch3 >='A' && ch3 <='Z') ){
            System.out.println(ch3 +" is not upper case or lower case character");
        }








    }
}

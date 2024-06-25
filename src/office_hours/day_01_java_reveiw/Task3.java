package office_hours.day_01_java_reveiw;

public class Task3 {

    public static void main(String[] args) {
        // 3. Write a program to return some of two characters as int

        char ch1 = 'd';
        char ch2 = 'r';

        int sum = ch1 + ch2;
        System.out.println(sum);

        char ch3 =  50 + 67;
        System.out.println(ch3);

        System.out.println("==============================");

        // write a program to check if a character is represented by even or odd number in ASCII table
        char ch4 = 'e';
        if ( ch4 % 2 == 0){
            System.out.println(ch4 +" is represented in ASCII by even number");
        }
        if (ch4 % 2 !=0){
            System.out.println(ch4 +" is Not represented in ASCII by even number");
        }


    }
}

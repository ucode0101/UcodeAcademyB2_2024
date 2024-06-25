package day_34_wrapper_class_arraylist_recap;

public class WrapperClassRecap2 {

    public static void main(String[] args) {

        // write a program to store numbers, letter, and special characters in different variable
        // have 3 String variable

        char c = 'a';// char primitive data type
        Character c2 = 'b'; // wrapper class/non-primitive data type/object

        String str = "jad4j5*&$dkdj33*&";

        String number="";
        String letters ="";
        String specialChars = "";

        for (int i=0; i< str.length(); i++){

            if (Character.isDigit(str.charAt(i))){
                number += str.charAt(i);
            }
            else if (Character.isLetter(str.charAt(i))){
                letters += str.charAt(i);
            }
            else {
                specialChars += str.charAt(i);
            }
        }

        System.out.println(number+"\n"+letters+"\n"+specialChars);


        Character.toUpperCase('a');
        Character.toLowerCase('B');



        int n1 = 55;
        int n2 = 33;

        int n3 = Integer.max(n1,n2);
        System.out.println(n3);


        int n4 = Integer.min(n1,n2);
        System.out.println(n4);

        System.out.println("=======================================");
        // write a program to find the max/larger and min/lower numbers from int Array

        int [] arr = { 3,1,6,4,2,7,5};
        int max =arr[0];
        int min = arr[0];


        for (int i : arr){

            max = Integer.max(max, i);
            min = Integer.min(min, i);

//            if (i > max){
//                max = i;
//            }
        }
        System.out.println(max);
        System.out.println(min);


    }
}

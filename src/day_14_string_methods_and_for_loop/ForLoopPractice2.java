package day_14_string_methods_and_for_loop;

public class ForLoopPractice2 {

    public static void main(String[] args) {
        // write a program to print all 'e' characters from  a string
        String str ="selenium test end selenium test end";
        // this variable will be used to store the count of 'e' that appears in str
        int count =0;

       // int stringLength = str.length()-1;

        for (int i=0; i<=str.length()-1; i++){

            if (str.charAt(i) == 'e'){
                System.out.println(str.charAt(i));

                // count is optional
                count +=1;
            }
        }
        System.out.println(count);

        System.out.println("Printing all 'e' using substring method");

        for (int i =0; i<= str.length()-1; i++){
            String s = str.substring(i, i+1); // i-> 3, 3+1
            if (s.equals("e")){
                // one way is to print s if true
               System.out.println(s);
                // another
               // System.out.println(str.substring(i,i+1));
            }
        }



    }

}

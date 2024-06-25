package day_19_arrays_continue;

public class ArraysPractice3 {
    public static void main(String[] args) {

        String [] strings = {"java","api","selenium","junit","testng"};

        // to access/print each element one by one (manually)
        System.out.println(strings[0]);
        System.out.println(strings[1]);
        System.out.println(strings[2]);




        System.out.println("==========================================");

        // loop through strings array and print each element/value one by one

        for (int i=0; i <= strings.length-1; i++){
            System.out.println(strings[i]);
        }

        System.out.println("==============================================");

        // loop through strings array and print element/String that has the length of 5 or greater
        for (int i=0; i< strings.length; i++){
            // one way
//            String str = strings[i];
//
//            if (str.length() >=5){
//                System.out.println(str);
//            }
            if (strings[i].length() >=5){
                System.out.println(strings[i]);
            }
        }



    }

}

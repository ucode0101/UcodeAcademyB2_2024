package day_17_while_and_do_while_loops;

public class NestedLoopPractice {
    public static void main(String[] args) {

        // Using While & Do while nested loop
        // find frequency of character in string -> "java" -> "j1a2v1"

        String str = "aabbeeeaaddeeccc";
        String result ="";

        int i =0;

        while (i < str.length()){

            int j=0;
            int count =0;

            do {
                if (str.charAt(i) == str.charAt(j)){
                    count++;
                }
                j++;
            } while (j < str.length());

            if(!result.contains(""+str.charAt(i))){
                result +=""+ str.charAt(i)+count;

            }
            i++;

        }
       System.out.println(result);

        System.out.println("================================");
        // find frequency of characters using nested for loop

        String result2 = "";
        for (int k=0; k<=str.length()-1; k++){
            int count =0;

            for (int l = 0; l<=str.length()-1; l++){
                if (str.charAt(k) == str.charAt(l)){
                    count ++;
                }
            }

            if (!result2.contains(""+str.charAt(k))){
                result2 +=""+str.charAt(k)+count;
            }
        }

        System.out.println(result2);

    }






}

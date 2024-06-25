package day_17_while_and_do_while_loops;

public class NestedWhileLoop2 {
    public static void main(String[] args) {
        // Reverse String ten times using nested while loop
        String str = "java";
        int i =1;
        while (i <=10){
            i++;
            int j = str.length()-1;

            while (j >=0){
                System.out.print(str.charAt(j));
                j--;
            }
            System.out.println();

        }

        System.out.println("=========================");

        // Reverse String ten times using nested for loop

        for (int k=1; k<=10; k++){

            for (int c = str.length()-1; c >=0; c--){
                System.out.print(str.charAt(c));
            }
            System.out.println();

        }

    }
}

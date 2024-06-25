package day_19_arrays_continue;

public class ArraysWithWhileLoop {
    public static void main(String[] args) {

        char [] chars = {'a','w','h','i','k','m'};

        // print all chars one by one with while loop
        int i =0;
        while (i <chars.length){
            System.out.print(chars[i]+" ");
            i++;
        }
        System.out.println("\n==========================================");

        // print all chars one by one with do while loop
        int j =0;
        do {
            System.out.print(chars[j]+" ");
            j++;
        } while (j < chars.length);

    }
}

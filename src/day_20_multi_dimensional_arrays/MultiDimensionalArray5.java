package day_20_multi_dimensional_arrays;

public class MultiDimensionalArray5 {
    public static void main(String[] args) {

        // declare multidimensional array and assign values
        // use nested loop to print each element from each array one by one

        char[][] chars = { {'a','b','c'},{'i','k','m'}, {'y','t','m'} };

        for (int i=0; i< chars.length; i++){
            for (int j=0; j< chars[i].length; j++){
                System.out.print(chars[i][j]+" ");
            }
            System.out.println();
        }



    }
}

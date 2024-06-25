package day_20_multi_dimensional_arrays;

public class MultiDimensionalArray3 {

    public static void main(String[] args) {
        String [][] arrayOfArrays = {
                {"java","test","maven","database"},
                {"junit","sql","data"},
                {"aws","pytest","python","rest api"}  };

        // iterate over multidimensional array using While Loop

        int i=0;
        while (i <arrayOfArrays.length){

            int j =0;
            while (j< arrayOfArrays[i].length){
                System.out.print(arrayOfArrays[i][j]+" ");
                j++;
            }
            i++;

            // to break/start from new line
            System.out.println();

        }
        System.out.println("===================================");

        // // iterate over multidimensional array using Do While Loop

        int k =0;
        do {
            int l =0;

            do {
                System.out.print(arrayOfArrays[k][l]+" ");
                l++;
            } while (l < arrayOfArrays[k].length);

            k++;

            // start/break from new line
            System.out.println();
        } while (k < arrayOfArrays.length);
    }
}

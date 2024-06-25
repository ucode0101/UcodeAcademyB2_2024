package day_19_arrays_continue;

public class ArraysPractice5 {
    public static void main(String[] args) {
        int [] numbers = {33,2,28,209, 432,11,6,9,192,12,22};

        // find max and min numbers from int array (numbers)

        int max = numbers[0];
        int min = numbers[0];

        for (int i=0; i< numbers.length; i++){
            int x = numbers[i];
            if (x > max){
                max = x;
            }
            if (x < min){
                min = x;
            }

        }
        System.out.println("Max number: "+ max);
        System.out.println("Min number: "+ min);

    }
}

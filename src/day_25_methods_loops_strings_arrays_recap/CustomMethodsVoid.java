package day_25_methods_loops_strings_arrays_recap;

public class CustomMethodsVoid {
    public static void main(String[] args) {

        tenTimesTen();
        tenTimesTen();
        tenTimesTen();
        tenTimesTen();

        //int num = tenTimesTen();

        int num1;
        int num2;

        num1=10;
        num2=19;
        System.out.println("==========================");

        numTimesNum(10, 5);
        numTimesNum(10, 4);
        numTimesNum(20, 20);
    }


    public static void tenTimesTen(){
        System.out.println(10 * 10);

    }

    public static void numTimesNum(int num1, int num2){

        System.out.println(num1 * num2);


    }



}

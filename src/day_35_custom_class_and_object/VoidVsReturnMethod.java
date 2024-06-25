package day_35_custom_class_and_object;

public class VoidVsReturnMethod {

    public static void sumOfTwo(){
        System.out.println(10 + 10);
    }

    public static int sumOfTwoNum(){
        return 10 + 10;
    }

    public static void sum1(int a, int b){
        System.out.println(a + b);
    }

    public static int sum2(int a, int b){

        System.out.println();
        return  a + b;

    }





    public static void main(String[] args) {
        sumOfTwo();
        sumOfTwo();
        sumOfTwo();


        int a =  sumOfTwoNum();
        int b = sumOfTwoNum();
        int c = sumOfTwoNum();

        System.out.println("===================================");

       sum1(20,10);

        System.out.println(sum2(10, 5));

        int x = sum2(55, 15);

        System.out.println(x);




    }
}

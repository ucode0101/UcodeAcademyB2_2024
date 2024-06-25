package day_25_methods_loops_strings_arrays_recap;

public class MethodOverloading {
    public static void main(String[] args) {

       int intNum =  sumOfNumbers(1, 9); // we can assign result to a variable of its type
       int x = 1+5; // the above method works this way

       System.out.println(5 + 3); // it just prints/does some action


        sumOfNumbers(2.4,5.5);


    }


   public static void sumOfTwoNumbers(int a, int b){
       System.out.println(a+b);
   }
   public static void sumOfThreeNumbers(int a, int b, int c){} // Not a good practice, too many code/method


   public static int sumOfNumbers(int a, int b){
        return  a+b;
   }
   public static int sumOfNumbers(int a, int b, int c){
        return a + b + c;
   }
   public static int sumOfNumbers (int a, int b, int c, int d){
        return a+b+c+d;
   }
   public static double sumOfNumbers(double a, double b){
        return a + b;
   }
   public static double sumOfNumbers(double a, double b, double c ){
        return  a+b+c;
   }

   public static String sumOfNumbers(String str, char ch, int a, double d){
        return str+ch+a+d;
   }




}

package day_33_methods_method_overloading_recap;

public class MethodOverloadingPractice1 {
    public static int sum(int n1, int n2){
        return  n1 + n2;
    }

   public static int sum(int n1, int n2, int n3){
        return n1+n2+n3;
   }
   public static int sum(int n1, int n2, int n3, int n4){
        return n1+n2+n3+n4;
   }

    public static void main(String[] args) {
        System.out.println(sum(3,4, 3,5));

    }

    public static void main(int i){
        System.out.println("Hello Main method");
    }


}

package day_34_wrapper_class_arraylist_recap;

public class WrapperClassRecap {

    public static void main(String[] args) {

        int i = 55; // int primitive

        Integer j = 77; // Integer Object/non-primitive


        int k = j;

        Integer l = j;

        System.out.println("==================================");

        int n = Integer.MIN_VALUE; // the lowest number that int/Integer can have

        System.out.println(n);

        int n2 = Integer.MAX_VALUE; // the highest number that int/Integer can have

        System.out.println(n2);


        String str = "54433";

        int num2 = Integer.parseInt(str);
        System.out.println(num2);






    }
}

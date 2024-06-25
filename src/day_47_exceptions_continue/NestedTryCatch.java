package day_47_exceptions_continue;

public class NestedTryCatch {

    public static void main(String[] args) {

        String str = "java";


        try {
            System.out.println(str.charAt(5));
        }
        catch (Exception e){
            System.out.println("First Catch block");
            try {
                System.out.println(str.charAt(3));
            } catch (Exception a){
                System.out.println("Second Catch block");
            }

        }
        System.out.println("=====================================");

        try {
            System.out.println("Hello 1");

            try {
                System.out.println("Hello 2");
            } catch (Exception e){
                System.out.println("Inner catch block");
            }
        } catch (Exception a){
            System.out.println("Outer catch block");
        }

    }
}

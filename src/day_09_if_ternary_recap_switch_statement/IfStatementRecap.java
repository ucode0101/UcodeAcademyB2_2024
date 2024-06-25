package day_09_if_ternary_recap_switch_statement;

public class IfStatementRecap {
    public static void main(String[] args) {

        // What is if statement?
        // if statement is used to check condition

        // why do we use if statement
        // we use if statement to check some boolean condition,
        // and run/execute some code if the condition is

        if (true){
            System.out.println("Hello");
        }
        if (false){
            System.out.println("Hi");
        }


        // what is if else statement?
        // the code inside if block runs/gets executed if the condition is true
        // the code inside else block runs/gets executed if, the if condition is false

        if (false){
            System.out.println("Hello1");
        }
        else {
            System.out.println("Hello2");
        }

        System.out.println("==================================================");

        int num = 24;
        if (num >10){
            byte b = 10;
            System.out.println(b);
            String str = "java";
            System.out.println(str);

            String str2 = str+b;
            System.out.println(str2);


        } else {
            byte b1 = 11;
            System.out.println(b1);
            String str3 = "java";
            System.out.println(str3);

            String str4 = str3+b1;
            System.out.println(str4);
        }



    }
}

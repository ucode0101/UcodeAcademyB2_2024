package day_09_if_ternary_recap_switch_statement;

public class IfStatementsAndTernary {
    public static void main(String[] args) {

        String str = "java";
        int n2 = 58;
        int sum =0;
        // using ternary inside if statement
        if (str == "java") {
            System.out.println("I love Java");

            sum = (n2 % 2 ==0) ? n2 + n2 : n2 * n2;

            if (sum > 100){
                sum += 100;
            } else {
                sum += 200;
            }

            System.out.println(sum);


        }  else {
            System.out.println("Selenium");
        }

    }
}

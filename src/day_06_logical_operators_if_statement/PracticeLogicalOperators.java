package day_06_logical_operators_if_statement;

public class PracticeLogicalOperators {
    public static void main(String[] args) {
        int appleCount = 30;
        int orangeCount = 30;
        int pearsCount = 30;

        boolean count = appleCount < orangeCount || orangeCount >= pearsCount; // true
        boolean count2 = appleCount < orangeCount && orangeCount >= pearsCount; // false

        System.out.println(count);
        System.out.println(count2);

        System.out.println("=============================");

        String outsideWeather = "Shinny";
        int degree = 70;

        //                       first we get the boolean result and use ! to make the opposite
        boolean isNiceOutside =  !(outsideWeather == "Rainny" || degree == 70) ;

        System.out.println(isNiceOutside);

        // the above result works exactly as below
       // boolean isNiceOutside2 =  outsideWeather == "Rainny" || degree == 70 ;
        //isNiceOutside2 = !isNiceOutside2;

        System.out.println("===========================");
        int b = 2;

        boolean result = ++b == 2 || --b == 2 && --b == 2;

        System.out.println(result);
        System.out.println(b);
        System.out.println("=====================");

        boolean x = true, z = true;
        int y = 20;
        x = (y != 10) || (z!=false);

        System.out.println(x);

        System.out.println("===============================");

        // Task

        // 1
        double d = 20;
        //2
        double d2 = 80;

        // 3
        double d3 = (d + d2) * 25;

        // 4
        double d4 = d3 % 40;


        System.out.println(d4  <= 20);

        // do the above in one line

        boolean isLessThan20 = (20 + 80 ) * 25 % 40 <=20;
        System.out.println(isLessThan20);





    }
}

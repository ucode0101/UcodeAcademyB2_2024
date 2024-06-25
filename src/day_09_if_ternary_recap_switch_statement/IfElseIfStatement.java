package day_09_if_ternary_recap_switch_statement;

public class IfElseIfStatement {
    public static void main(String[] args) {
        boolean tea = false;
        boolean coffee = true;
        boolean water = false;
        boolean icedTea = true;

        if (tea){ // means -> tea == true
            System.out.println("Tea is available");
        }
        else if (coffee){ // means -> true == true
            System.out.println("Coffee is available");
        }
        else if (water){ // means -> water == true
            System.out.println("Water is available");
        }
        else if (icedTea){
            System.out.println("Iced tea is available");
        }
        else {
            System.out.println("Sorry no drinks available");
        }

        System.out.println("==================================");

        // using ternary operator
        String result = ( tea )? "Tea" : (coffee) ? "Coffee" : (water) ? "Water" : (icedTea) ? "Iced tea" : "No drinks";

        // not worth making yourself more confusing
        //String result2 = tea ? "tea" : (coffee ? "coffee" : (water ? "water" :( icedTea ? "iced tea": "no drink")));
        System.out.println(result);
       // System.out.println(result2);



    }
}

package day_06_logical_operators_if_statement;

public class SingleIfStatement {
    public static void main(String[] args) {


        int score = 50;

        // can I go inside? if it is true it will if not it won't
        if(score >= 50){ // true -> it is executing the code inside
            System.out.println("Congratulations");
        }

        // can I go inside? if it is true it will if not it won't
        if (score >70){ // false -> it is not executing the code inside
            System.out.println("Fantastic!");

        }

        System.out.println("======================================");

        int personAge = 19;
        if ( personAge >= 18){
            System.out.println("You are eligible to vote");
        }



    }
}

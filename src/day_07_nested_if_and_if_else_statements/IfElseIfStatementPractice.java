package day_07_nested_if_and_if_else_statements;

public class IfElseIfStatementPractice {
    public static void main(String[] args) {
        // Write a java program to check the score
        // if the score is grater than or equal 90, print excellent
        // else if the score is between 80 and 89 print, Great
        // else if the score is between 70 and 79 print Good
        // else if the score is between 60 and 69, print not bad
        // else print you need some work

        int score = 90;

        if (score >= 90){
            System.out.println("Excellent");

        }
        else if (score >=80 && score <=89){
            System.out.println("Great");
        }
        else if(score >=70 && score <=79){
            System.out.println("Good");
        }
        else if(score >=60 && score <=69){
            System.out.println("Not bad");
        }
        else {
            System.out.println("You need some work to do");
        }


    }
}

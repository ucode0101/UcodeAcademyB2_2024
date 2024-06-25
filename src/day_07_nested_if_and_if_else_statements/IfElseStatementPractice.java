package day_07_nested_if_and_if_else_statements;

public class IfElseStatementPractice {
    public static void main(String[] args) {
        //2. A triangle is valid if the sum of all the three angles is equal to 180 degrees.Write a
        //program that declares three integers as angles and check whether a triangle is valid or not.
        int angel1 = 40;
        int angel2 = 60;
        int angel3 = 80;

        if ( angel1 + angel2 + angel3 == 180){
            System.out.println("It is a valid triangle");
        }
        else{
            System.out.println("It is not a valid triangle");
        }





    }
}

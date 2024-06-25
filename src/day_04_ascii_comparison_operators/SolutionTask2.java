package day_04_ascii_comparison_operators;

public class SolutionTask2 {

    public static void main(String[] args) {

/*
Task 2:
Write a program to convert Hours to days
Create variable for each and use Arithmetic operators
for example:
24 hours is 1 day
26 hours is 1 day and 2 hours
etc..
 */
        int hours = 67;

        int days = hours / 24; // to get the number of days
        int hourLeft = hours % 24; // to get remaining hours

        System.out.println(days +" day and "+hourLeft+" hours" );
    }
}

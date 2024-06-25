package day_07_nested_if_and_if_else_statements;

public class IfElseIfPractice2 {

    public static void main(String[] args) {
        // The marks obtained by a student in 3 different subjects are input by the user.
        // Your program should calculate the average of subjects.
        // The student gets a grade as per the following rules:
        // Assume the average score does exceed 100


        int history = 619;
        int geography = 818;
        int math = 810;
        int totalScore = history+geography+math; // to get the total score
        int average =  totalScore / 3;

        char grade =0;

        if ( average >=90 && average <=100){
            grade = 'A';
        }
        else if(average >=80 && average <90){
            grade = 'B';
        }
        else if (average >=70 && average <80){
            grade = 'C';
        }
        else if (average >=60 && average <=69){
            grade = 'D';
        }
        else{ // Assuming the average does not exceed 100, or it is 0
            grade = 'F';
        }
//        else if (average >=1 && average <=59){ // if you still want to check the average
//            grade = 'F';
//        }



        System.out.println("Total score: "+totalScore);
        System.out.println("Average is: "+average);
        System.out.println("Grade is: "+grade);


    }
}

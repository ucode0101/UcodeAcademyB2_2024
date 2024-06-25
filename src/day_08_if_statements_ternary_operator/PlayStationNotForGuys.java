package day_08_if_statements_ternary_operator;

public class PlayStationNotForGuys {
    public static void main(String[] args) {
        // Write a program to check if the user is eligible to buy a PlayStation
       // Pre condition the user must be at least 18 years old, and the user must be Female

        int userAge = 23;
        String gender = "female";
        String play ="";

        if (userAge >=18){

            // using ternary
           // play = (gender == "female") ? "Go and play some PlayStation" : "Playstation is not for you";

            // using if else
            if (gender == "female"){
                play = "Go and play some PlayStation";
            }
            else {
                play = "PlayStation is not for you";
            }
        }
        else {
            play = "You should be at least  18 years old";
        }
        System.out.println(play);


    }
}

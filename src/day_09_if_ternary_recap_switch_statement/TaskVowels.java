package day_09_if_ternary_recap_switch_statement;

public class TaskVowels {

    public static void main(String[] args) {
        // 5: Write a program to check if a character is a vowel or consonant. Return "vowel"
        // if the character is a vowel (a, e, i, o, u), and "consonant" otherwise.

        // Vowels ->  a, e, i, o, u,

        char ch = 'g';
        String result = "";

        if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'){

            result = "vowel";
        }
        else {
            result = "consonant";
        }
        System.out.println(result);

        System.out.println("========================");

        // with ternary operator
        String result2 = (ch == 'a'||ch=='e'||ch=='i'||ch=='o'||ch=='u') ? "vowel" : "consonant";
        System.out.println(result2);
    }
}

package day_16_nested_for_while_loop_intro;

public class LoopPractice {
    public static void main(String[] args) {

        int i=0;
        for ( ;i < 10; i++){
                i++;

        }


        // sum of numbers from string
        String str = "1j3a3v855a";
        int sum =0;

        // 0-9 in ASCII is represented 48-57
        for (int j=0; j<str.length(); j++){
            if (str.charAt(j) >=48 && str.charAt(j) <=57){
                sum += str.charAt(j) - 48;
            }
        }

        System.out.println(sum);
    }
}

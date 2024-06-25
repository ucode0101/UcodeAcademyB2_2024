package day_07_nested_if_and_if_else_statements;

public class WarmUpTask2 {
    public static void main(String[] args) {
        int numberOfWatermelon = 40;
        boolean lotsOfWatermelon = false;

        if (numberOfWatermelon >=20){
            System.out.println("I have more than 20 watermelon");
            lotsOfWatermelon = true;
        }

        if (lotsOfWatermelon){ // this means -> lotsOfWatermelon == true
            System.out.println("Good Job");
        }

        if (lotsOfWatermelon == false){
            System.out.println("I need more Watermelon");
        }
    }
}

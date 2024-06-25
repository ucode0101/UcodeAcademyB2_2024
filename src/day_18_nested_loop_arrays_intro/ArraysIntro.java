package day_18_nested_loop_arrays_intro;

public class ArraysIntro {

    public static void main(String[] args) {

        int score1 = 10;
        int score2 = 20;
        int score3 = 44;
        int score4 = 50;

        int score5;
        score5 = 80;

        // declare an Array
        int [] allScores;

        // instantiate
        allScores = new int[4];

        // second way declare and instantiate in the same line
        int [] numbers = new int[5];


        // Adding value/elements into Array
        allScores[0] = 50;
        allScores[1] = 60;
        allScores[2] = 79;
        allScores[3] = 100;

        System.out.println(allScores[0]);
        System.out.println(allScores[1]);
        System.out.println(allScores[2]);
        System.out.println(allScores[3]);


        System.out.println("==================");

        byte [] byteArray = new byte[5];
        short [] shortArray = new short[6];
        int [] intArray = new int[4];
        long [] longArray = new long[10];
        float [] floatArray = new float[21];
        double [] doubleArray = new double[9];
        char [] charArray = new char[11];
        boolean [] booleanArray = new boolean[7];
        String [] stringArray = new String[12];

        byteArray[1] = 1;
        shortArray[0] = 4;
        intArray[0] = 10;
        longArray[3] = 19;
        floatArray[2] = 22;
        doubleArray[2] = 55;
        charArray[0] = 'a';
        booleanArray[0] = true;
        stringArray[0] = "java";

        System.out.println(doubleArray[3]);
        System.out.println(stringArray[4]);
        System.out.println(charArray[2]);
        System.out.println(longArray[0]);
        System.out.println(floatArray[0]);
        System.out.println(booleanArray[1]);

        System.out.println("=========================");
        // find the length / the number of elements in an Array

        int lengthOfArray = intArray.length;
        System.out.println(lengthOfArray);


    }
}

package day_02_variables_command_line;

public class Variables {

    public static void main(String[] args) {

        // declare multi variables (a container, so we can store some data in it)
        byte myByte;

        short myShort;
        int myInt;
        long myLong;
        float myFloat;
        double myDouble;
        char myChar;
        boolean myBoolean;
        String myString;

        // Assign values to variables (store some data/information in our containers)
        myByte = 10;
        myShort = -30;
        myInt = 190;
        myLong = 910000;
        myFloat = 55.787f; // we use F or f to let java know it is a float
        myDouble = 8984.1111;
        myChar = 'a'; // we can store number, character or special character in it as long as it is in single quote ''
        myBoolean = false;
        myString = "Java 204 ^&2rtut"; // we can store anything in String variable and it takes a string



        // print each variable

        System.out.println(myByte);
        System.out.println(myShort);

        System.out.println(myInt);
        System.out.println(myLong);
        System.out.println(myFloat);
        System.out.println(myDouble);
        System.out.println(myChar);
        System.out.println(myBoolean);
        System.out.println(myString);

        System.out.println("===================================");

        // assign new value to existing variable
        myByte = 19;
        myShort = 44;
        myInt = 90;
        myBoolean = true;
        // you can assign new value to any existing variables

        System.out.println(myByte);
        System.out.println(myShort);
        System.out.println(myInt);
        System.out.println(myBoolean);
















    }

}

package day_45_recap;

import day_40_constructors_access_modifiers.ConstructorAndBlocks;

public class BlocksAndConstructors {

    public String name;

    public BlocksAndConstructors(){
        System.out.println("Default Constructor");
    }

    {
        name = "Selenium";
        System.out.println("Instance Block");
    }

    static {
        System.out.println("Static block");
    }

    public static void main(String[] args) {

        System.out.println("========================================");


        new BlocksAndConstructors();
        BlocksAndConstructors obj = new BlocksAndConstructors();


    }

}

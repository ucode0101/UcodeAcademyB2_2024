package day_40_constructors_access_modifiers;

public class ConstructorAndBlocks {

    static {
        System.out.println("Static block");
    }

    public ConstructorAndBlocks(){
        System.out.println("Constructor");

    }
    {
        System.out.println("Instance block");

    }

    public  void testMethod(){
        System.out.println("Hello Test method");
    }

    public static void main(String[] args) {

        ConstructorAndBlocks obj = new ConstructorAndBlocks();
    }

}

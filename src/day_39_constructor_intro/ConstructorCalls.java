package day_39_constructor_intro;

public class ConstructorCalls {

    public ConstructorCalls(){
       // this(); It cannot call itself

        this("Java"); // it calls the constructor that has String parameter
        System.out.println("Hello"); // this will execute third

    }


    public ConstructorCalls(String str){
        this(50);
        System.out.println(str); // this will execute second

    }

    public ConstructorCalls(int num){
        System.out.println(num); // this executes first
    }

    public static void main(String[] args) {
        ConstructorCalls obj = new ConstructorCalls();
    }
}

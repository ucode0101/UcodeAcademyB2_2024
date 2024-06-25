package day_44_method_overriding.task_2;

public class A { // parent class / super class
    int i = 105;

    public A(double num){
        System.out.println(this.i);
        System.out.println(num);
    }

}

// The below class(class B) has nothing to do with the above class (class A)
// Even though they are in same file, they are two completely different classes
// Class A & Class B are two different classes in the same file
class B extends A{ // child class / subclass

    int i = 200;

    public B(){
        super(5.5); // calling super class's constructor
        System.out.println(super.i); // calling/accessing super class's instance variable
        System.out.println(this.i);  // calling/accessing current class's instance variable
    }


    public static void main(String[] args) {
        //A objA = new A(4.4);

        B objB = new B();
    }
}


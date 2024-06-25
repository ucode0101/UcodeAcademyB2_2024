package day_51_oop_polymorphism_continue;

public interface Interface1 {

    void someAction();
    int someMath(int a, int b);

}

class TestInterface implements Interface1{

    public void someAction(){
        for (int i =1; i<=10; i++){
            System.out.println(i);
        }
    }

    public int someMath(int a, int b){

        return a + b;
    }

    public static void main(String[] args) {

        Interface1 obj = new TestInterface();

       obj.someAction();

        System.out.println("==========================================");

       int a = obj.someMath(10, 15);
        System.out.println(a);
    }

}

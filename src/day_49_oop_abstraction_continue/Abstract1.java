package day_49_oop_abstraction_continue;

 public abstract class Abstract1 {

    public abstract void method1();
}

abstract class Abstract2 extends Abstract1{

     public abstract void method2();

}

abstract class Abstract3 extends Abstract1 {

     public abstract void method3();

}

class TestClass extends Abstract3{
     public void method1(){
         System.out.println("Method 1");
     }
     public void method2(){
         System.out.println("Method 2");
     }
     public void method3(){

     }


}
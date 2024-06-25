package day_48_oop_abstraction;

abstract public class Abstraction3 extends Test2 {

    abstract protected void test1();

    protected abstract void test2();


}


abstract class Abstraction4 extends Abstraction3{
    abstract public void test3();

}

class Test1 extends Abstraction4{
  public void test1(){
      System.out.println("Test 1");
  }
  public void test2(){
      System.out.println("Test 2");

  }
  public void test3(){
      System.out.println("Test 3");
  }

}

class Test2{

    public void method2(){
        System.out.println("Hello method 2");
    }
}
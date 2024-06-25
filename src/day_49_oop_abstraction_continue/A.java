package day_49_oop_abstraction_continue;

public interface A {
    void methodA();
    int methodA1();
    String methodString(String str);
}

interface B{
    void methodB();
}

interface C{
    void methodC();
}

class TestMultiImplements implements A, B, C {

    @Override
    public void methodA(){
        System.out.println("method a");
    }

    public int methodA1(){
        return  11;
    }

    public String methodString(String s){
        return s;
    }
    public void methodB(){
        System.out.println("method b");
    }
    public void methodC(){
        System.out.println("method c");
    }
}
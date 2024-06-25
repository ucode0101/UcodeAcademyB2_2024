package day_36_custom_class_and_object_continue;

public class InstanceMethod {

    int num;  // default value is 0
    String name; // default value is null
    public int sum(int a, int b){
        return a + b;
    }

    public int sum(int a, int b, int c){
        return a + b + c;
    }

    public void sum(int a, int b, int c, int d){
        System.out.println(a+b+c+d);
    }



}

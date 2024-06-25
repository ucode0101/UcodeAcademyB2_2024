package day_51_oop_polymorphism_continue;

public class Encapsulation {

    private String name;
    private int age;
    private static String ssn = "111-11-1111";

    public String getSsn(){
        return ssn;
    }

    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }

    public void setAge(int age){
        this.age = age;
    }

    public int getAge(){
        return  age;
    }



}


class TestEncapsulation{
    public static void main(String[] args) {
        Encapsulation obj = new Encapsulation();
        obj.setName("Java");
        obj.setAge(30);

        System.out.println(obj.getName());
        System.out.println(obj.getAge());
        System.out.println(obj.getSsn());

    }
}
package day_31_custom_class_and_object;

public class Dog {

    String name;
    int age;
    String color;
    String size;

    public void setDogInfo(String dogName, int dogAge, String dogColor, String dogSize){

        name = dogName;
        age = dogAge;
        color = dogColor;
        size = dogSize;

    }

    public void getDogInfo(){
        System.out.println(name+" "+age+" "+color+" "+size);

    }
    // overriding toString method, so we can directly print object/instance
    public String toString(){
        return name+" "+age+" "+color+" "+size;
    }

    public void eat(){
        System.out.println(name+" is eating");
    }

    public void bark(){
        System.out.println(name+" is barking");
    }


}

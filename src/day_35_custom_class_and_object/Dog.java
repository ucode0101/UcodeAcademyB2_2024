package day_35_custom_class_and_object;

public class Dog {

    // instance variables are declared in the class and outside of method
    // Instance variables are also known as fields
    String name;
    int age;
    String color;
    String size;
    String height;
    char gender;
    int abc;

    public void getInfo(){
        System.out.println("Name: "+ name+" Age:"+age+" Color: "+color+" Size: "+size);
    }

    public void setInfo(String dogName, int dogAge, String dogColor, String dogSize){
        name = dogName;
        age = dogAge;
        color = dogColor;
        size = dogSize;
    }

    public void eat(){
        System.out.println(name+" is eating");
    }

    public void bark(){
        System.out.println(name+" is barking");
    }

    // Overriding toString method, so we can directly print the object/instance
    public String toString(){

        return  "Name: "+ name+" Age:"+age+" Color: "+color+" Size: "+size;
    }

}

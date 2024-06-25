package day_31_custom_class_and_object;

public class Person {

    String firstName;
    String lastName;
    String gender;
    int age;
    double height;
    String hairColor;

    public void speak(){
        System.out.println(firstName+" "+lastName+" is");
    }
    public void eat(){
        System.out.println(firstName+" "+lastName+" is eating");
    }
    public void study(){
        System.out.println(firstName+" "+lastName+" is studying Java");
    }
    public void run(){
        System.out.println(firstName+" "+lastName+" is running");
    }

    public void sleep(){
        System.out.println(firstName+" "+lastName+" is sleeping");
    }


    public void setPersonInfo(String fName, String lName, String pGender, int pAge, double pHeight, String pHairColor){
        firstName = fName;
        lastName = lName;
        gender = pGender;
        age = pAge;
        height = pHeight;
        hairColor = pHairColor;
    }

    public void getPersonInfo(){
        System.out.println(firstName);
        System.out.println(lastName);
        System.out.println(gender);
        System.out.println(age);
        System.out.println(height);
        System.out.println(hairColor);
    }

//    public String toString(){
//        return firstName+"\n"+lastName+"\n"+gender+"\n"+age+"\n"+height+"\n"+hairColor;
//    }

}

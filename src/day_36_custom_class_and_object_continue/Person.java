package day_36_custom_class_and_object_continue;

public class Person {

    String firstName;
    String lastName;
    int age;
    String gender;

    public void setPersonInfo(String firstName, String lastName, int age, String gender){
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.gender = gender;
    }


    public String toString(){
        return "First Name: "+ firstName+" Last Name: "+lastName+ " Age: "+ age+" Gender: "+gender;
    }

    public void eat(){

        System.out.println(firstName+" "+lastName+" is eating");
        //getPersonInfo();

    }

    public void getPersonInfo(){
        System.out.println(firstName+" "+lastName+" "+ age+" "+ gender);
    }

}

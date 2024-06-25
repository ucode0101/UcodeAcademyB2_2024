package day_41_review_and_oop_encapsulation;

public class Constructor {
    private String firstName;
    private String lastName;
    private int age;
    private long ssn;

    // this constructor prevents creating an object from this class outside, of its own class
    private Constructor(){

    }
    public Constructor(String firstName, String lastName, int age, long ssn){
        this.firstName = firstName;
        this.lastName= lastName;
        this.age = age;
        this.ssn = ssn;
    }

//    public String toString(){
//        return  firstName+" "+ lastName+" "+ age+" "+ ssn;
//    }


}

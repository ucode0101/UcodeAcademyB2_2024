package day_41_review_and_oop_encapsulation;

public class Encapsulation2 {
    private String name;
    private String email;
    private long ssn;

    public Encapsulation2(String name, String email, long ssn){
        this.name = name;
        this.email = email;
        this.ssn = ssn;
    }

    public String getName(){
        return name;
    }
    public String getEmail(){
        return email;
    }
    public long getSsn(){
        return ssn;
    }
}

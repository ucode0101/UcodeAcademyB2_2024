package day_45_recap;

public class Encapsulation {


    private String name;
    private long ssn;

    // we use this constructor instead of setters
//    public Encapsulation(String name, long ssn){
//        this.name = name;
//        this.ssn = ssn;
//    }

    // can be replaced with constructor
    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }

    // can be replaced with constructor
    public void setSsn(long ssn){
        this.ssn = ssn;
    }
    public long getSsn(){
        return ssn;
    }
}

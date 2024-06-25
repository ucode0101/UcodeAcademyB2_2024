package day_39_constructor_intro;

public class Employee {

    String name; // field that belongs to object
    String jobTitle;
    static String companyName = "Google";

    public void setInfo(String name, String jobTitle){
        this.name = name;
        this.jobTitle = jobTitle;
    }

    public void getEmployeeInfo(){
        System.out.println(name+" "+ jobTitle+" "+companyName);
    }

}

package day_43_oop_inheritance_continue.task;

public class Employee {

    protected String name;
    protected double salary;
    protected long id;
    protected String jobTitle;

    // this toString method can be used in any class that inherits this class
    public String toString(){
        return "Name: "+name+"\nSalary: "+salary+"\nID: "+id+"\nJob Title: "+jobTitle;
    }
}

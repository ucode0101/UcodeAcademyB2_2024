package day_43_oop_inheritance_continue.task;

public class BusinessAnalyst extends Employee {
    /* All these inherited from Employee class:
    protected String name;
    protected double salary;
    protected long id;
    protected String jobTitle;
     */

    public BusinessAnalyst(String name, double salary, long id, String jobTitle){
        this.name = name;
        this.salary = salary;
        this.id = id;
        this.jobTitle = jobTitle;
    }

    public void writeRequirement(){
        System.out.println(name+ " is writing requirements");
    }
}

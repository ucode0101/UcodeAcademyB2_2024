package day_43_oop_inheritance_continue.task;

public class EmployeeObject {
    public static void main(String[] args) {
        Developer dev1 = new Developer("Mike Smith", 230000,11111, "Developer");
        System.out.println(dev1);
        dev1.coding();

        System.out.println("=======================================================");

        BusinessAnalyst analyst1 = new BusinessAnalyst("Sara Jackson",234500,22222,"Sr BA");

        System.out.println(analyst1);
        analyst1.writeRequirement();

        System.out.println("=========================================================");

        Tester tester1 = new Tester("John Smith", 185400, 33333, "SDET");
        System.out.println(tester1);
        tester1.testing();


    }
}

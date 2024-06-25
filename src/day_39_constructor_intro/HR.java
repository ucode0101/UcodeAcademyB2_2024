package day_39_constructor_intro;

public class HR {

    static Employee employee1 = new Employee();
    static Employee employee2 = new Employee();
    static Employee employee3 = new Employee();


    static {
        employee1.setInfo("James Bond","SDET");
        employee2.setInfo("Mark James","Sr QA Engineer");
        employee3.setInfo("Sara Jackson","Developer");
    }


    public static void main(String[] args) {
//       Employee employee1 = new Employee();
//       employee1.setInfo("James Bond","Developer");
//       employee1.getEmployeeInfo();
        employee1.getEmployeeInfo();
        employee2.getEmployeeInfo();
        employee3.getEmployeeInfo();



    }
}

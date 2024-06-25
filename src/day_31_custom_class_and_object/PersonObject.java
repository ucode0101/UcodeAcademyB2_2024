package day_31_custom_class_and_object;

public class PersonObject {
    public static void main(String[] args) {

        Person person1 = new Person();

        person1.setPersonInfo("Sara","Jackson","Female",38, 5.5, "Black");
        person1.getPersonInfo();

        System.out.println("==============================================");

        Person person2 = new Person();

        person2.setPersonInfo("Mike","Smith","Male",44, 5.7, "Brown");
        person2.getPersonInfo();

        System.out.println("==============================================");

        Person person3 = new Person();

        person3.setPersonInfo("Jake","Michael", "Male", 39, 5.8, "Black");
        person3.getPersonInfo();

        System.out.println("=======================================================");

        Person [] people = {person1,person2,person3};





        //System.out.println(Arrays.toString(people));





    }

}

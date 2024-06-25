package day_50_oop_polymorphism_intro;

public class ReferenceTypeDecide {

    public String name1 = "java";
}


class TestReference extends ReferenceTypeDecide{


    public String name2 = "Selenium";

    public static void main(String[] args) {

        TestReference obj1 = new TestReference();

        System.out.println(obj1.name1);
        System.out.println(obj1.name2);

        ReferenceTypeDecide obj2 = new TestReference();

        //System.out.println(obj2.name2); // cannot access instance variable in the child

        ReferenceTypeDecide obj3 = new ReferenceTypeDecide();
        //System.out.println(obj3.name2); // cannot access instance variable in the child
    }
}
package day_43_oop_inheritance_continue;

public class TestData extends Data{

    public void testSuperKeyword(){
        System.out.println(super.str);
    }

    public static void main(String[] args) {
        System.out.println(TestData.publicData);
        System.out.println(TestData.protectedData);
        System.out.println(TestData.defaultData);
        System.out.println(TestData.getPrivateData());

        // if you want to call/access instance methods/variable without creating an object
        //new TestData().testSuperKeyword();

        TestData obj = new TestData();
        obj.testSuperKeyword();

    }
}

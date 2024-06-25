package day_40_constructors_access_modifiers;

public class TestDefaultProtectedAccessModifier {
    public static void main(String[] args) {
        AccessModifiers object = new AccessModifiers();
        object.name1 = "java"; // name1 -> public access modifier
        object.name2 = "test"; // name2 -> default access modifier
        object.name3 = "selenium"; // name3 -> protected access modifier

        object.method1(); // method()1 -> public access modifier
        object.method2(); // method()2 -> default access modifier
        object.method3(); // method()1 -> protected access modifier

    }
}

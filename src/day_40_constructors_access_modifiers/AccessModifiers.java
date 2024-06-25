package day_40_constructors_access_modifiers;

 public class AccessModifiers {

     public String name1; // this instance variable can be accessed from any package within the project

     String name2; // this instance variable has default access modifier and can be accessed within this package only

     protected String name3; // this instance variable has protected access modifier and can be accessed withing this package only
                             // but it can be inherited from any package within the project

     private String name4; // this instance variable has private access modifier, and it can be accessed from class only


     public void method1(){ // this method can be called/accessed from any package within the project

     }

     void method2(){ // this method can be accessed/called within this package only

     }
     protected void method3(){ // this method can be accessed/called within this package,
                               // but it can be inherited from any package
     }
     private void method4(){ // this method can be accessed/called within this class only

     }

     // known as inner/nested class
        public class Class1{ // Class with public access modifier

        }

     // known as inner/nested class
        class Class2{  // Class with default access modifier

        }

     // known as inner/nested class
        protected class Class3{ // Class with protected access modifier

        }

        private class Class4{ // Class with private access modifier

        }

     public static void main(String[] args) {

         AccessModifiers object = new AccessModifiers();
         object.name1 = "java"; // name1 -> public access modifier
         object.name2 = "test"; // name2 -> default access modifier
         object.name3 = "selenium"; // name3 -> protected access modifier
         object.name4 = "API"; // name4 -> private access modifier

         object.method1(); // method()1 -> public access modifier
         object.method2(); // method()2 -> default access modifier
         object.method3(); // method()3 -> protected access modifier
         object.method4(); // method() 4 -> private access modifier
     }
}

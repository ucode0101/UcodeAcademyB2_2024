package day_38_statics_continue_instance_block;

public class StaticClass {


    public static void main(String[] args) {
        System.out.println("Main class");

//      InnerClass1.InnerClass1InnerClass obj = new InnerClass1.InnerClass1InnerClass();



    }

    public static class InnerClass1{

        public static class InnerClass1InnerClass{
            public static void main(String[] args) {
                System.out.println("Hello InnerClass1InnerClass");
            }
        }

        public static void main(String[] args) {
            System.out.println("Hello InnerClass1");
        }
    }

    public static class InnerClass2{

        public static void main(String[] args) {
            System.out.println("Hello InnerClass2");
        }
    }
}

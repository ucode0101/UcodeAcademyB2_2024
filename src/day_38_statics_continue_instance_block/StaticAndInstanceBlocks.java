package day_38_statics_continue_instance_block;

public class StaticAndInstanceBlocks {

    String name;
    static String name2;


    {
        System.out.println("I am instance block"); // 5 times
        this.name = "Java"; // 5 times
        test1(); // 5 times
        test1(); // 5 times
        name2 = "API"; // 5 times
    }

    public void test1(){
        System.out.println("Instance method");
    }

    public static void test2(){
        System.out.println("Static method");
    }

    static {
        System.out.println("I only run one time before everything");
    }


    public static void main(String[] args) {

        StaticAndInstanceBlocks obj1 = new StaticAndInstanceBlocks();
        StaticAndInstanceBlocks obj2 = new StaticAndInstanceBlocks();
        StaticAndInstanceBlocks obj3 = new StaticAndInstanceBlocks();
        StaticAndInstanceBlocks obj4 = new StaticAndInstanceBlocks();
        new StaticAndInstanceBlocks();

    }


}

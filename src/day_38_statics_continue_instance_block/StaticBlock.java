package day_38_statics_continue_instance_block;

public class StaticBlock {

    static String name;
    static int id;


    static {
        name = "java";
        id = 123;
    }

    public static void main(String[] args) {

        System.out.println(StaticBlock.name);
        System.out.println(StaticBlock.id);

    }


}

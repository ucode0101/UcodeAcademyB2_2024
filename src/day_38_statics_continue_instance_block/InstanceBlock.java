package day_38_statics_continue_instance_block;

public class InstanceBlock {
    public String str;
    public int number;




    {
        this.str = "Selenium";
        this.number = 444;
    }


}

class TestInstanceBlock{
    public static void main(String[] args) {
        InstanceBlock obj = new InstanceBlock();
        System.out.println(obj.str);
        System.out.println(obj.number);
    }
}
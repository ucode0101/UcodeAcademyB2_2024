package day_32_custom_class_and_object_continue;

public class InstanceMethodTest {
    public static void main(String[] args) {

        InstanceMethods object = new InstanceMethods();
        System.out.println(object.sum(5, 5));

        int s = object.sum(5,5,5);

        System.out.println(s);


        object.num = 120;
        System.out.println(object.num);
    }
}

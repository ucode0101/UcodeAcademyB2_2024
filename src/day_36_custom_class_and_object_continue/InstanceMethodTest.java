package day_36_custom_class_and_object_continue;

public class InstanceMethodTest {

    public static void main(String[] args) {

        InstanceMethod object = new InstanceMethod();

        System.out.println(object.sum(4, 5));

        int x = object.sum(5,5,5);

        System.out.println(x);

        object.sum(6,6,6,6);

        object.num = 10;
        object.name = "Name";

        System.out.println(object.num);
        System.out.println(object.name);

    }
}

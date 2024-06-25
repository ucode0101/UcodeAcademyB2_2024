package day_22_arrays_loops_string_builder_buffer_intro;

public class StringValueOfMethod {
    public static void main(String[] args) {
        String str = "java";

        // convert boolean toString using String.valueOf() method
        str += String.valueOf(true);
        System.out.println(str);

        // convert int/number toString using String.valueOf() method
        str += String.valueOf(99);
        System.out.println(str);


    }
}

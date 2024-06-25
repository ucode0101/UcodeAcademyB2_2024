package day_42_oop_encapsulation_inheritance_intro;

import java.util.ArrayList;
import java.util.Arrays;

public class EncapsulationTest {
    public static void main(String[] args) {

        // we create ArrayList and stored multiple names in it
        ArrayList<String> allNames = new ArrayList<>();
        allNames.addAll(Arrays.asList("Java","Test","Sara","Mike"));

        Encapsulation object = new Encapsulation();

        object.setNameList(allNames);

        System.out.println(object.getNameList());

        System.out.println("==================================");

        for (String eachName : object.getNameList()){

            System.out.println(eachName);
        }
    }
}

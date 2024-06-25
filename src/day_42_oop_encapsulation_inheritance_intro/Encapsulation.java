package day_42_oop_encapsulation_inheritance_intro;

import java.util.ArrayList;

public class Encapsulation {

    // this is encapsulated/private ArrayList<String>
    private ArrayList<String> nameList;

    // This is instance method, we call setter in Encapsulation
    public void setNameList(ArrayList<String> nameList){
        this.nameList = nameList;
    }

    // this is instance method, we call getter in Encapsulation
    public ArrayList<String> getNameList(){
        return nameList;
    }

}

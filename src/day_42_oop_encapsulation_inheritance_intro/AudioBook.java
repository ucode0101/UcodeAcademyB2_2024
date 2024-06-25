package day_42_oop_encapsulation_inheritance_intro;

public class AudioBook extends Book {
     /*
     Inherited these from Parent class - Book
     String title;
     String type;
     String author;
     double price;
     */

    // length narrator listen()
    String length;
    String narrator;

    public void listen(){
        System.out.println("Listening "+title);
    }

    public String toString(){
        return title+"\n"+type+"\n"+author+"\n"+price+"\n"+length+"\n"+narrator;
    }
}

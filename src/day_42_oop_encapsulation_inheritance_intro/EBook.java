package day_42_oop_encapsulation_inheritance_intro;

public class EBook extends Book {

    /*
     Inherited these from Parent class - Book
      String title;
     String type;
     String author;
     double price;
     */

    //size
    //pages readbook()
    String size;
    int pages;

    public void readBook(){
        System.out.println("Reading "+ title+" Author "+author);
    }

    public String toString(){
        return title+"\n"+author+"\n"+type+"\n"+price+"\n"+size+"\n"+pages;
    }


}

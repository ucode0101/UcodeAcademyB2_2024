package day_42_oop_encapsulation_inheritance_intro;

public class BookObject {
    public static void main(String[] args) {

        EBook book1 = new EBook();
        book1.title ="Born Crime";
        book1.author = "Trevor Noah";
        book1.type = "eBook";
        book1.price = 19.95;
        book1.size = "31MB";
        book1.pages = 444;

        System.out.println(book1);

        System.out.println("========================================");
        book1.readBook();


        System.out.println("=========================================");

        AudioBook book2 = new AudioBook();

        book2.title = "How to be successful";
        book2.author = "Carnegie";
        book2.type = "Audio book";
        book2.narrator = "Carnegie";
        book2.price = 11.20;
        book2.length = "5 hours and 40 minutes";

        System.out.println(book2);

        System.out.println("======================================");

        book2.listen();


    }
}

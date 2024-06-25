package day_41_review_and_oop_encapsulation;

import javax.crypto.spec.PSource;

public class ThisKeywordsReview {

    public String str = "Java";

    public String name;
    public static String someName = "some value";

    public void testMethod1(){
        System.out.println(this.name);
        System.out.println( this.str);

        System.out.println(someName);
    }
    public void testMethod2(){
        this.testMethod1();

    }

    public String testMethod3(){
        return this.str;
    }

    public void setName(String name){
        this.name = name;
    }
    public static void testMethod4(){
       // this.name;
    }

    public ThisKeywordsReview(){
        this(59);
        System.out.println(this.name);
        this.testMethod3();
        testMethod4();
    }
    public ThisKeywordsReview(int num){
        System.out.println(num);
    }



    public static void main(String[] args) {
        ThisKeywordsReview obj = new ThisKeywordsReview();

        obj.testMethod2();
        System.out.println(obj.testMethod3());
        obj.setName("API");
        System.out.println(obj.name);

    }

}

package day_47_exceptions_continue;

public class FinalVariables {

    // this is Constant variable/final variable, cannot be changed or modified
    final public static String MONDAY = "Monday";

    // this is instance variable, it can be changed/modified
    public static String monday = "monday";

    final public static int DAYS_IN_WEEK = 7;

    // final Array, we can change/modify individual elements, but not whole array
    final static String []  DAYS_OF_THE_WEEK = {"Mon","Tue","Wed","Thur","Fri","Sat","Sun"};

    public static void main(String[] args) {

        //MONDAY = "Mon"; // it cannot be changed/modified it is final

       // monday = "Mon"; // it can be changed/modified it is Not final

        //DAYS_IN_WEEK = 6; // it cannot be changed/modified it is final

        //DAYS_OF_THE_WEEK[0] = "Test"; // we can change/modify individual elements


       // DAYS_OF_THE_WEEK = new String[] {"java","test"}; // we cannot change the whole array

    }
}

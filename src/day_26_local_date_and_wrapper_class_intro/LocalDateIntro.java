package day_26_local_date_and_wrapper_class_intro;

import java.time.LocalDate;

public class LocalDateIntro {
    public static void main(String[] args) {

        // Creating local date where we pass date manually
        LocalDate date1 = LocalDate.of(1992, 9, 23);
        System.out.println(date1);

        LocalDate birthday = LocalDate.of(1999,3,12);

        System.out.println(birthday);


        String str = date1.toString(); // toString() converts LocalDate type to String
        System.out.println(str);

        // isAfter()
        boolean b1 = birthday.isAfter(date1);
        System.out.println(b1);

        // isBefore()
        boolean b2 = birthday.isBefore(date1);
        System.out.println(b2);

        // isEqual()
        boolean b3 = birthday.isEqual(date1);
        System.out.println(b3);

        // isLeapYear()
        boolean b4 = date1.isLeapYear();
        System.out.println(b4);

        System.out.println("================================");

        LocalDate date2 = LocalDate.now();

        System.out.println(date2);
        // replace '-' with '/'
        String str2 = date2.toString().replace("-","/");
        //str2 = str2.replace("-","/");

        System.out.println(str2);

    }
}

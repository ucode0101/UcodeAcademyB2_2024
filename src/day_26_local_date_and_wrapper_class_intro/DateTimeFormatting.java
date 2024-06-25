package day_26_local_date_and_wrapper_class_intro;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class DateTimeFormatting {

    public static void main(String[] args) {

        DateTimeFormatter formatDate = DateTimeFormatter.ofPattern("MM, dd, yyyy");

        LocalDate currentDate = LocalDate.now();
        System.out.println(currentDate);

        System.out.println( formatDate.format(currentDate));

        System.out.println("====================================================");

        DateTimeFormatter df2 = DateTimeFormatter.ofPattern("MM/dd/yyyy");

        LocalDate date3 = LocalDate.now();


      // parse takes string and format to parse it to date
       date3 = LocalDate.parse(df2.format(date3),df2);


        System.out.println(date3);





    }
}

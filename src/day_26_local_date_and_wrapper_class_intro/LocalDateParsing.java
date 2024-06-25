package day_26_local_date_and_wrapper_class_intro;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class LocalDateParsing {

    public static void main(String[] args) {
        String dateStr = "2021-08-12"; // when we pass date in a string format, it has to match localDate default format
        // yyyy-mm-dd

        LocalDate date1 = LocalDate.parse(dateStr);


        System.out.println(date1);

        String dateStr2 = "09/12/1999";
        DateTimeFormatter customFormat = DateTimeFormatter.ofPattern("MM/dd/yyyy");

        LocalDate date2 = LocalDate.parse(dateStr2,customFormat);

        System.out.println(date2);








    }
}

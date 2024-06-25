package day_26_local_date_and_wrapper_class_intro;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class LocalDateTimeIntro {
    public static void main(String[] args) {

        LocalDateTime localDateTime = LocalDateTime.now();

        System.out.println(localDateTime);

        LocalDateTime localDateTime2 = LocalDateTime.of(2022,11,12, 15,23,44);
        System.out.println(localDateTime2);

        System.out.println("===============================");

        LocalDate currentLocalDate = LocalDate.now();
        LocalTime currentLocalTime = LocalTime.now();

        LocalDateTime localDateTime3 = LocalDateTime.of(currentLocalDate, currentLocalTime);

        System.out.println(localDateTime3);





    }
}

package day_26_local_date_and_wrapper_class_intro;

import java.time.LocalTime;

public class LocalTimeClassIntro {
    public static void main(String[] args) {

        LocalTime localTime = LocalTime.now();
        System.out.println(localTime);

        LocalTime time1 = LocalTime.of(17,23,33);
        System.out.println(time1);



    }
}

package day_56_map_continue_enum_intro;

import javax.crypto.spec.PSource;

public enum EnumIntro {

   MONDAY,
    TUESDAY,
    WEDNESDAY,
    THURSDAY,
    FRIDAY,
    SATURDAY,
    SUNDAY

}


class TestEnum {

    public static void main(String[] args) {

        EnumIntro obj = EnumIntro.MONDAY;

        System.out.println(obj);

        System.out.println("=============================");

        System.out.println(EnumIntro.MONDAY);
        System.out.println(EnumIntro.TUESDAY);

        System.out.println(EnumIntro.THURSDAY);
        System.out.println(EnumIntro.SUNDAY);

        System.out.println("============================");

        String dayOfWeek = String.valueOf(EnumIntro.WEDNESDAY);

        System.out.println(dayOfWeek);

        System.out.println("==================================");

        // loop through Enum and print each Constant/enum values

        for (EnumIntro each : EnumIntro.values() ){
            System.out.println(each);
        }

    }



}
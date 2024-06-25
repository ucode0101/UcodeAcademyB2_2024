package day_56_map_continue_enum_intro;

public enum EnumPractice {

    MONDAY,
    TUESDAY,
    WEDNESDAY,
    THURSDAY,
    FRIDAY,
    SATURDAY,
    SUNDAY


}

class EnumTest {

    public static void main(String[] args) {

        EnumPractice obj = EnumPractice.SUNDAY;

        // using updated switch statement
        switch (obj){

            case MONDAY, TUESDAY, WEDNESDAY,THURSDAY,FRIDAY -> System.out.println("Weekdays");
            case SATURDAY, SUNDAY-> System.out.println("Weekend");
        }

        switch (obj){
            case MONDAY:
                System.out.println("Weekdays");
            case TUESDAY:
                System.out.println("Weekday");

                // etc...
        }

        System.out.println("====================================");

        EnumPractice [] arr = EnumPractice.values();

        String str = String.valueOf(EnumPractice.valueOf("MONDAY"));
        System.out.println(str);

    }
}

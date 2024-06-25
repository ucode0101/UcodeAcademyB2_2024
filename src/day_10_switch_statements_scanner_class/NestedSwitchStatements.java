package day_10_switch_statements_scanner_class;

public class NestedSwitchStatements {
    public static void main(String[] args) {

        int num = 1;
        switch (num){
            case 1:

                switch (num){
                    case 1:
                        System.out.println("it is one");
                        break;
                        // the res of the case
                    default:
                        System.out.println("default");
                        break;
                }
                break;

            case 2:
                switch (num){
                    case 2 -> System.out.println("It is two");
                    default -> System.out.println("default");
                }
                break;

            default:
                System.out.println("default");

        }


    }
}

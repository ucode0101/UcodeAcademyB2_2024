package day_10_switch_statements_scanner_class;

public class SwitchMultipleStatementPerCase {

    public static void main(String[] args) {
        // how to run multiple lines of code if the case match/inside the case
        int num = 1;
        String str = "";
        switch (num){
            case 1:
                System.out.println("Hello 1");
                System.out.println("Hello 1 again");
                str = "One";
                break;
            case 2:
                System.out.println("Hello 2");
                System.out.println("Hello 2 again");
                System.out.println("Hello 2");
                System.out.println("Hello 2 again");
                str = "Two";
                break;
            default:
                System.out.println("Hello default");
                System.out.println("Hello default");
                System.out.println("Hello default");
                System.out.println("Hello default");
                str = "default";
                break;
        }

        System.out.println("==================================");
        System.out.println(str);

        System.out.println("===============================");
        // with updated switch statement

        String str2 = switch (num){
            case 1 -> {
                System.out.println("Hello 1");
                System.out.println("Hello 1 again");
                yield "One";
            }
            case 2 -> {
                System.out.println("Hello 2");
                System.out.println("Hello 2 again");
                System.out.println("Hello 2");
                System.out.println("Hello 2 again");
                yield "Two";

            }
            default -> {
                System.out.println("Hello default");
                System.out.println("Hello default");
                System.out.println("Hello default");
                System.out.println("Hello default");
                yield "default";

            }

        };
        System.out.println(str2);
    }
}

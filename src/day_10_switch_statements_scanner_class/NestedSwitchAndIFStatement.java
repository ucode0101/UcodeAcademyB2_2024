package day_10_switch_statements_scanner_class;

public class NestedSwitchAndIFStatement {
    public static void main(String[] args) {

        String name = null;


        if (name !=null){

            switch (name){
                case "API":
                    System.out.println("API");
                    break;
                case "Selenium":
                    System.out.println("Selenium");
                    break;
                case "Java":
                    System.out.println("Java");
                    break;
                default:
                    System.out.println("Default");
                    break;
            }

        }

    }
}

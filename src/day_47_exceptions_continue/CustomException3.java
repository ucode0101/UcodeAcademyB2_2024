package day_47_exceptions_continue;
                                   // Unchecked Exception
public class CustomException3 extends RuntimeException{

    public CustomException3(){
        super("Java Time Exception");
    }

    public CustomException3(String str){
        super(str);
    }

    public static void main(String[] args) {
        throw new CustomException3();
        //throw new CustomException3("Fun Time Exception");
    }

}

                          // Checked Exception
class JavaException extends Exception{
    public JavaException(){
        super("Some Default message");
    }

    public JavaException(String message){
        super(message);
    }

  public static void main(String[] args) throws Exception {

        throw new JavaException("Hello custom exception class");

  }

}
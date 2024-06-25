package day_46_exceptions;

public class Browsers {

    protected void openBrowser(){
        System.out.println("Opening default browser");
    }

    public String toString(){
        return "";
    }
}

class ChromeBrowser extends Browsers{

    public void openBrowser(){
        System.out.println("Opening Chrome Browser...");
    }

    public static void main(String[] args) {
        ChromeBrowser chrome = new ChromeBrowser();
        chrome.openBrowser();
    }
}

class SafariBrowser extends Browsers{
    public void openBrowser(){
        System.out.println("Opening Safari browser...");
    }

    public static void main(String[] args) {
        SafariBrowser safari = new SafariBrowser();
        safari.openBrowser();
    }
}

class DefaultBrowser extends Browsers{

    public static void main(String[] args) {
        DefaultBrowser defaultBrowser = new DefaultBrowser();

        defaultBrowser.openBrowser();
    }
}
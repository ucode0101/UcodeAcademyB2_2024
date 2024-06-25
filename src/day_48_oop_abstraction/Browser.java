package day_48_oop_abstraction;

abstract public class Browser {
    abstract protected void openBrowser();
}


class Chrome extends Browser{
    public void openBrowser(){

        System.out.println("Opening chrome browser...");
    }

}

class Safari extends Browser{

    public void openBrowser(){
        System.out.println("Opening safari browser...");
    }
}

class Firefox extends Browser{
    public void openBrowser(){
        System.out.println("Opening firefox browser...");
    }
}

class Test{

    public static void main(String[] args) {

        Chrome chrome = new Chrome();
        chrome.openBrowser();

        Safari safari = new Safari();
        safari.openBrowser();

        Firefox firefox = new Firefox();
        firefox.openBrowser();

    }
}
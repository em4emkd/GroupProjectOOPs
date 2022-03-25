package com.syntax.groupproject;

public interface WebDriver {

    void open();
    void close();
    String getTitle();

}
interface RemoteWebDriver extends WebDriver{

    void navigate();


}
interface TakeScreenShot extends RemoteWebDriver {

    void getScreenShot();
}
class ChromeDriver implements RemoteWebDriver {

    @Override
    public void open() {

    }

    @Override
    public void close() {

    }

    @Override
    public String getTitle() {
        return null;
    }

    @Override
    public void navigate() {

    }
}

class FirefoxDriver implements RemoteWebDriver {

    @Override
    public void open() {

    }

    @Override
    public void close() {

    }

    @Override
    public String getTitle() {
        return null;
    }

    @Override
    public void navigate() {

    }
}
class SafariDriver implements RemoteWebDriver {

    @Override
    public void open() {

    }

    @Override
    public void close() {

    }

    @Override
    public String getTitle() {
        return null;
    }

    @Override
    public void navigate() {

    }
}
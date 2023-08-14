package com.juaracoding.drivers.strategies;

public class Firefox {
    public class Firefox implements DriverStrategy {
        @Override
        public WebDriver setStrategy() {
            String path = "D:\\MyTools\\geckodriver.exe";
            System.setProperty("webdriver.gecko.driver", "C:\\MyTools\\chromedriver.exe");
            WebDriver driver = new FirefoxDriver();
            return driver;
        }
}

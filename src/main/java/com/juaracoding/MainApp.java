package com.juaracoding;

import com.juaracoding.drivers.DriverSingleton;
import com.juaracoding.pages.LoginPage;

public class MainApp {
    static WebDriver driver;

    public static void main(String[] args) {
        DriverSingleton.getInstance("chrome");
        driver = DriverSingleton.getDriver();
        driver.get("https://shop.demoqa.com");

        LoginPage loginPage = new LoginPage();
        loginPage.login();
        System.out.println(loginPage.getTxtDashboard());
        System.out.println("Test Login");

        DriverSingleton.delay(3);
        DriverSingleton.closeObjectInstance();
    }
}
package com.juaracoding;

import com.juaracoding.drivers.DriverSingleton;
import com.juaracoding.pages.AddProductToCartPage;
import com.juaracoding.pages.LoginPage;
import org.openqa.selenium.WebDriver;

public class MainApp {
    static WebDriver driver;

    public static void main(String[] args) {
        DriverSingleton.getInstance("chrome");
        driver = DriverSingleton.getDriver();
        driver.get("https://shop.demoqa.com");

        LoginPage loginPage = new LoginPage();
        System.out.println("Tes Login Succes");
        loginPage.login("Admin", "admin123$");
        DriverSingleton.assertEqual(loginPage.getTextLoginSuccess(),"Hello");
        AddproductToCartPage addproductToCart = new AddProductToCartPage();
        System.out.println("Test Add Product To Cart Success");
        addproductToCart addToCartProduct();

        DriverSingleton.delay(3);
        DriverSingleton.closeObjectInstance();
    }
}
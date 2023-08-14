package com.juaracoding.pages;
import com.juaracoding.drivers.DriverSingleton;
import org.openqa.selenium.WebDriver;

import com.juaracoding.drivers.DriverSingleton;

public class LoginPage {
    private WebDriver driver;

    public LoginPage() {
        this.driver = DriverSingleton.getDriver();
        PageFactory.initElements(driver, this);
    }

    // Locator @FindBy

    @FindBy (xpath = "//@placeholder='Username']")
    WebElement username;
    @FindBy (xpath = "//@placeholder='Password']")
    WebElement password;
    @FindBy (xpath = "//button[contains(@class,'login-button')]")
    WebElement btnLogin;

    // Custom Method
    public void login(){
        username.sendKeys("Admin");
        password.sendKeys("admin123);
                btnLogin.click();
//        Select select = new select (username);
//        select.selectByValue("Red");
//        Actions actions = new Actions(driver);
//
//        actions.moveToElement(btnLogin).click())
    }
}

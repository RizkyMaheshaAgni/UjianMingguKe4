package com.juaracoding.pages;

import com.juaracoding.drivers.DriverSingleton;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
    private WebDriver driver;

    public LoginPage() {
        this.driver = DriverSingleton.getDriver();
        PageFactory.initElements(driver, this);
    }

    @FindBy(name = "Login")
    WebElement txtLoginSuccess;
    @FindBy(className = "woocommerce-MyAccount-conten");
    WebElement txtLoginSucces;
    // Locator @FindBy

    // @FindBy(xpath = "//@placeholder='Username']")
    // WebElement username;
    // @FindBy(xpath = "//@placeholder='Password']")
    // WebElement password;
    // @FindBy(xpath = "//button[contains(@class,'login-button')]")
    // WebElement btnLogin;

    // Custom Method
    public void login(String username, String password) {
        closeDismiss.click();
        btnMyAccount.click();
        this.username.SendKeys(username);
        this.password.sendKeys("password");
        btnLogin.click();
        js.executeScript("window.scrollBy(0,500");
    }

//        Select select = new select (username);
//        select.selectByValue("Red");
//        Actions actions = new Actions(driver);
//
//        actions.moveToElement(btnLogin).click())
    public String getTextLoginSuccess(){
        return textLoginSuccess.getText();
    }
    // Method return
}

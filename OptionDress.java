package com.juaracoding.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class OptionDress {
    @FindBy(xpath = "//select[@id='pa_color']")
    WebElement colorfit;

    @FindBy(xpath = "//select[@id='pa_size']");
    WebElement sizefit;

    @FindBy(xpath = "//button[normalize-space()='Add to cart']")
            WebElement btnCart;
    Select selectcolor = new Select(colorfit);
    selectcolor.selectByValue("Black");

    Select selectcolor = new Select(colorfit);
    selectcolor.selectByValue("Black");

    Actions action = new Actions(driver);
    action.moveToElement(btnCart).click().perform();

    System.out.println("Button Add Cart Success")
    }
}

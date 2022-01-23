package com.saucedemo.utilities;


import com.saucedemo.Pages.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;

public class Utility extends BasePage {

    public void clickOnElement(By by) {
        driver.findElement(by).click();
    }

    public static void inputText(By by, String text) {
        driver.findElement(by).sendKeys(text);
    }

    public String getTextFromElement(By by) {
        return driver.findElement(by).getText();

    }

    public void selectFromDropDown(By by, String text) {
        Select objSelect = new Select(driver.findElement(by));
        objSelect.selectByVisibleText(text);
    }

}

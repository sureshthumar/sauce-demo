package com.saucedemo.Pages;

import com.saucedemo.utilities.Utility;
import org.openqa.selenium.By;


public class YourCart extends Utility {

    By checkOutButton = By.id("checkout");

    public void clickOnCheckOutButton() {
        clickOnElement(checkOutButton);
    }
}

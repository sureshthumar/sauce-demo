package com.saucedemo.Pages;

import com.saucedemo.utilities.Utility;
import org.openqa.selenium.By;


public class HomePage extends Utility {

    By username = By.id("user-name");
    By password = By.name("password");
    By loginButton = By.id("login-button");

    public void loginToSwagLab() {
        inputText(username, "standard_user");
        inputText(password, "secret_sauce");
    }

    public void clickOnLoginButton() {
        clickOnElement(loginButton);
    }

}

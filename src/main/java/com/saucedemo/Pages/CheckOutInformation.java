package com.saucedemo.Pages;

import com.saucedemo.utilities.Utility;
import org.openqa.selenium.By;
;

public class CheckOutInformation extends Utility {
    By firstName = By.id("first-name");
    By lastName = By.name("lastName");
    By zipPostalCode = By.id("postal-code");
    By continueButton = By.id("continue");
    By finishButton = By.id("finish");
    By successMessage = By.xpath("//h2[normalize-space()='THANK YOU FOR YOUR ORDER']");

    public void enterCheckOutInformation() {
        inputText(firstName, "firstName");
        inputText(lastName, "lastName");
        inputText(zipPostalCode, "12345");
    }

    public void clickOnContinueButton() {
        clickOnElement(continueButton);
    }

    public void clickOnFinishButton() {
        clickOnElement(finishButton);
    }

    public String getThankYouMessage() {
        return getTextFromElement(successMessage);
    }

}

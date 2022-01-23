package com.saucedemo.cucumber.steps;


import com.saucedemo.Pages.*;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;

public class SauceDemoTestSteps extends BasePage {

    HomePage homePage = new HomePage();
    ProductPage productPage = new ProductPage();
    YourCart yourCart = new YourCart();
    CheckOutInformation checkOutInformation = new CheckOutInformation();

    @Given("user open saucedemo page")
    public void user_open_saucedemo_page() {
        openBrowser();
    }

    @Given("user login with credential {string} and {string}")
    public void user_login_with_credential_and(String string, String string2) {
        homePage.loginToSwagLab();

    }

    @Given("user click on Login button")
    public void user_click_on_login_button() {
        homePage.clickOnLoginButton();
    }


    @Given("user sort the products by Price \\(high to low)")
    public void user_sort_the_products_by_price_high_to_low() {
        productPage.selectProductPrice();
    }


    @Given("user select cheapest & costliest products to basket")
    public void user_select_cheapest_costliest_products_to_basket() {
        productPage.clickOnLowAndHighPriceAddToCartButton();

    }

    @Given("user open shopping cart")
    public void user_open_shopping_cart() {
        productPage.clickOnShoppingCartIcon();

    }

    @Given("user go to checkout")
    public void user_go_to_checkout() {
        yourCart.clickOnCheckOutButton();

    }

    @Given("user enter details {string}, {string} and {string}")
    public void user_enter_details_and(String string, String string2, String string3) {
        checkOutInformation.enterCheckOutInformation();

    }

    @Given("user click on continue button")
    public void user_click_on_continue_button() {
        checkOutInformation.clickOnContinueButton();

    }

    @Given("user click on finish button")
    public void user_click_on_finish_button() {
        checkOutInformation.clickOnFinishButton();

    }

    @Then("user should be able to see message {string}")
    public void user_should_be_able_to_see_message(String string) {
        Assert.assertEquals(string, checkOutInformation.getThankYouMessage());
        closeBrowser();
    }


}

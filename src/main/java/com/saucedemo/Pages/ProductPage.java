package com.saucedemo.Pages;

import com.saucedemo.utilities.Utility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;


public class ProductPage extends Utility {
    By filterIcon = By.className("select_container");
    By filterProducts = By.className("product_sort_container");
    By shoppingCartIcon = By.xpath("//a[@class='shopping_cart_link']");

    public void clickOnFilterIcon() {
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        clickOnElement(filterIcon);
    }

    public void selectProductPrice() {
        selectFromDropDown(filterProducts, "Price (high to low)");

    }

    public static void clickOnAddToCart(String price) {
        driver.findElement(By.xpath("//div[@class=\"inventory_item_price\"][contains(.,'" + price + "')]/following-sibling::button")).click();
    }


    public void clickOnLowAndHighPriceAddToCartButton() {

        List<WebElement> highToLow = driver.findElements(By.xpath("//div[@class=\"inventory_item_price\"]"));

        ArrayList<String> priceList = new ArrayList<>();

        for (WebElement p : highToLow) {

            priceList.add(p.getText());
        }
        clickOnAddToCart(priceList.get(0));

        clickOnAddToCart(priceList.get(priceList.size() - 1));
    }

    public void clickOnShoppingCartIcon() {
        clickOnElement(shoppingCartIcon);
    }


}

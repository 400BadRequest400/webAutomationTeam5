package SearshFasion;

import base.CommonAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Adidas extends CommonAPI {
    @FindBy(xpath = "//button[@id='gh-shop-a']")
    WebElement categories;
    @FindBy(xpath = "//a[contains(text(),'adidas')]")
    WebElement adidas;
    @FindBy(xpath = "//h3[@class='gh-sbc-parent']//a[contains(text(),'Fashion')]")
    WebElement fashion;
    @FindBy(xpath = "//a[contains(text(),'adidas Shoes for Men')]")
    WebElement adidasShoes;

    public void topbrandAdidas() {
        categories.click();
        fashion.click();
        adidas.click();
        sleepFor(2);
        adidasShoes.click();
        sleepFor(2);
    }
}
package SearshFasion;

import base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MensClothing extends CommonAPI {
    @FindBy(xpath = "//button[@id='gh-shop-a']")
    WebElement categories;

    @FindBy(xpath = "//h3[@class='gh-sbc-parent']//a[contains(text(),'Fashion')]")
    WebElement fashion;

    @FindBy(xpath = "//span[contains(text(),'')]")
    WebElement mens;

    @FindBy(xpath = "//a[contains(text(),'')]")
    WebElement Shopmens;

    public void CategoriesFshion1(){
        categories.click();
        sleepFor(2);
        fashion.click();
        sleepFor(2);
        mens.click();
        sleepFor(2);
        Shopmens.click();
        sleepFor(2);
    }
}

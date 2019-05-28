package SearshFasion;

import base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Health extends CommonAPI {
    @FindBy(xpath = "//button[@id='gh-shop-a']")
    WebElement categories;

    @FindBy(xpath = "//h3[@class='gh-sbc-parent']//a[contains(text(),'Fashion')]")
    WebElement fashion;

    @FindBy(xpath = "//span[contains(text(),'Health')]")
    WebElement health;

    @FindBy(xpath = "//a[contains(text(),'Shop Health')]")
    WebElement ShopHealth;

    public void CategoriesFshion(){
        categories.click();
        sleepFor(2);
        fashion.click();
        sleepFor(2);
        health.click();
        sleepFor(2);
        ShopHealth.click();
        sleepFor(2);
    }
}

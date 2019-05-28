package SearshFasion;

import base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Watches extends CommonAPI {
    @FindBy(xpath = "//button[@id='gh-shop-a']")
    WebElement categories;

    @FindBy(xpath = "//h3[@class='gh-sbc-parent']//a[contains(text(),'Fashion')]")
    WebElement fashion;

    @FindBy(xpath = "//span[contains(text(),'Watches')]")
    WebElement watches;

    @FindBy(xpath = "//a[contains(text(),'Shop Watches')]")
    WebElement ShopWatches;

    public void CategoriesFshion(){
        categories.click();
        sleepFor(2);
        fashion.click();
        sleepFor(2);
        watches.click();
        sleepFor(2);
        ShopWatches.click();
        sleepFor(2);
    }
}

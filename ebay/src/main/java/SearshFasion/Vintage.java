package SearshFasion;

import base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Vintage extends CommonAPI {
    @FindBy(xpath = "//button[@id='gh-shop-a']")
    WebElement categories;

    @FindBy(xpath = "//h3[@class='gh-sbc-parent']//a[contains(text(),'Fashion')]")
    WebElement fashion;

    @FindBy(xpath = "//span[contains(text(),'Vintage')]")
    WebElement vintage;

    @FindBy(xpath = "//a[contains(text(),'Shop Vintage')]")
    WebElement Shopvintage;

    public void CategoriesFshion(){
        categories.click();
        sleepFor(2);
        fashion.click();
        sleepFor(2);
        vintage.click();
        sleepFor(2);
        Shopvintage.click();
        sleepFor(2);
    }
}

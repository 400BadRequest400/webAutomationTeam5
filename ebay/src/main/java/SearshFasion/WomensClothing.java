package SearshFasion;

import base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class WomensClothing extends CommonAPI {
    @FindBy(xpath = "//button[@id='gh-shop-a']")
    WebElement categories;

    @FindBy(xpath = "//h3[@class='gh-sbc-parent']//a[contains(text(),'Fashion')]")
    WebElement fashion;

    @FindBy(xpath = "//span[contains(text(),'Women's Clothing')]")
    WebElement womenClothing;

    @FindBy(xpath = "//a[contains(text(),'Shop Women's Clothing')]")
    WebElement ShopWomen;

    public void CategoriesFshion2(){
        categories.click();
        sleepFor(2);
        fashion.click();
        sleepFor(2);
        womenClothing.click();
        sleepFor(2);
        ShopWomen.click();
        sleepFor(2);
    }
}

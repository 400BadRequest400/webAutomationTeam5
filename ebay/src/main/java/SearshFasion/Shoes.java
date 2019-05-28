package SearshFasion;

import base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Shoes extends CommonAPI {

    @FindBy(xpath = "//button[@id='gh-shop-a']")
    WebElement categories;

    @FindBy(xpath = "//h3[@class='gh-sbc-parent']//a[contains(text(),'Fashion')]")
    WebElement fashion;

    @FindBy(xpath = "//span[contains(text(),'Shoes')]")
    WebElement Shoes;

    @FindBy(xpath = "//a[contains(text(),'Shop Shoes')]")
    WebElement ShopShoes;

    public void CategoriesFshion(){
        categories.click();
        sleepFor(2);
        fashion.click();
        sleepFor(2);
        Shoes.click();
        sleepFor(2);
        ShopShoes.click();
        sleepFor(2);
    }
}


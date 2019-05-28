package SearshFasion;

import base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.annotations.Test;


public class Chanel extends CommonAPI {
    @FindBy(xpath = "//button[@id='gh-shop-a']")
    WebElement categories;


    @FindBy(xpath = "//h3[@class='gh-sbc-parent']//a[contains(text(),'Fashion')]")
    WebElement fashion;

    @FindBy(xpath = "//div[@class='b-list__header']//h2[contains(@class,'b-title')][contains(text(),'Top Brands')]")
    WebElement jewelry;



    public void CategoriesFshion(){
        categories.click();
        sleepFor(2);
        fashion.click();
        sleepFor(2);
        jewelry.click();
        sleepFor(2);

    }

}

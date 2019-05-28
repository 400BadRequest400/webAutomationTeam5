package SearshFasion;

import base.CommonAPI;
import com.aventstack.extentreports.model.ScreenCapture;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Beauty extends CommonAPI {

    @FindBy(xpath = "//button[@id='gh-shop-a']")
    WebElement categories;

    @FindBy(xpath = "//h3[@class='gh-sbc-parent']//a[contains(text(),'Fashion')]")
    WebElement fashion;

    @FindBy(xpath = "//span[contains(text(),'Beauty')]")
    WebElement Beauty;

    @FindBy(xpath = "//a[contains(text(),'Shop Beauty')]")
    WebElement ShopBeauty;

    public void CategoriesFshion(){
        categories.click();
        sleepFor(2);
        fashion.click();
        sleepFor(2);
        Beauty.click();
        sleepFor(2);
        ShopBeauty.click();
        sleepFor(2);
        
    }
}

package topbrand;

import base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Anthropologie extends CommonAPI {
    @FindBy(xpath = "//a[contains(text(),'Anthropologie')]")
    WebElement anthropologie;
    @FindBy(xpath = "//h3[@class='gh-sbc-parent']//a[contains(text(),'Fashion')]")
    WebElement fashion;
    @FindBy(xpath = "//a[contains(text(),'Anthropologie Clothing, Shoes & Accessories')]")
    WebElement anthropologieClothing;

    public void topanthropologie() {
        fashion.click();
        anthropologie.click();
        sleepFor(2);
        anthropologieClothing.click();
        sleepFor(2);

    }
}

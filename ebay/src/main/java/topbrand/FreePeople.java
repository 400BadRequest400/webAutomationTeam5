package topbrand;

import base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class FreePeople extends CommonAPI {
    @FindBy(xpath = "//a[contains(text(),'Free People')]")
    WebElement freepeople;
    @FindBy(xpath = "//h3[@class='gh-sbc-parent']//a[contains(text(),'Fashion')]")
    WebElement fashion;
    @FindBy(xpath = "//a[contains(text(),'Free People Clothing, Shoes & Accessories')]")
    WebElement freepeopleclolothing;

    public void topbrandfreepeople() {
        fashion.click();
        freepeople.click();
        sleepFor(2);
        freepeopleclolothing.click();
        sleepFor(2);
    }
}

package topbrand;

import base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Invicta extends CommonAPI {
    @FindBy(xpath = "//a[contains(text(),'Invicta')]")
    WebElement invicta;
    @FindBy(xpath = "//h3[@class='gh-sbc-parent']//a[contains(text(),'Fashion')]")
    WebElement fashion;
    @FindBy(xpath = "//a[contains(text(),'Invicta Watches, Parts & Accessories')]")
    WebElement invictaWatches;

    public void topbrandinvicta() {
        fashion.click();
        invicta.click();
        sleepFor(2);
        invictaWatches.click();
        sleepFor(2);
    }
}

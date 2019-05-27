package topbrand;

import base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class DavidYuman extends CommonAPI {
    @FindBy(xpath = "//a[contains(text(),'David Yurman')]")
    WebElement davidyrman;
    @FindBy(xpath = "//h3[@class='gh-sbc-parent']//a[contains(text(),'Fashion')]")
    WebElement fashion;
    @FindBy(xpath = "//a[contains(text(),'Jewelry & Watches')]")
    WebElement davidyrmanjewelry;

    public void topbrandavidyrman() {
        fashion.click();
        davidyrman.click();
        sleepFor(2);
        davidyrmanjewelry.click();
        sleepFor(2);
    }
}

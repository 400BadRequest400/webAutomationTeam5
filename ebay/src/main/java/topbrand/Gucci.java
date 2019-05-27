package topbrand;

import base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Gucci extends CommonAPI {
    @FindBy(xpath = "//a[contains(text(),'Gucci')]")
    WebElement gucci;
    @FindBy(xpath = "//h3[@class='gh-sbc-parent']//a[contains(text(),'Fashion')]")
    WebElement fashion;
    @FindBy(xpath = "//a[@class='b-textlink b-textlink--parent'][contains(text(),'Gucci Clothing, Shoes & Accessories')]")
    WebElement gucciclolothing;

    public void topbrandgucci() {
        fashion.click();
        gucci.click();
        sleepFor(2);
        gucciclolothing.click();
        sleepFor(2);
    }
}

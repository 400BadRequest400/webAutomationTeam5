package topbrand;

import base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CalvinKlein extends CommonAPI {
    @FindBy(xpath = "//a[contains(text(),'Calvin Klein')]")
    WebElement calvinKlein ;
    @FindBy(xpath = "//h3[@class='gh-sbc-parent']//a[contains(text(),'Fashion')]")
    WebElement fashion;
    @FindBy(xpath = "//a[@class='b-textlink b-textlink--parent'][contains(text(),'Calvin Klein Clothing, Shoes & Accessories')]")
    WebElement calvinKleinShoes;

    public void topbrandcalvinKlein() {
        fashion.click();
        calvinKlein.click();
        sleepFor(2);
        calvinKleinShoes.click();
        sleepFor(2);
    }
}

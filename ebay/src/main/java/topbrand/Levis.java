package topbrand;

import base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Levis extends CommonAPI {
    @FindBy(xpath = "//a[contains(text(),\"Levi's\")]")
    WebElement levis;
    @FindBy(xpath = "//h3[@class='gh-sbc-parent']//a[contains(text(),'Fashion')]")
    WebElement fashion;
    @FindBy(xpath = "//a[contains(text(),\"Levi's Clothing, Shoes & Accessories\")]")
    WebElement levisClothing;

    public void topbrandlevis() {
        fashion.click();
        levis.click();
        sleepFor(2);
        levisClothing.click();
        sleepFor(2);
    }
}

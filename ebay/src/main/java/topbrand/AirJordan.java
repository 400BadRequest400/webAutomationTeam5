package topbrand;

import base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AirJordan extends CommonAPI {
    @FindBy(xpath = "//a[contains(text(),'Air Jordan')]")
    WebElement airJordan;
    @FindBy(xpath = "//h3[@class='gh-sbc-parent']//a[contains(text(),'Fashion')]")
    WebElement fashion;
    @FindBy(xpath = "//a[contains(text(),'Jordan Shoes for Men')]")
    WebElement jordansShoes;

    public void topbrandairjordan() {
        fashion.click();
        airJordan.click();
        sleepFor(2);
        jordansShoes.click();
        sleepFor(2);

    }
}

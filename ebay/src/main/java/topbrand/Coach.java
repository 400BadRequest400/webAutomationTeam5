package topbrand;

import base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Coach extends CommonAPI {
    @FindBy(xpath = "//a[contains(text(),'Coach')]")
    WebElement coach;
    @FindBy(xpath = "//h3[@class='gh-sbc-parent']//a[contains(text(),'Fashion')]")
    WebElement fashion;
    @FindBy(xpath = "//a[@class='b-textlink b-textlink--parent'][contains(text(),'Coach Clothing, Shoes & Accessories')]")
    WebElement coachShoes;

    public void topbrandCoach() {
        fashion.click();
        coach.click();
        sleepFor(2);
        coachShoes.click();
        sleepFor(2);
    }
}

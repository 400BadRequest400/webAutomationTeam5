package searchMotors;

import base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ElectricCrars extends CommonAPI {
    @FindBy(xpath = "//button[@id='gh-shop-a']")
    WebElement categories;

    @FindBy(xpath = "//a[contains(text(),'Motors')]")
    WebElement Motors;

    @FindBy(xpath = "//a[contains(text(),'Electric & Hybrid Cars')]")
    WebElement electriccars;

    public void CategoriesMotors(){
        categories.click();
        sleepFor(2);
        Motors.click();
        sleepFor(2);
        electriccars.click();
        sleepFor(2);

    }
}

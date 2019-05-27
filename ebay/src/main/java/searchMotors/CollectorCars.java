package searchMotors;

import base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CollectorCars extends CommonAPI {
    @FindBy(xpath = "//button[@id='gh-shop-a']")
    WebElement categories;

    @FindBy(xpath = "//a[contains(text(),'Motors')]")
    WebElement Motors;

    @FindBy(xpath = "//a[contains(text(),'Collector Cars')]")
    WebElement Collectorcars;

    public void CategoriesMotors(){
        categories.click();
        sleepFor(2);
        Motors.click();
        sleepFor(2);
        Collectorcars.click();
        sleepFor(2);

    }
}

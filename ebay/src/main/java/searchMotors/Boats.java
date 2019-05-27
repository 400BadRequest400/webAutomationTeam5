package searchMotors;

import base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Boats extends CommonAPI {
    @FindBy(xpath = "//button[@id='gh-shop-a']")
    WebElement categories;

    @FindBy(xpath = "//a[contains(text(),'Motors')]")
    WebElement Motors;

    @FindBy(xpath = "//a[contains(text(),'Boat')]")
    WebElement boats;

    public void CategoriesMotors(){
        categories.click();
        sleepFor(2);
        Motors.click();
        sleepFor(2);
        boats.click();
        sleepFor(2);

    }
}

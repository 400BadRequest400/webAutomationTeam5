package searchMotors;

import base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Trailers extends CommonAPI {
    @FindBy(xpath = "//button[@id='gh-shop-a']")
    WebElement categories;

    @FindBy(xpath = "//a[contains(text(),'Motors')]")
    WebElement Motors;

    @FindBy(xpath = "//a[contains(text(),'Trailers')]")
    WebElement trailers;

    public void CategoriesMotors(){
        categories.click();
        sleepFor(2);
        Motors.click();
        sleepFor(2);
        trailers.click();
        sleepFor(2);

    }
}

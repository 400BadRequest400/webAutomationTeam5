package searchMotors;

import base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ClassicCras extends CommonAPI {
    @FindBy(xpath = "//button[@id='gh-shop-a']")
    WebElement categories;

    @FindBy(xpath = "//a[contains(text(),'Motors')]")
    WebElement Motors;

    @FindBy(xpath = "//a[contains(text(),'Classic Cars')]")
    WebElement classiccars;


    public void CategoriesMotors(){
        categories.click();
        sleepFor(2);
        Motors.click();
        sleepFor(2);
        classiccars.click();
        sleepFor(2);

    }
}

package searchMotors;

import base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CommercialTrucks extends CommonAPI {
    @FindBy(xpath = "//button[@id='gh-shop-a']")
    WebElement categories;

    @FindBy(xpath = "//a[contains(text(),'Motors')]")
    WebElement motors;

    @FindBy(xpath = "//a[contains(text(),'Commercial Trucks')]")
    WebElement commercialtrucks;

    public void CategoriesMotors(){
        categories.click();
        sleepFor(2);
        motors.click();
        sleepFor(2);
        commercialtrucks.click();
        sleepFor(2);

    }
}

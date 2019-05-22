package regressionCategories;

import base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Categories_Home extends CommonAPI {

    @FindBy(xpath = "//a[3]//span[2]")
    WebElement categories;

    @FindBy(xpath = "//*[@id=\"5xtvd\"]/a/div")
    WebElement home;

    @FindBy(xpath = "//*[@id=\"5xtvc\"]/a/div")
    WebElement bath;

    @FindBy(xpath = "//*[@id=\"5xtvb\"]/a/div")
    WebElement bathroom;

    @FindBy(xpath = "//div[contains(text(),'Soap & Lotion Dispensers')]")
    WebElement soap;


    public void CategoriesHome(){
        categories.click();
        sleepFor(2);
        home.click();
        sleepFor(2);
        bath.click();
        sleepFor(2);
        bathroom.click();
        sleepFor(2);
        soap.click();
        sleepFor(2);

    }
}

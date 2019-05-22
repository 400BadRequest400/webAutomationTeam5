package regressionCategories;

import base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Categories_Groceries extends CommonAPI {

    @FindBy(xpath = "//a[3]//span[2]")
    WebElement categories;

    @FindBy(xpath = "//*[@id=\"5xt1a\"]/a/div")
    WebElement groceries;

    @FindBy(xpath = "//*[@id=\"5xszm\"]/a/div")
    WebElement dairy;

    @FindBy(xpath = "//*[@id=\"5xszh\"]/a/div")
    WebElement milk;

    public void CategoriesClearence(){
        categories.click();
        sleepFor(2);
        groceries.click();
        sleepFor(2);
        dairy.click();
        sleepFor(2);
        milk.click();
        sleepFor(2);
    }
}

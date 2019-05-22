package regressionCategories;

import base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Categories_Electronics extends CommonAPI {

    @FindBy(xpath = "//a[3]//span[2]")
    WebElement categories;

    @FindBy(xpath = "//*[@id=\"5xtg6\"]/a/div")
    WebElement electronic;

    @FindBy(xpath = "//*[@id=\"5xte8\"]/a/div")
    WebElement cellphone;

    @FindBy(xpath = "//*[@id=\"5xte3\"]/a/div")
    WebElement unlockedcellphones;

    public void CategoriesElectronics(){
        categories.click();
        sleepFor(2);
        electronic.click();
        sleepFor(2);
        cellphone.click();
        sleepFor(2);
        unlockedcellphones.click();
        sleepFor(2);
    }
}

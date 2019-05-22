package regressionCategories;

import base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Categories_Baby extends CommonAPI {

    @FindBy(xpath = "//a[3]//span[2]")
    WebElement categories;

    @FindBy(xpath = "//*[@id=\"5xtly\"]/a/div")
    WebElement baby;

    @FindBy(xpath = "//*[@id=\"5xtlp\"]/a/div")
    WebElement diapering;

    @FindBy(xpath = "//*[@id=\"5xtlk\"]/a/div")
    WebElement diaperbags;

    public void CategoriesBaby(){
        categories.click();
        sleepFor(2);
        baby.click();
        sleepFor(2);
        diapering.click();
        sleepFor(2);
        diaperbags.click();
        sleepFor(2);
    }
}

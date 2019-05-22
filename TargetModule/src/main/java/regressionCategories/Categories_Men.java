package regressionCategories;

import base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Categories_Men extends CommonAPI {

    @FindBy(xpath = "//a[3]//span[2]")
    WebElement categories;
    @FindBy(xpath = "//*[@id=\"18y1l\"]/a/div")
    WebElement men;
    @FindBy(xpath = "//*[@id=\"5xu1w\"]/a/div")
    WebElement menshoes;
    @FindBy(xpath = "//*[@id=\"5xu1s\"]/a/div")
    WebElement sandals;

    public void CategoriesMen(){
        categories.click();
        sleepFor(2);
        men.click();
        sleepFor(2);
        menshoes.click();
        sleepFor(2);
        sandals.click();
        sleepFor(2);

    }





}

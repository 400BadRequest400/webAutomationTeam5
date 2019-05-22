package regressionCategories;

import base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Categories_Toys extends CommonAPI {

    @FindBy(xpath = "//a[3]//span[2]")
    WebElement categories;

    @FindBy(xpath = "//*[@id=\"5xtb0\"]/a/div")
    WebElement toy;

    @FindBy(xpath = "//*[@id=\"5xt90\"]/a/div")
    WebElement dolls;

    @FindBy(xpath = "//*[@id=\"5xt8z\"]/a/div")
    WebElement babydoll;

    @FindBy(xpath = "//*[@id=\"mainContainer\"]/div[2]/div/div/ul/li[5]/a/div[2]")
    WebElement cutebabydolls;

    public void CategoriesToys(){
        categories.click();
        sleepFor(2);
        toy.click();
        sleepFor(2);
        dolls.click();
        sleepFor(2);
        babydoll.click();
        sleepFor(2);
        cutebabydolls.click();
        sleepFor(2);
    }
}

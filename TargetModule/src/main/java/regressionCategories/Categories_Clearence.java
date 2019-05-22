package regressionCategories;

import base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Categories_Clearence extends CommonAPI {

    @FindBy(xpath = "//a[3]//span[2]")
    WebElement categories;

    @FindBy(xpath = "//*[@id=\"5q0ga\"]/a/div")
    WebElement clear;

    @FindBy(xpath = "//*[@id=\"5tg3d\"]/a/div")
    WebElement toyclearence;

    @FindBy(xpath = "//*[@id=\"mainContainer\"]/div[3]/div/div/div[1]/div[3]/div[2]/ul/li[1]/div/div[1]/h3/a/div/div/div/picture[1]/img")
    WebElement findby;

    @FindBy(xpath = "//*[@id=\"mainContainer\"]/div/div/div[1]/div[1]/div[1]/div[2]/a[1]/span")
    WebElement shopselection;

    public void CategoriesClearence(){
        categories.click();
        sleepFor(2);
        clear.click();
        sleepFor(2);
        toyclearence.click();
        sleepFor(2);
        findby.click();
        sleepFor(2);
        shopselection.click();
        sleepFor(2);
    }
}

package regressionCategories;

import base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Categories_Kids extends CommonAPI {

    @FindBy(xpath = "//a[3]//span[2]")
    WebElement categories;

    @FindBy(xpath = "//*[@id=\"xcoz4\"]/a/div")
    WebElement kids;

    @FindBy(xpath = "//*[@id=\"5xtxl\"]/a/div")
    WebElement boysshoes;

    public void Categorieskids(){
        categories.click();
        sleepFor(2);
        kids.click();
        sleepFor(2);
        boysshoes.click();
        sleepFor(2);
    }



}

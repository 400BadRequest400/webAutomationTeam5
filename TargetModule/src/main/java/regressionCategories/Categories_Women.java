package regressionCategories;

import base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.annotations.BeforeMethod;

public class Categories_Women extends CommonAPI {


    @FindBy(xpath = "//a[3]//span[2]")
    WebElement categories;

    @FindBy(xpath = "//*[@id=\"5xtd3\"]/a/div")
    WebElement women;

    @FindBy(xpath = "//*[@id=\"5xtcm\"]/a/div")
    WebElement womenclothes;

    @FindBy(xpath = "//*[@id=\"5xtbw\"]/a/div")
    WebElement swimsouit;

    @FindBy(xpath = "//*[@id=\"4yigt\"]/a/div")
    WebElement bikinis;

    @FindBy(xpath = "//*[@id=\"mainContainer\"]/div[3]/div/div[2]/div/div[2]/div[1]/div/div/a/div[2]")
    WebElement bandeaubikini;

    public void CategoriesWomen(){
        categories.click();
        sleepFor(4);
        women.click();
        sleepFor(2);
        womenclothes.click();
        sleepFor(2);
        swimsouit.click();
        sleepFor(2);
        bikinis.click();
        sleepFor(2);
        bandeaubikini.click();
        sleepFor(2);
    }

}

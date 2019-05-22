package regressionCategories;

import base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Categories_Pets extends CommonAPI {

    @FindBy(xpath = "//a[3]//span[2]")
    WebElement categories;

    @FindBy(xpath = "//*[@id=\"5xt44\"]/a/div")
    WebElement pets;

    @FindBy(xpath = "//*[@id=\"5xt43\"]/a/div")
    WebElement birdsupplies;

    @FindBy(xpath = "//*[@id=\"mainContainer\"]/div[2]/div/div/ul/li[2]/a/div[1]/div/div/picture/img")
    WebElement birdcages;

    public void CategoriesPets(){
        categories.click();
        sleepFor(2);
        pets.click();
        sleepFor(2);
        birdsupplies.click();
        sleepFor(2);
        birdcages.click();
        sleepFor(2);
    }
}

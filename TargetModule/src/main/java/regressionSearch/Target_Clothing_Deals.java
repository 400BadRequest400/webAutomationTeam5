package regressionSearch;

import base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Target_Clothing_Deals extends CommonAPI {

    @FindBy(xpath = "//*[@id=\"search\"]")
    WebElement search;

    @FindBy(xpath = "//*[@id=\"clothing deals\"]/div")
    WebElement clothingdeals;

    @FindBy(xpath = "//div[6]//div[1]//div[2]//div[1]//div[4]//div[1]//div[1]//div[1]//a[1]//div[2]")
    WebElement allmensdeal;

    @FindBy(xpath = "//*[@id=\"mainContainer\"]/div[3]/div/div/div/div[1]/div[1]/div/div/a/div[2]")
    WebElement tees_tanks;



    public void TargetClothingDeals(){
        search.click();
        sleepFor(3);
        clothingdeals.click();
        sleepFor(3);
        allmensdeal.click();
        sleepFor(3);

        //sleepFor(3);
    }

}

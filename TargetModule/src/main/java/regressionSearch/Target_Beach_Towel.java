package regressionSearch;

import base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

public class Target_Beach_Towel extends CommonAPI {

    @FindBy(xpath = "//*[@id=\"search\"]")
    WebElement search;

    @FindBy(xpath = "//*[@id=\"beach towel\"]/div")
    WebElement beachtowel;


    public void TargetBeachTower(){

        if(search.isDisplayed()){
            Assert.assertTrue(true);
            search.click();}

        sleepFor(3);
        beachtowel.click();
        sleepFor(3);

    }
}

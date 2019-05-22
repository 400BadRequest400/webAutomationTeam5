package regressionSearch;

import base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Target_Women_Swimsuits extends CommonAPI {

    @FindBy(xpath = "//*[@id=\"search\"]")
    WebElement search;

    @FindBy(xpath = "//*[@id=\"womens swimsuits\"]/div")
    WebElement swimsuit;

    @FindBy(xpath = "//*[@id=\"mainContainer\"]/div[2]/div/div/ul/li[4]/a/div[2]")
    WebElement bikini;

    @FindBy(xpath = "//*[@id=\"mainContainer\"]/div[3]/div/div[2]/div/div[1]/div[2]/h3")
    WebElement pushup;



    public void TargetWomenSwimSuits(){
        search.click();
        sleepFor(3);
        swimsuit.click();
        sleepFor(3);
        bikini.click();
        sleepFor(3);
        pushup.click();
        sleepFor(3);
    }
}




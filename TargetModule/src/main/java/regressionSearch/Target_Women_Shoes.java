package regressionSearch;

import base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Target_Women_Shoes extends CommonAPI {

    @FindBy(xpath = "//*[@id=\"search\"]")
    WebElement search;

    @FindBy(xpath = "//*[@id=\"womens shoes\"]/div")
    WebElement womenshoe;

    @FindBy(xpath = "//*[@id=\"mainContainer\"]/div[2]/div/div/ul/li[1]/a/div[1]/div/div/picture/img")
    WebElement boots;

    @FindBy(xpath = "//*[@id=\"mainContainer\"]/div[2]/div/div/ul/li[5]/a/div[1]/div/div/picture/img")
    WebElement winterboots;

    @FindBy(xpath = "//*[@id=\"mainContainer\"]/div[4]/div/div/div[1]/div[3]/div[2]/ul/li[1]/div/div[2]/div/div/div/div[5]/div[1]/div/div/button")
    WebElement chooseoption;


    public void TargetWomenShoes(){
        search.click();
        sleepFor(3);
        womenshoe.click();
        sleepFor(3);
        boots.click();
        sleepFor(3);
        winterboots.click();
        sleepFor(3);
        chooseoption.click();
        sleepFor(4);



    }
}

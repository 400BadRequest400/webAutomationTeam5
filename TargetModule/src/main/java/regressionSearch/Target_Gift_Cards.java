package regressionSearch;

import base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Target_Gift_Cards extends CommonAPI {


    @FindBy(xpath = "//*[@id=\"search\"]")
    WebElement search;

    @FindBy(xpath = "//*[@id=\"gift cards\"]/div")
    WebElement giftcards;

    @FindBy(xpath = "//div[contains(text(),'Check your balance')]")
    WebElement balance;


    public void TargetGiftCards(){
        search.click();
        sleepFor(5);
        giftcards.click();
        sleepFor(5);
        balance.click();
        sleepFor(5);

    }
}

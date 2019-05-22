package regressionSearch;

import base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Target_Women_Dresses extends CommonAPI {

    @FindBy(xpath = "//*[@id=\"search\"]")
    WebElement search;

    @FindBy(xpath = "//*[@id=\"women dresses\"]/div")
    WebElement women;

    @FindBy(xpath = "//*[@id=\"mainContainer\"]/div[3]/div/div/div[1]/div[2]/div/div/div[1]/div[2]/div[2]/a")
    WebElement showall;

    public void TargetWomenDresses(){
        search.click();
        sleepFor(3);
        women.click();
        sleepFor(3);
        //showall.click();
        //sleepFor(3);

    }
}

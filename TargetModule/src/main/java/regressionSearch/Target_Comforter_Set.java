package regressionSearch;

import base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Target_Comforter_Set extends CommonAPI {

    @FindBy(xpath = "//*[@id=\"search\"]")
    WebElement search;

    @FindBy(xpath = "//*[@id=\"comforter set\"]/div")
    WebElement comforter;



    public void TargetComforterSet(){
        search.click();
        sleepFor(3);
        comforter.click();
        sleepFor(3);

    }
}

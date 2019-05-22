package regressionSearch;

import base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Target_Throw_Blanket extends CommonAPI {

    @FindBy(xpath = "//*[@id=\"search\"]")
    WebElement search;

    @FindBy(xpath = "//*[@id=\"throw blanket\"]/div")
    WebElement blanket;

    public void TargetThrowBlanket(){
        search.click();
        sleepFor(3);
        blanket.click();
        sleepFor(3);
    }
}

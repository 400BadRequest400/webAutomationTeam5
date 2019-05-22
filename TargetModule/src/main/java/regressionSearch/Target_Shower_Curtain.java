package regressionSearch;

import base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Target_Shower_Curtain extends CommonAPI {

    @FindBy(xpath = "//*[@id=\"search\"]")
    WebElement search;

    @FindBy(xpath = "//*[@id=\"shower curtain\"]/div")
    WebElement shower;

    public void TargetShowerCurtain(){
        search.click();
        sleepFor(3);
        shower.click();
        sleepFor(3);

    }
}

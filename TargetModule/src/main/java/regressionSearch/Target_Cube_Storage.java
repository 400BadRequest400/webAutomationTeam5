package regressionSearch;

import base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Target_Cube_Storage extends CommonAPI {

    @FindBy(xpath = "//*[@id=\"search\"]")
    WebElement search;

    @FindBy(xpath = "//*[@id=\"cube storage\"]/div")
    WebElement storage;


    public void TargetCubeStorage(){
        search.click();
        sleepFor(3);
        storage.click();
        sleepFor(3);

    }
}

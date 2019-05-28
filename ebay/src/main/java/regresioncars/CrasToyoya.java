package regresioncars;

import base.CommonAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class CrasToyoya extends CommonAPI {

    public void search() {

        clickByXpath("//*[@id=\"mainContent\"]/div[1]/ul/li[3]/a");
        sleepFor(5);
    }

    public void searchMotors() {
        typeOnElement("//input[@id='gh-ac']", "toyota camry");
        clickByXpath("//input[@id='gh-btn']");
    }
    public void searchCarmodels(){
        clickOnElement("//select[@id='srp-river-results-universal_finder_answer1-w0-0-select']");

        sleepFor(5);
    }

    //method testing mouse moving and click

    public void testmouseHover(){
        WebElement element =driver.findElement(By.linkText("Fashion"));
        Actions action = new Actions(driver);
        action.moveToElement(element).build().perform();
        driver.findElement(By.linkText("Beauty")).click();
        sleepFor(5);
    }

}

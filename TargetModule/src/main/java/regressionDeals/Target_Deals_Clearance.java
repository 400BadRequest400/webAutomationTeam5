package regressionDeals;

import base.CommonAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class Target_Deals_Clearance extends CommonAPI {

    @FindBy(id = "secondary")
    WebElement deals;

    @FindBy(id = "deals-clearance")
    WebElement clearance;


    public void Target_deals_clearance(){
        deals.click();
        sleepFor(2);
        clearance.click();
        sleepFor(2);

    }

    public void selectdeals(){
        driver.findElement(By.id("secondary")).click();
        sleepFor(4);

        Select select = new Select(driver.findElement(By.id("secondary")));
        sleepFor(4);
        select.getFirstSelectedOption();
    }




}

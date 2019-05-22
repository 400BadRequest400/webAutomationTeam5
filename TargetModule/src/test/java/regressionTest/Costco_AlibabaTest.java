package regressionTest;

import base.CommonAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class Costco_AlibabaTest extends CommonAPI {



    //@Test
    public void costco(){

        WebElement element = driver.findElement(By.id("email-signup-dropdown"));
        Actions actionObj= new Actions(driver);
        actionObj.moveToElement(element).build().perform();
        sleepFor(5);
        driver.findElement(By.id("header_emailSignUpEmail")).click();
        sleepFor(5);
        driver.findElement(By.id("header_emailSignUpEmail")).sendKeys("Jeff@pnt.com");
        sleepFor(5);
        clickByXpath("//button[@class='btn btn-secondary']");

    }

    //@Test
    public void alibaba(){

        okAlert();
        sleepFor(5);

        WebElement element = driver.findElement(By.className("J-hd-beaconnav-title sc-hd-ms-title"));
        Actions act = new Actions(driver);
        act.moveToElement(element).build().perform();
        sleepFor(5);
        driver.findElement(By.id("a2700.8293689.scGlobalHomeHeader.13")).click();
        sleepFor(5);







    }
}

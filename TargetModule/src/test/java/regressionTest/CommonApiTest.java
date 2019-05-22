package regressionTest;

import base.CommonAPI;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class CommonApiTest extends CommonAPI {


    @Test(enabled = false)
    public void typeOnInputBoxTest(){
        typeOnInputBox("search","baby");
        sleepFor(4);
    }
    @Test(priority = 49)
    public void navigatebackTest(){

        driver.findElement(By.id("search")).click();
        sleepFor(3);
        clickByXpath("//div[contains(text(),'gift cards')]");
        sleepFor(3);

        navigateBack();
        sleepFor(3);
        navigateBack();
        sleepFor(3);
    }
    @Test(priority = 50)
    public void clearthefieldTest(){
        driver.findElement(By.id("search")).sendKeys("baby");
        sleepFor(3);
        clearField("search");
        sleepFor(3);
    }
    @Test(priority = 51)
    public void typeOnElementTest(){
        typeOnElement("#search","books");
        sleepFor(3);
    }
    @Test(priority = 52)
    public void typeOnIDTest(){
        typeOnID("search","shoes");
        sleepFor(3);
    }
    @Test(priority = 53)
    public void typeOnCssTest(){
        typeOnCss("#search","daljeet");
        sleepFor(3);
    }
    @Test(priority = 54
    )
    public void keysInputTest(){
        keysInput("#search");
        sleepFor(3);
    }
    @Test(priority = 55)
    public void clearInputTest(){
        typeOnID("search","shoes");
        sleepFor(3);
        clearInput("#search");
        sleepFor(3);
    }
    @Test(priority = 56)
    public void upLoadFileTest(){
        typeOnID("search","shoes");
        sleepFor(3);
        upLoadFile("#search","");
    }
    @Test(priority = 57)
    public void waitUntilSelectableTest(){
        waitUntilSelectable(By.xpath("//span[contains(text(),'Categories')]"));
        sleepFor(2);
    }
    @Test(priority = 58)
    public void waitUntilVisible(){
        waitUntilVisible(By.xpath("//span[contains(text(),'Categories')]"));
        sleepFor(2);
    }


}

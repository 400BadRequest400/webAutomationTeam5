package homePagePackage;

import base.CommonAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterTest;


public class CorporateInfo extends CommonAPI {

    public void InfoByCountry() {
        //driver.findElement(By.xpath("//*[@id=\"react-select-2--value-item\"]")).click();
        Select s = new Select(driver.findElement(By.id("react-select-2--value-item")));
        s.selectByVisibleText("ALGERIA");
    }

    public void backHomePage() {
        driver.findElement(By.xpath("/html/body/div[2]/div[3]/div[2]/ul/li/a")).click();
    }

    public void Quit() {

        driver.quit();
    }
}

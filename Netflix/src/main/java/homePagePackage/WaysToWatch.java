package homePagePackage;

import base.CommonAPI;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class WaysToWatch extends CommonAPI {


    public void WaysToWatchClick() {
        driver.findElement(By.xpath("/html/body/div[2]/div/div[3]/div[2]/ul/li[9]/a/span")).click();
    }

    public void Quit() {

        driver.quit();
    }
}

package homePagePackage;

import base.CommonAPI;
import org.openqa.selenium.By;

public class Jobs extends CommonAPI {

    public void JobsButton() {
        driver.findElement(By.xpath("/html/body/div[2]/div/div[3]/div[2]/ul")).click();
    }

    public void Quit() {

        driver.quit();
    }
}

package homePagePackage;

import base.CommonAPI;
import org.openqa.selenium.By;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

public class HelpCenter extends CommonAPI {

    public void HelpCenterButton() {
        driver.findElement(By.xpath("/html/body/div[2]/div/div[3]/div[2]/ul/li[2]/a/span")).sendKeys("xxxxxxxxxxxxx");
    }

    public void WhatsNetflix() {
        driver.findElement(By.xpath("//*[@id=\"top-articles-placeholder\"]/div[1]/div/ol/li[1]/a")).click();
    }

    public void ResetPassword() {
        driver.findElement(By.xpath("/html/body/div[2]/div[3]/div[2]/section/div[2]/div/ol/li[1]/a")).click();
    }

    public void UpdateEmail() {
        driver.findElement(By.xpath("/html/body/div[2]/div[3]/div[2]/section/div[2]/div/ol/li[2]/a")).click();
    }

    public void UpdatePayment() {
        driver.findElement(By.xpath("/html/body/div[2]/div[3]/div[2]/section/div[2]/div/ol/li[4]/a")).click();

    }

    public void CallUsButton() {
        driver.findElement(By.xpath("//*[@id=\"phoneContactTrigger\"]")).click();
    }

    public void Quit() {

        driver.quit();
    }
}

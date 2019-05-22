package homePagePackage;

import base.CommonAPI;
import org.openqa.selenium.By;
import org.testng.annotations.AfterTest;

public class ContactUs extends CommonAPI {

    public void ContactUsButton() {
        driver.findElement(By.xpath("/html/body/div[2]/div/div[3]/div[2]/ul/li[14]/a/span")).click();
    }

    public void BackToHelpHome() {

        driver.findElement(By.xpath("/html/body/div[2]/div[3]/div[2]/ul/li/a"));
    }

    public void AndroidButton() {
        driver.findElement(By.xpath("/html/body/div[2]/div[3]/div[2]/div/div[1]/section[2]/div/a[1]")).click();
    }

    public void IOSButton() {
        driver.findElement(By.xpath("/html/body/div[2]/div[3]/div[2]/div/div[1]/section[2]/div/a[2]")).click();
    }

    public void Quit() {

        driver.quit();
    }
}

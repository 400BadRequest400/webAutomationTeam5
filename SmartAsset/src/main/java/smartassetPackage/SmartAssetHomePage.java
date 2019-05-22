package smartassetPackage;

import base.CommonAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class SmartAssetHomePage extends CommonAPI {

    public void HomePage() {
        System.out.println(driver.getTitle());
        //System.out.println(driver.getCurrentUrl()); //check the landing

    }

    public void FinancialAdvisor() { //check if button is clickable and land u in the new link
        driver.findElement(By.xpath("//*[@id=\"main-container\"]/div/div/div/div[2]/a[2]/span[2]")).click();
        driver.findElement(By.xpath("//*[@id=\"main-container\"]/div[1]/section/div/form/input")).sendKeys("11001");
        driver.findElement(By.xpath("//*[@id=\"main-container\"]/div[1]/section/div/form/button")).click();
        driver.findElement(By.xpath("//*[@id=\"main-container\"]/main/div[2]/form[1]/div/div[2]/label[5]/input")).click();//check box
        sleepFor(2);

    }

    public void AffordabilityEstimate() {
        driver.get("https://smartasset.com/");
        driver.findElement(By.xpath("//*[@id=\"main-container\"]/div/div/div/div[2]/a[1]/span[2]")).click();
        driver.findElement(By.xpath("//*[@id=\"inputs-walkthrough\"]/div[5]/div[1]/div/div[4]/i")).click();
        driver.findElement(By.xpath("//*[@id=\"inputs-walkthrough\"]/div[1]/div[1]/div/div[4]/button[1]")).click();
    }

}
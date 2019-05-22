package homePagePackage;

import base.CommonAPI;
import org.openqa.selenium.By;
import org.testng.annotations.AfterTest;

public class HomePage extends CommonAPI {

    public void HomePage() {

        System.out.println(driver.getTitle());
        System.out.println(driver.getCurrentUrl());

    }

    public void SignIn() {
        driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/a[2]")).click();
        driver.findElement(By.xpath("//*[@id=\"appMountPoint\"]/div/div[3]/div/div/div[1]/form/div[1]/div[1]/div/label/label")).sendKeys("email@netflix.com");
        driver.findElement(By.xpath("//*[@id=\"id_password\"]")).sendKeys("xxxxxxxx");

    }
    public void LogoClick(){
        driver.findElement(By.xpath("/html/body/div[2]/div/div[1]/a[1]/svg")).click();
    }
    public void FreeTrail(){
        driver.findElement(By.xpath("//*[@id=\"formstart\"]/button")).click();
}
    public void CancelAnytime(){
        driver.findElement(By.id("icon-cancel")).click();

}
    public void WatchAnywhere(){
        driver.findElement(By.id("//*[@id=\'Fill-7\']")).click();
    }

    public void Quit(){

        driver.quit();
    }
}

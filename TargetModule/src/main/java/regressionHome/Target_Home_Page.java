package regressionHome;

import base.CommonAPI;
import org.openqa.selenium.By;

public class Target_Home_Page extends CommonAPI {

    public void TargetHomePage(){
        System.out.println(driver.getTitle());
    }
    public void TargetSign(){
        clickByXpath("//*[@id=\"home\"]");
    }
    public void CategoriesButton(){
        clickByXpath("//span[contains(text(),'Categories')]  ");
    }
    public void DealsButton(){
        clickByXpath("//a[@id='secondary']");
    }
    public void TrendingButton(){
        clickByXpath("//a[@id='trending']");
    }
    public void SearchField(){
        clickByXpath("//input[@id='search']");
    }
    public void SigninButton(){
        //clickOnCss("document.querySelector(\"#account > span:nth-child(4)\")");
        clickByXpath("document.querySelector(\"#account > span:nth-child(4)\")");
    }
    public void CartButton(){
        clickByXpath("//*[@id=\"cart\"]");
    }
    public void RegistriesListButton(){
        clickOnCss("a[class='Link-sc-1khjl8b-0 lifmEv']");
    }
    public void WeeklyAddButton(){
        clickByXpath("//*[@id=\"header\"]/div[1]/div[2]/div/div[1]/ul/li[2]/a");
        driver.findElement(By.linkText("REDcard")).click();
    }
    public void HelpButton(){
        clickByXpath("//*[@id=\"select-8\"]");
    }
    public void StoresButton(){
        clickByXpath("//*[@id=\"select-9\"]");
    }
    public void AppsButton(){
        clickByXpath("//*[@id=\"select-10\"]");
    }
    public void SocialButton(){
        clickByXpath("//*[@id=\"select-11\"]");
    }
    public void MoreButton(){
        clickByXpath("//*[@id=\"select-12\"]");
    }

}

package lendingTreePackage;

import base.CommonAPI;
import org.openqa.selenium.By;

public class LendingTreeHome extends CommonAPI {

public void CheckLanding(){
    System.out.println(driver.getCurrentUrl());
    System.out.println(driver.getTitle());
    }
public void PersonalLoan(){
    driver.findElement(By.xpath("//*[@id=\"slide-1\"]/div[1]/div[2]/a")).click();
    }
    public void DropHomeBuy(){
    driver.findElement(By.xpath("//*[@id=\"phoenixform\"]/div[1]/div[4]/div[2]/div[1]/select")).click();
    }
}

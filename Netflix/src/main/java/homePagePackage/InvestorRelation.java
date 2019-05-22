package homePagePackage;

import base.CommonAPI;
import org.openqa.selenium.By;

public class InvestorRelation extends CommonAPI {

    public void InvestorRelationButton() {
        driver.findElement(By.xpath("/html/body/div[2]/div/div[3]/div[2]/ul/li[5]/a/span")).click();

    }

    public void Quit() {

        driver.quit();

    }
}

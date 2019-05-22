package homePagePackageTest;

import homePagePackage.Jobs;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class JobsTest extends Jobs {

    @Test
    public void JobsButton (){
        driver.findElement(By.xpath("/html/body/div[2]/div/div[3]/div[2]/ul/li[6]/a/span")).click();
    }
}

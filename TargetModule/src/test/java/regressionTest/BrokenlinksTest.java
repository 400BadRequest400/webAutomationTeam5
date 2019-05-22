package regressionTest;

import base.CommonAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import regression.Brokenlinks;

import java.io.IOException;

public class BrokenlinksTest extends CommonAPI {

    Brokenlinks brokenLin;

    String url = "https://www.target.com";
    @BeforeMethod
    public void init(){
        brokenLin = PageFactory.initElements(driver,Brokenlinks.class);
        driver.get(url);
    }

    @Test(priority = 48)
    public void testCnnActivlinks() throws IOException {
        brokenLin.linksbroken();
    }
}

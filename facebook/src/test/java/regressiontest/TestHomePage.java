package regressiontest;

import base.CommonAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import regression.HomePage;


public class TestHomePage extends CommonAPI {

    @Test
    public static void testelement() {
        HomePage homePage = PageFactory.initElements(driver, HomePage.class);
        //homePage.linkcheck("facebook");
        //homePage.linkcheck("rabah");
       homePage.linkcheck(" Terms, Data Policy");


    }

}

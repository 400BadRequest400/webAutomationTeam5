package regressionCategoriesTest;

import base.CommonAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import regressionDeals.Target_Deals_Clearance;

public class TargetDealsTest extends CommonAPI {

    Target_Deals_Clearance dealsclear;
    @BeforeMethod
    public void init1(){
        dealsclear = PageFactory.initElements(driver, Target_Deals_Clearance.class);
    }

    @Test(priority = 11)
    public void TargetDealsClkearanceTest(){
        dealsclear.Target_deals_clearance();
    }

    @Test(priority = 12)
    public void selectdealTest(){
        dealsclear.selectdeals();
        sleepFor(4);
    }


}

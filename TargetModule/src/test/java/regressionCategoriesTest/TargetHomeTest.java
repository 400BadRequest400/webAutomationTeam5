package regressionCategoriesTest;

import org.testng.annotations.Test;
import regression.TargetHomePage;
import regressionHome.Target_Home_Page;

public class TargetHomeTest extends Target_Home_Page {

    @Test(priority = 1)
    public void TargetHomePageTest(){
        TargetHomePage();
        sleepFor(3);
    }

    @Test(priority = 2)
    public void HomeSignTest(){
        TargetHomePage();
        sleepFor(3);
        TargetSign();
        sleepFor(3);
    }

    @Test(priority = 3)
    public void CategoriesButtonTest(){
        TargetHomePage();
        sleepFor(3);
        CategoriesButton();
        sleepFor(3);
    }
    @Test(priority = 4)
    public void DealsButtonTest(){
        TargetHomePage();
        sleepFor(3);
        DealsButton();
        sleepFor(3);
    }
    @Test(priority = 5)
    public void TrendingButtonTest(){
        TargetHomePage();
        sleepFor(3);
        TrendingButton();
        sleepFor(3);
    }
    @Test(priority = 6)
    public void SearchFieldTest(){
        TargetHomePage();
        sleepFor(3);
        SearchField();
        sleepFor(3);
    }
    @Test(enabled=false)
    public void SigninButtonTest(){
        TargetHomePage();
        sleepFor(3);
        SigninButton();
        sleepFor(3);
    }
    @Test(priority = 8)
    public void CartButtontest(){
        TargetHomePage();
        sleepFor(3);
        CartButton();
        sleepFor(3);
    }
    @Test(priority = 9)
    public void RegistriesListButtonTest(){
        TargetHomePage();
        sleepFor(3);
        RegistriesListButton();
        sleepFor(3);
    }
    @Test(priority = 10)
    public void WeeklyAdd(){
        TargetHomePage();
        sleepFor(3);
        //WeeklyAdd();
        //sleepFor(3);
    }
    @Test(priority = 11)
    public void HelpButtonTest(){
        TargetHomePage();
        sleepFor(3);
        HelpButton();
        sleepFor(3);
    }
    @Test(priority = 12)
    public void StoresButtontest(){
        TargetHomePage();
        sleepFor(3);
        StoresButton();
        sleepFor(3);
    }
    @Test(priority = 13)
    public void AppsButtonTest(){
        TargetHomePage();
        sleepFor(3);
        AppsButton();
        sleepFor(3);
    }
    @Test(priority = 14)
    public void SocialButtontest(){
        TargetHomePage();
        sleepFor(3);
        SocialButton();
        sleepFor(3);
    }
    @Test(priority = 15)
    public void MoreButtontest(){
        TargetHomePage();
        sleepFor(3);
        MoreButton();
        sleepFor(3);
    }


}

package homePagePackageTest;

import homePagePackage.HomePage;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class HomePageTest extends HomePage {

    @Test(priority = 1)
    public void HomePageT() {
        HomePage(); }

    @Test(priority = 2)
    public void SignInT() {
        SignIn(); }

    @Test(priority = 3)
    public void LogoClickT() {
        LogoClick();
    }

    @Test(priority = 4)
    public void FreeTrialT() {

        FreeTrail();
    }

    @Test(priority = 5)
    public void CancelAnytimeT() {

        CancelAnytime();
    }

    @Test(priority = 6)
    public void WatchAnywhereT() {
        WatchAnywhere();
    }

    @AfterTest
    public void QuitT() {

        Quit();
    }
}


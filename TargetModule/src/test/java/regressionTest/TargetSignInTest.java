package regressionTest;

import base.CommonAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import regression.TargetSignIn;

public class TargetSignInTest extends CommonAPI {

    TargetSignIn obj1;

    @BeforeMethod
    public void init(){
        obj1 = PageFactory.initElements(driver,TargetSignIn.class);
    }

    @Test(priority = 42)
    public void SignInTest1() {
        obj1.SignIn("Jeff@selenium.com", "Jeff");
        sleepFor(2);
    }
    @Test(priority = 43)
    public void SignInTest2() {
        obj1.SignIn("Akli@selenium.com", "Akli");
        sleepFor(2);
    }
    @Test(priority = 44)
    public void SignInTest3() {
        obj1.SignIn("Daljeet@selenium.com", "Daljeet");
        sleepFor(2);
    }











}

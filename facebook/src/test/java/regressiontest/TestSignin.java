package regressiontest;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import regression.ForgotAccount;
import regression.Login;

public class TestSignin extends Login {
@Test(priority = 14)
    public static void validlogin() throws InterruptedException {
        lgn("rabah","111111");
        getScreenshot(driver);
        //sleepFor(5);
        logout();
    }
   @Test(priority = 13)
    public static void novalidlogin() throws InterruptedException {
        lgn("rabaharabsaid@yahoo.fr","111111");
        getScreenshot(driver);
      //  sleepFor(5);



    }
    @Test(priority = 12)
    public static void forgetacc(){
        ForgotAccount fracc = PageFactory.initElements(driver, ForgotAccount.class);
        fracc.Forgotacc("rabaharabsaid@gmail.com");

    }


}

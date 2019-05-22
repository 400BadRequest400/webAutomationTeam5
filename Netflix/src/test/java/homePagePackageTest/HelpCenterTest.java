package homePagePackageTest;

import homePagePackage.HelpCenter;
import org.testng.annotations.Test;

public class HelpCenterTest extends HelpCenter {

    @Test(priority = 1)
    public void HelpCenterButtonT() {
        HelpCenterButton();
    }
    @Test(priority = 2)
    public void WhatsNetflixT(){
        WhatsNetflix();
    }
    @Test(priority = 3)
    public void ResetPasswordT(){
        ResetPassword();
    }
    @Test(priority = 4)
    public void UpdateEmailT(){
        UpdateEmail();
    }
    @Test(priority = 5)
    public void UpdatePaymentT(){
        UpdatePayment();
    }

    @Test(priority = 6)
    private void CallUsButtonT(){
        CallUsButton();
        }


    }

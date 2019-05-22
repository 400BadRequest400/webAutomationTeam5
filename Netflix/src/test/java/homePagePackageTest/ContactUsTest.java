package homePagePackageTest;

import homePagePackage.ContactUs;
import org.testng.annotations.Test;

public class ContactUsTest extends ContactUs {

    @Test(priority = 1)
    public void ContactUsButtonT() {
        ContactUsButton();

    }

    @Test(priority = 3)
    public void BackToHelpHomeT() {
        BackToHelpHome();
    }
    @Test (priority = 4)
    public void AndroidButtonT(){
        AndroidButton();
    }
    @Test (priority = 5)
    public void IOSButtonT(){
        IOSButton();
    }


    @Test
    public void Quit() {
        Quit();
    }

}



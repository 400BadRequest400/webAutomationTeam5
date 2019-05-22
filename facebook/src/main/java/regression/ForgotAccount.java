package regression;

import base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class ForgotAccount extends CommonAPI {

    @FindBy(xpath = ".//*[@id='login_form']/table/tbody/tr[3]/td[2]/div/a")
  WebElement forget;

    @FindBy(xpath= ".//*[@id='identify_email']")
    WebElement email;

    public void Forgotacc(String Email){
        forget.click();
        email.sendKeys(Email);
    }

    public void goToSignUpPage() {
    }
}

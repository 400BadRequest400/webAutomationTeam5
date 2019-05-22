package regressionSignIn;

import base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Target_Create_Account extends CommonAPI {

    @FindBy(id = "account")
    WebElement signbutton;

    @FindBy(xpath = "//*[@id=\"accountNav-createAccount\"]/a/div")
    WebElement accountButton;

    @FindBy(id = "username")
    WebElement username;

    @FindBy(id = "firstname")
    WebElement firstname;

    @FindBy(id = "lastname")
    WebElement lastname;

    @FindBy(name = "phone")
    WebElement phones;

    @FindBy(id = "password")
    WebElement pass;

    @FindBy(id = "createAccount")
    WebElement create;



    public void TargetCreateAccount(String email, String first, String last, String phone, String password){

        signbutton.click();
        sleepFor(2);
        accountButton.click();
        sleepFor(2);
        username.sendKeys(email);
        sleepFor(2);
        firstname.sendKeys(first);
        sleepFor(2);
        lastname.sendKeys(last);
        sleepFor(2);
        phones.sendKeys(phone);
        sleepFor(2);
        pass.sendKeys(password);
        sleepFor(2);
        create.click();
        sleepFor(2);



    }
}

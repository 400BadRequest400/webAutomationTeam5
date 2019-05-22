package regressionSignIn;

import base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Target_SignIn extends CommonAPI {

    @FindBy(id = "account")
    WebElement signInButton;

    @FindBy(xpath = "//*[@id=\"accountNav-signIn\"]/a/div")
    WebElement signInButton2;

    @FindBy(xpath = "//input[@id='username']")
    WebElement UserName;

    @FindBy(xpath = "//input[@id='password']")
    WebElement Password;

    @FindBy(xpath = "//button[@id='login']")
    WebElement SigninRedButton;


    public void Target_SignIn(String user,String password){
        signInButton.click();
        sleepFor(2);
        signInButton2.click();
        UserName.sendKeys(user);
        Password.sendKeys(password);
        sleepFor(2);
        SigninRedButton.click();
    }



}

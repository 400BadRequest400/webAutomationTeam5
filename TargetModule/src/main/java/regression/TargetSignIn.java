package regression;

import base.CommonAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class TargetSignIn extends CommonAPI {


    @FindBy(xpath = "//*[@id=\"account\"]")
    WebElement signInButton;

    @FindBy(xpath = "//*[@id=\"accountNav-signIn\"]/a/div")
    WebElement signInButton2;

    @FindBy(xpath = "//input[@id='username']")
    WebElement UserName;

    @FindBy(xpath = "//input[@id='password']")
    WebElement Password;

    @FindBy(xpath = "//button[@id='login']")
    WebElement SigninRedButton;


    public void SignIn(String user,String password){
        signInButton.click();
        sleepFor(2);
        signInButton2.click();
        UserName.sendKeys(user);
        Password.sendKeys(password);
        sleepFor(2);
        SigninRedButton.click();
    }
















}

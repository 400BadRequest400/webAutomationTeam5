package regression;

import base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.annotations.Test;

public class Register extends CommonAPI {


    @FindBy(xpath ="//input[@class='inputtext _58mg _5dba _2ph-' and @name='firstname']" )
    WebElement fristname;
    public void sendname(){
        fristname.sendKeys("rabah");


    }
    @Test
    public void register() {
        typeByXpath("//input[@class='inputtext _58mg _5dba _2ph-' and @name='firstname']","rabah");
        typeByXpath("//input[@class='inputtext _58mg _5dba _2ph-' and @name='lastname']","11111111");
        typeByXpath("//input[@class='inputtext _58mg _5dba _2ph-' and @name='reg_email__']","rabah@gmail.com");
        sleepFor(2);
        typeByXpath("//input[@class='inputtext _58mg _5dba _2ph-' and @name='reg_passwd__']","1234");
        clickByXpath("//select[@name='birthday_month']");
        clickByXpath("//*[@id='month']/option[6]");

        clickByXpath("//select[@name='birthday_day']");
        clickByXpath("//*[@id='day']/option[11]");

        clickByXpath("//select[@name='birthday_year']");
        clickByXpath("//*[@id='year']/option[30]");
        clickByXpath("//*[@id='u_0_a']");
        clickByXpath("//*[@id=\"u_0_15\"]");
    }
}

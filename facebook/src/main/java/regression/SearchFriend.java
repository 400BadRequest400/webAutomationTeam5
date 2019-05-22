package regression;

import base.CommonAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class SearchFriend extends CommonAPI {
    Login Page = PageFactory.initElements(driver, Login.class);
    public void SearchFunction() {


        Page.signin("rabaharabsaid@yahoo.fr","11111");
        clickByXpath("//input[@class='_1frb']");
        typeByXpath("//input[@class='_1frb']","rabah bouaza");
    }
    @Test
    public  void friendRequest(){
       Login Page = PageFactory.initElements(driver, Login.class);
        Page.signin("rabaharabsaid@yahoo.fr","mothersister");
        driver.findElement(By.xpath("//*[@id=\"u_i_2\"]/input[2]")).sendKeys("rabah", Keys.ENTER);
       sleepFor(2);
        clickByXpath("//div[@class='_4xjz'][contains(text(),'People')]");
        clickByXpath("//*[@class='_42ft _4jy0 FriendRequestAdd addButton _4jy3 _517h _51sy'][1]");
    }
    public void postAstatus(){
        Login Page = PageFactory.initElements(driver, Login.class);
        Page.signin("rabaharabsaid@yahoo.fr","11111");
        clickByXpath("//a[@class='_2s25'][contains(text(),'Home')]");
        typeByXpath("//textarea[@class='_3en1 _480e navigationFocus']","test");
        //clickByXpath("//button[@class='_1mf7 _4jy0 _4jy3 _4jy1 _51sy selected _42ft']");
    }
    public void deleteAstatus(){
        //login();
        clickByXpath("");

    }
}

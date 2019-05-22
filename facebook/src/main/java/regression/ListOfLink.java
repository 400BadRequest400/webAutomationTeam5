package regression;

        import base.CommonAPI;
        import org.openqa.selenium.WebElement;
        import org.openqa.selenium.support.FindBy;
        import org.openqa.selenium.support.How;

public class ListOfLink extends CommonAPI {

    @FindBy(css= ".uiList.localeSelectorList._2pid._509-._4ki._6-h._6-j._6-i>li>a")
    WebElement espaniol;

    @FindBy(xpath = "//*[@id=\"pageFooter\"]/ul/li[1]")
    WebElement france;

    @FindBy(css= "._42ft._4jy0._517i._517h._51sy")
    WebElement Showmorelanguage;

    @FindBy(linkText = "People")
    WebElement friend;

    @FindBy(xpath= "//*[@id=\"js_0\"]/ul/li[3]/a")
    WebElement messenger;

    @FindBy(css= ".login_form_label_field>div>a")
    WebElement forgetaccount;

    @FindBy(xpath = "//*[@id=\"js_2\"]/ul/li[5]/a")
    WebElement watch;


    public void clickespaniol() {
        espaniol.click();
    }


    public void clickArabic(){
        france.click();
    }

    public void MoreSign(){
        Showmorelanguage.click();
    }

    public void People(){
        friend.sendKeys("why do i need to put my birthday");
    }

    public void setting(){

        messenger.getText();
    }

    public void fgact(){
        forgetaccount.click();
    }

    public void clickNaviagtorbar(){
        watch.click();
    }
}

package regressiontest;


        import base.CommonAPI;
        import regression.ListOfLink;
        import org.openqa.selenium.support.PageFactory;
        import org.testng.annotations.Test;

public class TestListOfLink extends CommonAPI {

    @Test(priority = 20)
    public void espaniol(){
        ListOfLink fbdif = PageFactory.initElements(driver, ListOfLink.class);
        fbdif.clickespaniol();
        sleepFor(2);
    }

    @Test(priority = 21)
    public void France(){
        ListOfLink listOfLink = PageFactory.initElements(driver, ListOfLink.class);
        listOfLink.clickArabic();
       sleepFor(2);
    }
    @Test(priority = 22)
    public void Showmorelanguage(){
        ListOfLink listOfLink = PageFactory.initElements(driver, ListOfLink.class);
        listOfLink.MoreSign();
        sleepFor(2);
    }
    @Test(priority = 23)
    public void morehelp(){
        ListOfLink listOfLink = PageFactory.initElements(driver, ListOfLink.class);
        listOfLink.People();
        sleepFor(2);
    }
    @Test(priority = 24)
    public void messenger() {
        ListOfLink listOfLink = PageFactory.initElements(driver, ListOfLink.class);
        listOfLink.setting();
      sleepFor(2);
    }
    @Test(priority = 25)
    public void forgetaccount(){
        ListOfLink listOfLink = PageFactory.initElements(driver, ListOfLink.class);
        listOfLink.fgact();
        sleepFor(2);
    }
    @Test(priority = 26)
    public void wach(){
        ListOfLink listOfLink = PageFactory.initElements(driver, ListOfLink.class);
        listOfLink.clickNaviagtorbar();
        sleepFor(2);
    }
}
package regressiontest;


        import base.CommonAPI;
        import regression.OpenFcbAcc;
        import org.openqa.selenium.support.PageFactory;
        import org.testng.annotations.Test;


public class TestOpenFcbAcc extends CommonAPI {

    @Test(priority = 1)
    public void registerNewUser() {
        OpenFcbAcc nm = PageFactory.initElements(driver, OpenFcbAcc.class);
        nm.setFirstName();
    }

    @Test(priority = 2)
    public void inputlastname() {
        OpenFcbAcc ln = PageFactory.initElements(driver, OpenFcbAcc.class);
        ln.setLastName();
    }

    @Test(priority = 3)
    public void inputemail() {
        OpenFcbAcc email = PageFactory.initElements(driver, OpenFcbAcc.class);
        email.setEmail();
    }
    @Test(priority = 4)
    public void phonenbr(){
        OpenFcbAcc nbr = PageFactory.initElements(driver, OpenFcbAcc.class);
        nbr.setphonenbr();
    }

    @Test(priority = 5)
    public void password(){
        OpenFcbAcc pss= PageFactory.initElements(driver, OpenFcbAcc.class);
        pss.setPassword();
    }
    @Test(priority = 6)
    public void month() {
        OpenFcbAcc mth = PageFactory.initElements(driver, OpenFcbAcc.class);
        mth.setSelectMonth();
    }

    @Test(priority = 7)
    public void days() {
        OpenFcbAcc day = PageFactory.initElements(driver, OpenFcbAcc.class);
        day.setDay();
    }

    @Test(priority = 8)
    public void year() {
        OpenFcbAcc yr = PageFactory.initElements(driver, OpenFcbAcc.class);
        yr.setyear();
    }
    @Test(priority = 9)
    public void male() {
        OpenFcbAcc ml = PageFactory.initElements(driver, OpenFcbAcc.class);
        ml.male();
    }

    @Test(priority = 10)
    public void createaccount() {
        OpenFcbAcc acc = PageFactory.initElements(driver, OpenFcbAcc.class);
        acc.createaccount();
    }
}
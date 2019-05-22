package regression;


        import base.CommonAPI;

        import org.openqa.selenium.WebElement;
        import org.openqa.selenium.support.FindBy;

        import static java.lang.Thread.sleep;

public class OpenFcbAcc extends CommonAPI {

    @FindBy(name ="firstname")
     WebElement FirstNameBox;

    @FindBy(name = "lastname")
    public static WebElement LastNameBox;

    @FindBy(name= "reg_email__")
    public static WebElement Email;

    @FindBy ( xpath = "//*[@id='u_0_h']")
    public static WebElement phone;

    @FindBy(name= "reg_passwd__")
    public static WebElement password;

    @FindBy(id = "month")
    public static WebElement selectMotnth;

    @FindBy(id= "day")
    public static WebElement selectDay;

    @FindBy(id= "year")
    public static WebElement selectYear;

    @FindBy(id="u_0_a")
    public static WebElement maleBtn;

    @FindBy(name = "websubmit")
    public static WebElement createAcc;

    public void setFirstName (){
        FirstNameBox.sendKeys("rabah");
    }

    public void setLastName (){
        LastNameBox.sendKeys("arabsaid");
    }
    public void setEmail (){
        Email.sendKeys("rabah@gamil.com");
    }
    public void setphonenbr (){
        phone.sendKeys("6316918686");
    }
    public void setPassword(){
        password.sendKeys("222222");
    }
    public void setSelectMonth() {
        selectMotnth.sendKeys("06");
    }
    public void setDay (){
        selectDay.sendKeys("11");
    }
    public void setyear(){
        selectYear.sendKeys("2019");
    }

    public void male(){
        maleBtn.click();
    }

    public void createaccount(){
        createAcc.click();
    }
}
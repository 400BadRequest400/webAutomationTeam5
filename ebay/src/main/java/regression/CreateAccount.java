package regression;

import base.CommonAPI;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class CreateAccount extends CommonAPI {


    public  void creatAcounturl() {
        clickByXpath("//*[@id=\"gh-ug\"]/a");

    }
    public void creatAcount(){
        clickByXpath("//*[@id=\"gh-ug\"]/a");
        clickByXpath("//a[@id='InLineCreateAnAccount']");



            typeByXpath("//*[@id='firstname']", "rachid");


            typeByXpath("//*[@id='lastname']", "Ait chait");

            typeByXpath("//*[@id='email']", "raitchait1@gmail.com");

            typeByXpath("//*[@id='PASSWORD']", "12345");

            clickByXpath("//*[@id='ppaFormSbtBtn']");
        }
    }

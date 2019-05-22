package regressiontest;

import base.CommonAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import regression.SearchLocation;
import regression.language;

public class TestSearchLocation extends CommonAPI {
@Test
    public  void location(){
    SearchLocation page = PageFactory.initElements(driver,SearchLocation.class);
    page.find();
    page.search("algeria");
    sleepFor(2);
    page.search();
    sleepFor(2);
    }
}

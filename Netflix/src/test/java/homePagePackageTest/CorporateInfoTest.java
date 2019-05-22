package homePagePackageTest;

import homePagePackage.CorporateInfo;
import org.testng.annotations.Test;

public class CorporateInfoTest extends CorporateInfo {

    @Test(priority = 1)
    public void InfoByCountryT() {

        InfoByCountry();
    }

    @Test(priority = 2)
    public void backHomePageT() {
        backHomePage();
    }

}

package regressionTest;

import org.testng.annotations.Test;
import regression.SearchClass;

public class SearchClassTest extends SearchClass {
    @Test(priority = 46)
    public void searchfieldtest(){
        searchField();
        sleepFor(2);

        womenswimsuit();
        sleepFor(2);

        underwear();
        sleepFor(2);
    }

    @Test(priority = 47)
    public void searchfieldtest2(){
        searchField();
        sleepFor(2);

        GiftCards();
        sleepFor(2);

        allDesign();
        sleepFor(2);
    }
}

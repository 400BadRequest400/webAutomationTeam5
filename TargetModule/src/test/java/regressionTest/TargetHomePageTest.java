package regressionTest;

import org.testng.annotations.Test;
import regression.TargetHomePage;

public class TargetHomePageTest extends TargetHomePage {

    @Test(priority = 45)
    public void MethodTest(){
        HomepageMethod();
    }
}

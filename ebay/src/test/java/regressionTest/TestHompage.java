package regressionTest;

import org.testng.annotations.Test;
import regression.HomePage;

public class TestHompage extends HomePage {
    @Test(priority = 3)
    public void testhomepage(){
        homepage();
    }
}

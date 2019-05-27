package regressionTest;

import org.testng.annotations.Test;
import regression.Login;

public class TestLogin extends Login {
    @Test(priority = 4)
    public void testlogin(){
        login();
    }
    @Test(priority = 5)
    public void testUsernampassword(){
        login2();
    }
}

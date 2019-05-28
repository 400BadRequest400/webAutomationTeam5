package regressionTest;

import base.CommonAPI;
import org.testng.annotations.Test;
import regression.CreateAccount;
import regression.HomePage;

public class TestCreatAccount extends CreateAccount {

    //create  Account
    @Test(priority = 1)
    public  void test() {
        creatAcounturl();

    }
    @Test(priority = 2)
    public void test1(){
        creatAcount();
    }
}


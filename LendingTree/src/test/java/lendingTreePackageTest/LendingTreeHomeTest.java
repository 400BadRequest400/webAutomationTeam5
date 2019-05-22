package lendingTreePackageTest;

import lendingTreePackage.LendingTreeHome;
import org.testng.annotations.Test;

public class LendingTreeHomeTest extends LendingTreeHome {

    @Test (priority = 1)
    public void CheckLandingT(){
        CheckLanding();
        sleepFor(2);
    }
    @Test (priority = 2)
    public void PersonalLoanT(){
        PersonalLoan();
    }
    @Test(priority = 3)
    public void DropHomeBuyT(){
        DropHomeBuy();
        sleepFor(3);
    }

    }

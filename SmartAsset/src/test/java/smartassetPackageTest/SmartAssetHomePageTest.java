package smartassetPackageTest;

import org.testng.annotations.Test;
import smartassetPackage.SmartAssetHomePage;

public class SmartAssetHomePageTest extends SmartAssetHomePage {

    @Test(priority = 1)
    public void HomePageT() {
        HomePage();
    }

    @Test(priority = 2)
    public void FinancialAdvisorT() {
        FinancialAdvisor();
        sleepFor(2);
    }

    @Test(priority = 3)
    public void AffordabilityEstimateT(){
        AffordabilityEstimate();
        sleepFor(1);
    }


}


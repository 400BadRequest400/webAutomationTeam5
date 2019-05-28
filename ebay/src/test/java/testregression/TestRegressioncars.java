package testregression;


import base.CommonAPI;
import org.testng.annotations.Test;
import regresioncars.CrasToyoya;

public class TestRegressioncars extends CrasToyoya {

    @Test (priority =28 )
   public void search(){
        searchMotors();
        sleepFor(2);
    }

    @Test(priority = 29)
    public void searchMotors1(){
        searchMotors();
        sleepFor(2);

    }
    @Test(priority = 30)
public void searchcaryear2(){
        searchCarmodels();
    sleepFor(2);
}
@Test(priority = 31)
    public void testmouseHover1(){
    testmouseHover();
}
}

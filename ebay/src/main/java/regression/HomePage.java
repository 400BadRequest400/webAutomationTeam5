package regression;
import base.CommonAPI;

public class HomePage extends CommonAPI {
    public   void  homepage() {
        System.out.println(driver.getTitle());
        sleepFor(2);

    }

}
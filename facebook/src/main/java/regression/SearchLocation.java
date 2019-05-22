package regression;

import base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SearchLocation extends CommonAPI {
    @FindBy(xpath = "//*[@id=\"js_0\"]/ul/li[13]/a")
    WebElement clicklocation;
    public void find() {
        clicklocation.click();
    }

    @FindBy(xpath = "//*[@id=\"q_dashboard\"]")
    String x;
    public void search(String locationame) {
        typeByXpath("//*[@id=\"q_dashboard\"]", locationame);
    }

    @FindBy(xpath = "//*[@id=\"q_dashboard\"]")
    WebElement srch;
    public void search() {
        srch.click();
    }
}

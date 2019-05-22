package regression;

import base.CommonAPI;
import org.openqa.selenium.By;

public class SearchClass extends CommonAPI {

    public void searchField(){
        clickByXpath("//input[@id='search']");
    }
    public void womenswimsuit(){
        clickByXpath("//div[contains(text(),'womens swimsuits')]");

    }
    public void underwear(){
        clickByXpath("//span[contains(text(),'Color')]");
    }
    public void GiftCards(){
        clickByXpath("//div[@class='TypeaheadItemText'][contains(text(),'gift cards')]");
    }
    public void allDesign(){
        clickByXpath("//span[contains(text(),'All designs')]");
    }
    public void Baby(){

    }





}

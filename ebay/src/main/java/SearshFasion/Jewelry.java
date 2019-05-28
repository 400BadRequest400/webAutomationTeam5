package SearshFasion;

import base.CommonAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

public class Jewelry extends CommonAPI {

 @FindBy(xpath = "//button[@id='gh-shop-a']")
 WebElement categories;


 @FindBy(xpath = "//h3[@class='gh-sbc-parent']//a[contains(text(),'Fashion')]")
 WebElement fashion;

 @FindBy(xpath = "//span[contains(text(),'Jewelry')]")
 WebElement jewelry;

 @FindBy(xpath = "//a[contains(text(),'Shop Jewelry')]")
 WebElement ShopJewelry;

 public void CategoriesFshion(){
  categories.click();
  fashion.click();
  sleepFor(2);
  jewelry.click();
  sleepFor(2);
  ShopJewelry.click();
  sleepFor(2);
 }
}
package testsearch;

import base.CommonAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestCategoriesFashion extends CommonAPI {

    SearshFasion.Jewelry Jewelry;

    @BeforeMethod
    public void search() {
        Jewelry = PageFactory.initElements(driver, SearshFasion.Jewelry.class);

    }

    SearshFasion.Beauty beauty;

    @BeforeMethod
    public void search1() {
        beauty = PageFactory.initElements(driver, SearshFasion.Beauty.class);
    }
    SearshFasion.Shoes Shoes;

    @BeforeMethod
    public void search3() {
        Shoes = PageFactory.initElements(driver, SearshFasion.Shoes.class);
    }

    SearshFasion.Watches Watches;

    @BeforeMethod
    public void search4() {
        Watches = PageFactory.initElements(driver, SearshFasion.Watches.class);
    }
    SearshFasion.WomensClothing womensClothing;

    @BeforeMethod
    public void search5() {
        womensClothing = PageFactory.initElements(driver, SearshFasion.WomensClothing.class);
    }
    SearshFasion.MensClothing mensClothing;

    @BeforeMethod
    public void search6() {
        mensClothing = PageFactory.initElements(driver, SearshFasion.MensClothing.class);
    }
    SearshFasion.Adidas adidas;
    @BeforeMethod
    public void search7(){
        adidas.topbrandAdidas();
    }


    @Test(priority = 6)
    public void Jewelry(){

Jewelry.CategoriesFshion();

    }
    @Test(priority = 7)
    public void Beauty(){
        beauty.CategoriesFshion();
    }
@Test(priority = 8)
    public void Shoes(){
        Shoes.CategoriesFshion();
}
@Test(priority = 9)
    public void Watches(){
        Watches.CategoriesFshion();
}
@Test(priority = 10)
    public void WomensClothing(){
        womensClothing.CategoriesFshion2();
}
@Test(priority = 11)
    public void Mensclothing(){
    mensClothing.CategoriesFshion1();
}


@Test(priority =30 )
public void setAdidas(){
    adidas.topbrandAdidas();
}
}


package regressionCategoriesTest;

import base.CommonAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import regressionSearch.*;

public class TargetSearchTest extends CommonAPI {

    Target_Shower_Curtain search;
    @BeforeMethod
    public void init1(){
        search = PageFactory.initElements(driver, Target_Shower_Curtain.class);
    }

    Target_Clothing_Deals deal;
    @BeforeMethod
    public void init2(){
        deal = PageFactory.initElements(driver, Target_Clothing_Deals.class);
    }

    Target_Gift_Cards giftcard;
    @BeforeMethod
    public void init3(){
        giftcard = PageFactory.initElements(driver, Target_Gift_Cards.class);
    }

    Target_Cube_Storage cubestorage;
    @BeforeMethod
    public void init4(){
        cubestorage = PageFactory.initElements(driver, Target_Cube_Storage.class);
    }

    Target_Women_Dresses womendresses;
    @BeforeMethod
    public void init5(){
        womendresses = PageFactory.initElements(driver, Target_Women_Dresses.class);
    }

    Target_Throw_Blanket throwblanket;
    @BeforeMethod
    public void init6(){
        throwblanket = PageFactory.initElements(driver, Target_Throw_Blanket.class);
    }

    Target_Women_Shoes womenshoes;
    @BeforeMethod
    public void init7(){
        womenshoes = PageFactory.initElements(driver, Target_Women_Shoes.class);
    }
    Target_Comforter_Set comforterset;
    @BeforeMethod
    public void init8(){
        comforterset = PageFactory.initElements(driver, Target_Comforter_Set.class);
    }
    Target_Beach_Towel beachtowel;
    @BeforeMethod
    public void init9(){
        beachtowel = PageFactory.initElements(driver, Target_Beach_Towel.class);
    }
    Target_Women_Swimsuits swimsuits;
    @BeforeMethod
    public void init10(){
        swimsuits = PageFactory.initElements(driver, Target_Women_Swimsuits.class);
    }


    @Test(priority = 26)
    public void Targetsearchtest(){
        search.TargetShowerCurtain();
    }
    @Test(priority = 27)
    public void TargetClothingDealtest(){
        deal.TargetClothingDeals();
    }
    @Test(priority = 28)
    public void TargetGiftCardstest(){
        giftcard.TargetGiftCards();
    }
    @Test(priority = 29)
    public void TargetCubeStoragetest(){
        cubestorage.TargetCubeStorage();
    }
    @Test(priority = 30)
    public void TargetWomenDressesTest(){
        womendresses.TargetWomenDresses();
    }
    @Test(priority = 31)
    public void TargetThrowBlanketTest(){
        throwblanket.TargetThrowBlanket();
    }
    @Test(priority = 32)
    public void TargetWomenShoesTest(){
        womenshoes.TargetWomenShoes();
    }
    @Test(priority = 33)
    public void TargetComforterSetTest(){
        comforterset.TargetComforterSet();
    }
    @Test(priority = 34)
    public void TargetBeachtoweltest(){
        beachtowel.TargetBeachTower();
    }
    @Test(priority = 35)
    public void TargetWomenSwimsuitsTest(){
        swimsuits.TargetWomenSwimSuits();
    }


}

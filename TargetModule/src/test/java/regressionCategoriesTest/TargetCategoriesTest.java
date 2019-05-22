package regressionCategoriesTest;

import base.CommonAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import regressionCategories.*;

public class TargetCategoriesTest extends CommonAPI {

    Categories_Women women;
    @BeforeMethod
    public void init1(){
        women = PageFactory.initElements(driver, Categories_Women.class);
    }

    Categories_Men men;
    @BeforeMethod
    public void init2(){
        men = PageFactory.initElements(driver, Categories_Men.class);
    }

    Categories_Kids kid;
    @BeforeMethod
    public void init3(){
        kid = PageFactory.initElements(driver, Categories_Kids.class);
    }

    Categories_Home home;
    @BeforeMethod
    public void init4(){
        home = PageFactory.initElements(driver, Categories_Home.class);
    }

    Categories_Toys toys;
    @BeforeMethod
    public void init5(){
        toys = PageFactory.initElements(driver, Categories_Toys.class);
    }

    Categories_Electronics electronics;
    @BeforeMethod
    public void init6(){
        electronics = PageFactory.initElements(driver, Categories_Electronics.class);
    }

    Categories_Baby babies;
    @BeforeMethod
    public void init7(){
        babies = PageFactory.initElements(driver, Categories_Baby.class);
    }

    Categories_Pets pets;
    @BeforeMethod
    public void init8(){
        pets = PageFactory.initElements(driver, Categories_Pets.class);
    }

    Categories_Clearence clearence;
    @BeforeMethod
    public void init9(){
        clearence = PageFactory.initElements(driver, Categories_Clearence.class);
    }

    Categories_Groceries groceries;
    @BeforeMethod
    public void init10(){
        groceries = PageFactory.initElements(driver, Categories_Groceries.class);
    }



    // Test setup
    @Test(priority = 16)
    public void CategoriesWomenTest(){
        women.CategoriesWomen();
    }
    @Test(priority = 17)
    public void CategoriesMenTest(){
        men.CategoriesMen();
    }
    @Test(priority = 18)
    public void CategoriesKidsTest(){
        kid.Categorieskids();
    }
    @Test(priority = 19)
    public void CategoriesHomeTest(){
        home.CategoriesHome();
    }
    @Test(priority = 20)
    public void CategoriesToysTest(){
        toys.CategoriesToys();
    }
    @Test(priority = 21)
    public void CategoriesElectronicsTest(){
        electronics.CategoriesElectronics();
    }
    @Test(priority = 22)
    public void CategoriesBabyTest(){
        babies.CategoriesBaby();
    }
    @Test(priority = 23)
    public void CategoriesPetsTest(){
        pets.CategoriesPets();
    }
    @Test(priority = 24)
    public void CategoriesclearenceTest(){
        clearence.CategoriesClearence();
    }
    @Test(priority = 25)
    public void CategoriesgroceriesTest(){
        groceries.CategoriesClearence();
    }

}

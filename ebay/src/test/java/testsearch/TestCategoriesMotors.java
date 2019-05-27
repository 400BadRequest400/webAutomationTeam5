package testsearch;

import base.CommonAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import searchMotors.*;

public class TestCategoriesMotors extends CommonAPI {
    ClassicCras classicCras;

    @BeforeMethod
    public void search () {
        classicCras = PageFactory.initElements(driver, ClassicCras.class);
        }
        Boats boats;
        @BeforeMethod
        public void search1(){
            boats = PageFactory.initElements(driver,Boats.class);

        }
        CollectorCars collectorCars;

        @BeforeMethod
        public void search3(){
            collectorCars = PageFactory.initElements(driver,CollectorCars.class);
        }
CommercialTrucks commercialTrucks;
    @BeforeMethod
    public void search4(){
        commercialTrucks = PageFactory.initElements(driver,CommercialTrucks.class);
    }
    ElectricCrars electricCrars;
    @BeforeMethod
    public void search5(){
        electricCrars = PageFactory.initElements(driver,ElectricCrars.class);
    }
    Trailers trailers;
    @BeforeMethod
    public void search6(){
        trailers = PageFactory.initElements(driver,Trailers.class);
    }
        @Test(priority = 12)
    public void setClassicCras(){
        classicCras.CategoriesMotors();
        }
        @Test(priority = 13)
    public void setBoats(){
        boats.CategoriesMotors();
        }
        @Test(priority = 14)
    public void collectorCars(){
        collectorCars.CategoriesMotors();

        }
        @Test(priority = 18)
    public void Boats(){
        boats.CategoriesMotors();
    }
    }

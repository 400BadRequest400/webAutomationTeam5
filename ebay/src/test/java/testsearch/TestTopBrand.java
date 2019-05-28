package testsearch;

import SearshFasion.Adidas;
import base.CommonAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import sun.rmi.transport.Channel;
import topbrand.*;

public class TestTopBrand extends CommonAPI {
SearshFasion.Adidas Adidas;
@BeforeMethod
        public void int1(){
    Adidas = PageFactory.initElements(driver,Adidas.class);
}
AirJordan AirJordan;
@BeforeMethod
public void int2(){
    AirJordan = PageFactory.initElements(driver,AirJordan.class);

}
Anthropologie Anthropologie;
@BeforeMethod
    public void int3(){
    Anthropologie= PageFactory.initElements(driver,Anthropologie.class);
}
CalvinKlein CalvinKlein;
@BeforeMethod
    private void int4(){
    CalvinKlein = PageFactory.initElements(driver,CalvinKlein.class);


}
    Channel channel1;
@BeforeMethod
    public void int5(){
    channel1 = PageFactory.initElements(driver,Channel.class);
}
Coach coach;

@BeforeMethod
    public void int6(){
    coach = PageFactory.initElements(driver,Coach.class);
}
DavidYuman davidYuman;
@BeforeMethod
    public void int7(){
    davidYuman = PageFactory.initElements(driver,DavidYuman.class);
}
FreePeople freePeople;
@BeforeMethod
    public void int8(){
    freePeople =PageFactory.initElements(driver,FreePeople.class);
}
Gucci gucci;
@BeforeMethod
    public void int9(){
    gucci = PageFactory.initElements(driver,Gucci.class);
}
Invicta invicta;
@BeforeMethod
public void int10(){
    invicta =PageFactory.initElements(driver,Invicta.class);
}
Levis levis;
@BeforeMethod
    public void int111(){
    levis =PageFactory.initElements(driver,Levis.class);
}
    @Test(priority = 19)
    public void adidas(){

        Adidas.topbrandAdidas();

    }
    @Test(priority = 20)
    public void setAirJordan(){
    AirJordan.topbrandairjordan();
    }
    @Test(priority = 21)
    public void setAnthropologie(){
    Anthropologie.topanthropologie();
    }
    @Test(priority = 22)
    public void setCalvinKlein(){
    CalvinKlein.topbrandcalvinKlein();
    }
    @Test(priority = 23)
    public void Channel(){

    }
@Test(priority = 24)
    public void setCoach(){
    coach.topbrandCoach();
}
@Test(priority = 25)
    public  void setDavidYuman(){
    davidYuman.topbrandavidyrman();
}
@Test(priority = 26)
    public void setFreePeople(){
    freePeople.topbrandfreepeople();
}
@Test(priority = 27)
    public void setGucci(){
    gucci.topbrandgucci();
}
@Test(priority = 28)
    public void setInvicta(){
    invicta.topbrandinvicta();
}
    @Test(priority = 29)
    public void setLevis(){
    levis.topbrandlevis();
    }



















}
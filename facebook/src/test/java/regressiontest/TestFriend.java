package regressiontest;

import base.CommonAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import regression.SearchFriend;

public class TestFriend extends CommonAPI {
    @Test
    public static void friend (){
        SearchFriend page = PageFactory.initElements(driver, SearchFriend.class);
       page.friendRequest();

    }

}

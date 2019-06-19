package testfacebookhomepage;

import Base.CommonAPI;
import facebookhomepage.FacebookHomepage;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestFacebookHomepage extends CommonAPI {
    FacebookHomepage testfacebook;

    String url = "https://www.facebook.com/";

    @BeforeMethod
    public void initialization(){
        testfacebook = PageFactory.initElements(driver, FacebookHomepage.class);
        driver.get(url);
    }
    @Test
    public void logintoFacebook(){
        testfacebook.facebooklogin();
    }

    @Test
    public void clickonhelp(){
        testfacebook.clickhelp();
    }

}

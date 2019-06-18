package testamazonhomepage;

import Base.CommonAPI;
import amazonhomepage.AmazonHomepage;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestAmazonHomepage extends CommonAPI {

    AmazonHomepage TestHomepage;
    public String url ="www.amazon.com/";

    @BeforeMethod
    public void intialization(){
        TestHomepage = PageFactory.initElements(driver,AmazonHomepage.class);
        driver.get(url);
    }

    @Test
    public void clicksignIn(){
        TestHomepage.clicksignIn();
        TestHomepage.signin();
    }
    @Test
    public void clickforgetpass(){
        TestHomepage.clicksignIn();
        TestHomepage.forgetpass();
    }
    @Test
    public void searchbooks(){
        TestHomepage.purchase();
    }




}

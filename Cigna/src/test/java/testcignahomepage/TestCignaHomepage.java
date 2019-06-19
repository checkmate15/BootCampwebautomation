package testcignahomepage;

import Base.CommonAPI;
import cignahomepage.CignaHomepage;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestCignaHomepage extends CommonAPI {
    CignaHomepage testcigna;

    String url ="https://www.cigna.com/";

    @BeforeMethod
    public void initialization(){
        testcigna = PageFactory.initElements(driver, CignaHomepage.class);
        driver.get(url);
    }

    @Test
    public void SignIn(){
        testcigna.clickonSignIn();
        handleNewTab(driver);
        testcigna.setSignIn();
        driver.navigate().to(url);
    }
    @Test
    public void resetaccout(){
        testcigna.clickonSignIn();
        handleNewTab(driver);

        testcigna.resetidandpass();
        driver.navigate().to(url);
    }
    @Test
    public void clickfinddoctor(){
        testcigna.helthcare();
        driver.navigate().to(url);
    }
}

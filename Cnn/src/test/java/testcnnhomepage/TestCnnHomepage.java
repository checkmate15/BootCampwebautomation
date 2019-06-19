package testcnnhomepage;

import Base.CommonAPI;
import cnnhomepage.CnnHomepage;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestCnnHomepage extends CommonAPI {
    CnnHomepage testCnn;

    @BeforeMethod
    public void initialization(){
        testCnn = PageFactory.initElements(driver,CnnHomepage.class);
    }

    @Test
    public void SetUsTest(){
        testCnn.setUs();
    }

    @Test
    public void testPolitics(){
        testCnn.checkpolitics();
    }
}

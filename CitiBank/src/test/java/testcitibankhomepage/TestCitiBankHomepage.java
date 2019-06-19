package testcitibankhomepage;


import Base.CommonAPI;
import citibankhomepage.CitiBankHomepage;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestCitiBankHomepage extends CommonAPI {
    CitiBankHomepage testcitibank;

    @BeforeMethod
    public void intializitaion(){
        testcitibank = PageFactory.initElements(driver,CitiBankHomepage.class);
    }

}

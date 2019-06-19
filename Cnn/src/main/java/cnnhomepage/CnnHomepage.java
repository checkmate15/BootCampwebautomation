package cnnhomepage;

import Base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CnnHomepage extends CommonAPI {
    @FindBy(xpath = "//*[@id=\"nav\"]/div[2]/div[2]/a[1]")
    WebElement us;
    @FindBy(xpath = "//*[@id=\"nav-section-submenu\"]/a[1]")
    WebElement submenu;
    @FindBy(xpath = "//*[@id=\"nav-section-submenu\"]/a[2]")
    WebElement energy;

    public void setUs() {
        us.click();
        submenu.click();
        driver.navigate().back();
        energy.click();
    }
    public void checkpolitics(){
        clickByXpath("//*[@id=\"nav\"]/div[2]/div[2]/a[3]");
        clickByXpath("//*[@id=\"nav\"]/div/div[2]/div[2]/ul[1]/li[2]/a");
        driver.navigate().back();
        clickByXpath("//*[@id=\"nav\"]/div/div[2]/div[2]/ul[1]/li[3]/a");
    }

}

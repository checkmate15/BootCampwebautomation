package facebookhomepage;

import Base.CommonAPI;

public class FacebookHomepage extends CommonAPI {
    public void facebooklogin(){
        typeByXpath("//*[@id=\"email\"]","ahmed.adnan57@outlook.com");
        typeByXpath("//*[@id=\"pass\"]","asfaff");
        clickByXpath("//*[@id=\"u_0_2\"]");
    }

    public void clickhelp(){
        clickByXpath("//*[@title='Visit our Help Center.']");
    }
}
package pages.serenitysteps.website1;


import helperClass.ClickClass;
import locators.Website1;
import net.thucydides.core.annotations.Step;
import utils.Cookies;
import pages.serenitypages.website1.*;

public class NavigationWebsite1Steps
        implements Website1 {

    ClickClass clickClass;


    FooterPage footerPage;
    KontaktPage kontaktPage;
    FormularzeZostawNumerPage formularzeZostawNumerPage;

    @Step
    public  void openFooterPage(){
        footerPage.open();
        Cookies.setRodoCookieWebsite1();
    }

    @Step
    public void openKontaktPage(){
        kontaktPage.open();
        Cookies.setRodoCookieWebsite1();

    }

    @Step
    public void openFormularzeZostawNumerPage(){
        formularzeZostawNumerPage.open();
        Cookies.setRodoCookieWebsite1();
    }

}

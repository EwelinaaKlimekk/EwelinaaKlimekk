package pages.serenitysteps.steps;

import helperClass.ClickClass;
import locators.Website1;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

public class ClickSteps extends PageObject implements Website1 {

    ClickClass clickClass;

    @Step
    public void clickSelectAllAgreements(By locator) {
        clickClass.clickSelectAllAgreements(locator);
    }

    @Step
    public void clickButtonWithActionAndWait(By locator) {
        clickClass.doubleClickButtonWithAction(locator);
    }

    @Step
    public void clickButtonWithAction(By locator) {
        clickClass.clickButtonWithAction(locator);
    }


    @Step
    public void clickAndHoldAndClickButtonWithActionByCss(By locator) {
        clickClass.clickAndHoldBtn(locator);
    }

    @Step
    public void clickAndClickWithAction(By locator) {
        clickClass.expandOrCloseDescriptionBtn(locator);
    }

    @Step
    public void doubleClickAndSendKeyWithAction(By locator, String text) {
        clickClass.doubleClickAndSendKeyWithAction(locator,text);
    }

    @Step
    public void clickBtn(By locator){
        clickClass.clickBtn(locator);
    }

    @Step
    public void clickDropdownAndSelectTopic(By locator){
        clickClass.clickDropdownAndSelect(locator);
    }


    @Step
    public void doubleClickButtonWithAction(By locator) {
        clickClass.doubleClickButtonWithAction(locator);
    }
}


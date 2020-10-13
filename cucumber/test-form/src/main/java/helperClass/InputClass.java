package helperClass;

import org.openqa.selenium.By;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

public class InputClass extends PageObject {

    public void typeAndWaitInputById(By locator1, String phoneNumber) {
        WebElementFacade field = $(locator1);
        waitFor(field).waitUntilClickable();
        field.type(phoneNumber);
    }

    public void typeInputById(By locator1, String phoneNumber) {
        waitForElementToBeVisibleById(locator1);
        $(locator1).type(phoneNumber);
    }

    public void typeTwoInputById(By locator1, String phoneNumber1, By locator2, String phoneNumber2) {
        typeInputById(locator1, phoneNumber1);
        typeInputById(locator2, phoneNumber2);
    }

    public void typeByClassName(By locator1, String phoneNumber) {
        waitForElementToBeVisibleById(locator1);
        $(locator1).type(phoneNumber);
    }

    public void typeAllInput(By locator1, By locator2, By locator3,
                             String phoneNumber, String email, String phoneNumberRet) {
        WebElementFacade $phoneNumber = $(locator1);
        $phoneNumber.isClickable();
        $(locator1).type(phoneNumber);
        $(locator2).type(email);
        $(locator3).type(phoneNumberRet);
    }

    public void typePhoneNumberByCss(By locator1, String number1) {
        WebElementFacade $buttonSubmit = $(locator1);
        $buttonSubmit.waitUntilClickable();
        withAction().moveToElement($buttonSubmit).build().perform();
        $buttonSubmit.click();
        $buttonSubmit.type(number1);
    }

    public void waitForElementToBeVisibleById(By locator) {
        WebElementFacade webElementFacade = $(locator);
        waitFor(webElementFacade).isVisible();
    }
}

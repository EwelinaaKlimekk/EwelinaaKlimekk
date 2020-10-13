package pages.serenitysteps.steps;

import helperClass.InputClass;
import net.thucydides.core.annotations.Step;
import org.openqa.selenium.By;


public class InputSteps {

    InputClass inputClass;

    @Step
    public void typeTwoInputById(By locator1, String phoneNumber1, By locator2, String phoneNumber2) {
        inputClass.typeTwoInputById(locator1, phoneNumber1, locator2, phoneNumber2);
    }

    @Step
    public void typePhoneNumber(By locator1, String phoneNumber) {

        inputClass.typeAndWaitInputById(locator1, phoneNumber);
    }

    @Step
    public void typeAllInput(By locator1, By locator2, By locator3, String phoneNumber, String email, String phoneNumberRet) {
        inputClass.typeAllInput(locator1, locator2, locator3, phoneNumber, email, phoneNumberRet);
    }
}

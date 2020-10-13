package pages.serenitysteps.steps;

import helperClass.ErrorsClass;
import net.thucydides.core.annotations.Step;
import org.openqa.selenium.By;

public class ErrorsSteps {

    ErrorsClass errorsClass;

    @Step
    public void checkIfErrorIsDisplayed(By locator) {

        errorsClass.checkIfErrorIsDisplayed(locator);
    }

    @Step
    public void checkIfThreeErrorMessagesAreDisplayed(By locator1, By locator2, By locator3) {
        errorsClass.checkIfMultipleErrorsAreDisplayed(locator1, locator2, locator3);
    }

    public void checkIfErrorMessageIsCorrect(By locator, String text) {
        errorsClass.checkIfErrorIsCorrect(locator, text);
    }

    @Step
    public void checkIfErrorMessagesAreCorrect(By locator1, By locator2, By locator3,
                                               String text1, String text2, String text3) {
        errorsClass.checkIfMultipleErrorsAreCorrect(locator1, locator2, locator3, text1, text2, text3);
    }

    @Step
    public void checkIfErrorMessagesAreCorrect(By locator1, By locator2,
                                               String text1, String text2) {
        errorsClass.checkIfMultipleErrorsAreCorrect(locator1, locator2, text1, text2);
    }

    @Step
    public void checkIfErrorMessagesAreCorrect(By locator1, By locator2,
                                               String text1) {
        errorsClass.checkIfNetminingErrorAreCorrect(locator1, locator2, text1);
    }

    @Step
    public void checkIfErrorMessagesAreCorrectConsents(By locator1, By locator2, By locator3,
                                                       String text1) {
        errorsClass.checkIfSameErrorIsCorrectThreeTimes(locator1, locator2, locator3, text1);
    }

    @Step
    public void checkIfThreeErrorMessagesAreDisplayed(By locator1, By locator2) {
        errorsClass.checkIfMultipleErrorsAreDisplayed(locator1, locator2);
    }

    @Step
    public void checkIfErrorMassagesEmptyDataAreCorrect(By locator1, By locator2,
                                                        String text1, String text2) {
        errorsClass.checkIfEmptyDataErrorsAreCorrect(locator1, locator2, text1, text2);
    }

    @Step
    public void checkIfTwoErrorMassagesAreDisplayed(By locator1, By locator2) {
        errorsClass.checkIfMultipleErrorsAreDisplayed(locator1, locator2);
    }

    @Step
    public void checkIfTwoErrorMessagesAreCorrect(By locator1, By locator2,
                                                  String text1, String text2) {
        errorsClass.checkIfMultipleErrorsAreCorrect(locator1, locator2, text1, text2);
    }
}

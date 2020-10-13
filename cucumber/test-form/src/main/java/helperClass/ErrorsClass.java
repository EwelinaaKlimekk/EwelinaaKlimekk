package helperClass;

import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import static org.junit.Assert.assertEquals;

public class ErrorsClass extends PageObject {

    public void checkIfErrorIsDisplayed(By locator) {
        WebElement txtErrorMessage = getDriver().findElement(locator);
        txtErrorMessage.isDisplayed();
    } // 1

    public void checkIfMultipleErrorsAreDisplayed(By locator1, By locator2) {
        checkIfErrorIsDisplayed(locator1);
        checkIfErrorIsDisplayed(locator2);
    } // 2

    public void checkIfMultipleErrorsAreDisplayed(By locator1, By locator2, By locator3) {
        checkIfErrorIsDisplayed(locator1);
        checkIfErrorIsDisplayed(locator2);
        checkIfErrorIsDisplayed(locator3);
    } // 3


    public void checkIfErrorIsCorrect(By locator, String text) {
        WebElement txtErrorMessage = getDriver().findElement(locator);
        System.out.println(txtErrorMessage);
        assertEquals(txtErrorMessage.getText(), text);
    } // = 1

    public void checkIfMultipleErrorsAreCorrect(By locator1, By locator2,
                                                String text1, String text2) {
        checkIfErrorIsCorrect(locator1, text1);
        checkIfErrorIsCorrect(locator2, text2);
    } // =2

    public void checkIfMultipleErrorsAreCorrect(By locator1, By locator2, By locator3,
                                                String text1, String text2, String text3) {
        checkIfErrorIsCorrect(locator1, text1);
        checkIfErrorIsCorrect(locator2, text2);
        checkIfErrorIsCorrect(locator3, text3);
    } // =3


    public void checkIfEmptyDataErrorsAreCorrect(By locator1, By locator2,
                                                 String text1, String text2) {
        checkIfErrorIsCorrect(locator1, text1);
        checkIfErrorIsCorrect(locator2, text2);
    }

    public void checkIfNetminingErrorAreCorrect(By locator1, By locator2,
                                                String text1) {
        checkIfErrorIsCorrect(locator1, text1);
        checkIfErrorIsCorrect(locator2, text1);
    }

    public void checkIfSameErrorIsCorrectThreeTimes(By locator1, By locator2,
                                                    By locator3, String text1) {
        checkIfErrorIsCorrect(locator1, text1);
        checkIfErrorIsCorrect(locator2, text1);
        checkIfErrorIsCorrect(locator3, text1);
    }
}

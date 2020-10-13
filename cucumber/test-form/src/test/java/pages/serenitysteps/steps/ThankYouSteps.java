package pages.serenitysteps.steps;

import helperClass.ThankYouClass;
//import helperClass.WaitClass;
import helperClass.WaitClass;
import net.thucydides.core.annotations.Step;
import org.openqa.selenium.By;

public class ThankYouSteps {

    ThankYouClass thankYouClass;
    WaitClass waitClass;

    @Step
    public void getThankYouText(By locator, String text) {
        waitClass.waitForElementToBeVisible(locator);
        thankYouClass.getThankYouTextAndWait(locator, text);
    }

    @Step
    public void thankYouTextIsNotVisible(By locator) {
        thankYouClass.thankYouTextIsNotVisible(locator);
    }
}

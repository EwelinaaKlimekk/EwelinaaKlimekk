package helperClass;

import generic.assertions.AssertWebElement;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.By;

public class ThankYouClass extends PageObject {

    public void getThankYouTextAndWait(By locator, String text) {
        WebElementFacade txtThankYouPage = $(locator);
        waitFor(txtThankYouPage).waitUntilVisible();
        AssertWebElement.assertThat(txtThankYouPage).hasText(text);
    }

    public void thankYouTextIsNotVisible(By locator) {
        WebElementFacade $txtThankYouPageF = $(locator);
        $txtThankYouPageF.shouldNotBeVisible();
    }

}

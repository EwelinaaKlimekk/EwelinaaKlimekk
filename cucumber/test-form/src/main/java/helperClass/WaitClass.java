package helperClass;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.By;

import java.time.Duration;

public class WaitClass extends PageObject {

    public void waitForElementToBeClicked(By locator) {
        WebElementFacade webElementFacade = $(locator);
        waitFor(webElementFacade).isClickable();
    }

    public void waitForElementToBeVisible(By locator) {
        WebElementFacade webElementFacade = $(locator);
        waitFor(webElementFacade).isVisible();
    }

    public void waitAndClickBtn(By locator) {
        withTimeoutOf(Duration.ofSeconds(30))
                .find(locator)
                .click();
    }

    public void waitUntilElementIsClickable(By locator) {
        WebElementFacade $input = $(locator);
        element($input).withTimeoutOf(Duration.ofSeconds(30)).isClickable();
    }

}

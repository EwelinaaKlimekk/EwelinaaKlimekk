package helperClass;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;

import java.time.Duration;

public class ClickClass extends PageObject {

    WaitClass waitClass;

    public void clickBtn(By locator) {
        WebElementFacade $elementFacade = $(locator);
        $elementFacade.waitUntilClickable();
        withAction().moveToElement($elementFacade).build().perform();
        $elementFacade.click();
    }

    public void clickOrderServiceOnMainPage(By locator) {
        WebElementFacade mainBtn = $(locator);
        waitFor(mainBtn).waitUntilClickable();
        mainBtn.click();
    }

    public void clickOnButtonThatWillEventuallyAppear(By locator) {
        withTimeoutOf(Duration.ofSeconds(30))
                .find(locator);
    }

    public void clickSelectAllAgreements(By locator) {
        WebElementFacade $checkboxAllStatements = $(locator);
       withAction().moveToElement($checkboxAllStatements).build().perform();
        $(locator).click();
    }

    public void doubleClickButtonWithAction(By locator) {
        waitClass.waitUntilElementIsClickable(locator);
        WebElementFacade $buttonSubmit = $(locator);
        withAction().moveToElement($buttonSubmit).doubleClick().build().perform();
    }

    public void doubleClickAndSendKeyWithAction(By locator, String text) {
        waitClass.waitUntilElementIsClickable(locator);
        WebElementFacade $buttonSubmit = $(locator);
        withAction().moveToElement($buttonSubmit).doubleClick().sendKeys(text).build().perform();
    }

    public void clickButtonWithAction(By locator) {
        WebElementFacade $buttonZamawiam = $(locator);
        withAction().moveToElement($buttonZamawiam).build().perform();
        $buttonZamawiam.click();
    }

    public void expandOrCloseDescriptionBtn(By locator) {
        WebElementFacade fullDescBtn = $(locator);
        waitFor(fullDescBtn).waitUntilVisible();
        withAction().moveToElement(fullDescBtn).build().perform();
        fullDescBtn.click();
    }

    public void moveToElementAndClick(By locator) {
        WebElementFacade fullDescBtn = $(locator);
        waitFor(fullDescBtn).waitUntilClickable();
        withAction().moveToElement(fullDescBtn).build().perform();
        fullDescBtn.click();
    }

    public void clickDropdownAndSelect(By locator) {
        WebElementFacade fullDescBtn = $(locator);
        Select select = new Select(fullDescBtn);
        select.selectByIndex(1);
    }

    public void scrollIntoView(By locator) {
        WebElementFacade $elementFacade = $(locator);
        evaluateJavascript("arguments[0].scrollIntoView(true);", $elementFacade);
    }

    public void clickAndHoldBtn(By locator) {
        waitClass.waitUntilElementIsClickable(locator);
        WebElementFacade $buttonSubmit = $(locator);
        withAction().moveToElement($buttonSubmit).clickAndHold().build().perform();
        $buttonSubmit.click();
    }
}
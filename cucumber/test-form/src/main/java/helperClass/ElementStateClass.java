package helperClass;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.ElementClickInterceptedException;
import org.openqa.selenium.WebElement;

import java.util.List;

public class ElementStateClass extends PageObject {

    ClickClass clickClass;

    public void popinIsVisible(By locator) {
        WebElementFacade $popin = $(locator);
        $popin.isVisible();
    }

    public void popinIsNotVisible(By locator) {
        WebElementFacade $popin = $(locator);
        $popin.shouldNotBeVisible();
    }

    public void switchToIFrame(By locator) {
        WebElement element = getDriver().findElement(locator);
        getDriver().switchTo().frame(element);
    }

    public boolean checkIfButtonIsEnabled(By locator) {
        WebElement element = getDriver().findElement(locator);
        return element.getAttribute("class").equals("green-button");
    }

    public void assertIfButtonSendIsNonActive(By locator) {
        WebElement btnSend = getDriver().findElement(locator);
        boolean btnSendIsNonActive = btnSend.isEnabled();
        Assert.assertFalse(btnSendIsNonActive);
    }

    public void checkIfElementIsVisibleAndClick(By locator) throws ElementClickInterceptedException {
        try {
            WebElement element = getDriver().findElement(locator);
            if (element.isDisplayed()) {
                clickClass.clickAndHoldBtn(locator);
            }
        } catch (ElementClickInterceptedException ignored) {
        }
    }

    public void selectDropdown(String searchText, By selectConversationTheme, By selectOption) {
        WebElement dropdown = getDriver().findElement(selectConversationTheme); //
        dropdown.click(); // assuming you have to click the "dropdown" to open it
        WebElement list = getDriver().findElement(selectOption);//second locator to list
        List<WebElement> options = list.findElements(org.openqa.selenium.By.tagName("div"));
        for (WebElement option : options) {
            if (option.getText().equals(searchText)) {
                option.click();
                break;
            }
        }
    }
}

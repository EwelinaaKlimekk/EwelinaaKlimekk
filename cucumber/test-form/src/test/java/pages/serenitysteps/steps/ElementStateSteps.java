package pages.serenitysteps.steps;

import helperClass.ElementStateClass;
import net.thucydides.core.annotations.Step;
import org.openqa.selenium.By;

import java.time.Duration;

public class ElementStateSteps {

    ElementStateClass elementStateClass;


    @Step
    public void checkIfPopinIsVisible(By locator) {
        elementStateClass.popinIsVisible(locator);
    }

    @Step
    public void checkIfPopinIsNotVisible(By locator) {
        elementStateClass.popinIsNotVisible(locator);
    }


    @Step
    public void clickCheckbox(By locator) {
        elementStateClass.withTimeoutOf(Duration.ofSeconds(30))
                .find(locator)
                .click();
    }

    @Step
    public void selectDropdown(String searchText, By selectConversationTheme, By selectOption) {
        elementStateClass.selectDropdown(searchText, selectConversationTheme, selectOption);
    }

    @Step
    public void checkIfElementIsVisibleAndClick(By locator) {
        elementStateClass.checkIfElementIsVisibleAndClick(locator);
    }

}

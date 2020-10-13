package pages.serenitysteps.steps;

import helperClass.WaitClass;
import net.thucydides.core.annotations.Step;
import org.openqa.selenium.By;


public class WaitSteps {
    WaitClass waitClass;

    @Step
    public void waitForElementToBeVisible(By locator) {
        waitClass.waitForElementToBeVisible(locator);
    }

    @Step
    public void waiForElementToAppearAndClick(By locator){
        waitClass.waitAndClickBtn(locator);
    }
}

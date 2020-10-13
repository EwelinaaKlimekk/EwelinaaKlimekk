package generic.assertions;

import net.serenitybdd.core.pages.WebElementFacade;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.assertj.core.api.AbstractAssert;

//public class AssertWebElement extends AbstractAssert<AssertWebElement, WebElement> {
public class AssertWebElement extends AbstractAssert<AssertWebElement, WebElementFacade> {

    private final Logger logger = LogManager.getLogger(AssertWebElement.class);

    public AssertWebElement(WebElementFacade webElement) {
        super(webElement, AssertWebElement.class);
    }

    public static AssertWebElement assertThat(WebElementFacade webElement){
        return new AssertWebElement(webElement);
    }

    //Metoda do sprawdzania czy element jest wyświetlony
    public AssertWebElement isDisplayed(){
        logger.info("Element is displayed.");
        isNotNull();

        if(!actual.isDisplayed()){
            failWithMessage("Element was not displayed.");
        }
        logger.info("WebElement was displayed.");
        return this;
    }

    public AssertWebElement isEmpty() {
        logger.info("Element is not displayed.");
        isNull();

        if(!actual.isDisplayed()){
            failWithMessage("Element is displayed.");
        }
        logger.warn("Element is displayed.");
        return this;
    }

    //Metoda do sprawdzenia czy element posiada zadany tekst
    public AssertWebElement hasText(String expectedTextValue){
        logger.info("Has text: " + expectedTextValue);
        isNotNull();

        String actualElementText = actual.getText();
        if(!actualElementText.equals(expectedTextValue)){
            failWithMessage("Element text was <%s> expecting to be <%s>.", actualElementText, expectedTextValue);
        }

        logger.info("WebElement had expected text.");
        return this;
    }

    public void isEnabled(){
        isNotNull();

        if (!actual.isEnabled()) {
            failWithMessage("Checkbox is not enabled.");
        }
        logger.info("Checkbox is enabled.");
    }

    public void containsText(String expectedTextValue){
        logger.info("Has text: " + expectedTextValue);
        isNotNull();

        String actualElementText = actual.getText();
        if(!actualElementText.contains(expectedTextValue)){
            failWithMessage("Element text contains expected <%s>.", actualElementText, expectedTextValue);
        }

        logger.info("WebElement contains expected text." );
    }
}

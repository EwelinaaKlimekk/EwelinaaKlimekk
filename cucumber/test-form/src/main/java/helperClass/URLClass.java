package helperClass;

import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.By;
import utils.URLValidation;


public class URLClass extends PageObject {
    public void validateUrl(By locator) {
        String clauseLink = $(locator).getAttribute("href");
        URLValidation.isValid(clauseLink);
    }

}

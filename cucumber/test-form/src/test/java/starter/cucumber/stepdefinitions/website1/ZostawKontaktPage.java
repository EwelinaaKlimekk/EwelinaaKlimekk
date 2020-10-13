package starter.cucumber.stepdefinitions.website1;

import io.cucumber.java.en.*;
import locators.Website1;
import net.thucydides.core.annotations.Steps;
import pages.serenitysteps.website1.NavigationWebsite1Steps;
import pages.serenitysteps.steps.*;

public class ZostawKontaktPage implements Website1 {

    @Steps
    NavigationWebsite1Steps navigationWebsite1Steps;
    @Steps
    WaitSteps waitSteps;
    @Steps
    ClickSteps clickSteps;
    @Steps
    ErrorsSteps errorsSteps;
    @Steps
    InputSteps inputSteps;
    @Steps
    ThankYouSteps thankYouSteps;


    @Given("User is on site.")
    public void userIsOnSite() {
        navigationWebsite1Steps.openKontaktPage();
    }

    @When("User enters the phone number {string}")
    public void userEntersThePhoneNumber(String number) {
        inputSteps.typePhoneNumber(CONTACT_PHONE_NUMBER, number);
    }

    @And("User enters the email {string}")
    public void userEntersTheEmail(String email) {
        inputSteps.typePhoneNumber(CONTACT_EMAIL, email);
    }

    @And("User select dropdown")
    public void userSelectDropdown() {
        clickSteps.clickDropdownAndSelectTopic(CONTACT_DROPDOWN);

    }

    @And("Accepts all required agreements")
    public void acceptsAllRequiredAgreements() {
        clickSteps.clickSelectAllAgreements(CONTACT_ALL_AGREEMENTS);
    }

    @And("User clicks submit button")
    public void userClicksSubmitButton() {
        clickSteps.clickAndClickWithAction(CONTACT_BUTTON_SUBMIT);
    }


    @Then("Thank you message appears on-screen")
    public void thankYouMessageAppearsOnScreen() {
        thankYouSteps.getThankYouText(CONTACT_TXT_THANK_YOU_TEXT, "Dziękujemy za wypełnienie formularza");
    }

    @When("User enters the incorrect phone number {string}")
    public void userEntersTheIncorrectPhoneNumber(String number) {
        inputSteps.typePhoneNumber(CONTACT_PHONE_NUMBER, number);
    }

    @And("User enters the incorrect email {string}")
    public void userEntersTheIncorrectEmail(String email) {
        inputSteps.typePhoneNumber(CONTACT_EMAIL, email);
    }

    @Then("The thank you text isn't displayed")
    public void theThankYouTextIsnTDisplayed() {
        thankYouSteps.thankYouTextIsNotVisible(CONTACT_TXT_THANK_YOU_TEXT);
    }

    @And("Validation message appears on-screen")
    public void validationMessageAppearsOnScreen() {
        errorsSteps.checkIfTwoErrorMessagesAreCorrect(CONTACT_ERROR_MESSAGE_PHONE_NUMBER,CONTACT_ERROR_MESSAGE_EMAIL
                , "Poprawny format numeru to XXX XXX XXX lub XXXXXXXXX",
                "Błędny e-mail");
    }


    @But("The phone number field status is empty")
    public void thePhoneNumberFieldStatusIsEmpty() {
        inputSteps.typePhoneNumber(CONTACT_PHONE_NUMBER, " ");
        inputSteps.typePhoneNumber(CONTACT_EMAIL, " ");
    }


    @And("Validation messages appears on-screen")
    public void validationMessagesAppearsOnScreen() {
        errorsSteps.checkIfErrorIsDisplayed(CONTACT_ERROR_MESSAGE_AGREEMENT);

    }

    @And("Validation message appears on-screen when the fields are empty")
    public void validationMessageAppearsOnScreenWhenTheFieldsAreEmpty() {
        errorsSteps.checkIfTwoErrorMessagesAreCorrect(CONTACT_ERROR_MESSAGE_PHONE_NUMBER,CONTACT_ERROR_MESSAGE_EMAIL
                , "Poprawny format numeru to XXX XXX XXX lub XXXXXXXXX",
                "Pole wymagane");
    }
}

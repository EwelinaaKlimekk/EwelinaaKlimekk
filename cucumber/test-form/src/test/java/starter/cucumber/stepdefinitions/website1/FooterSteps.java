package starter.cucumber.stepdefinitions.website1;

import io.cucumber.java.en.*;
import locators.Website1;
import net.thucydides.core.annotations.Steps;
import pages.serenitysteps.website1.NavigationWebsite1Steps;
import pages.serenitysteps.steps.*;

public class FooterSteps implements Website1 {

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

    @Given("User is on main site plus")
    public void user_is_on_site_plus_footer() {
        navigationWebsite1Steps.openFooterPage();
    }

    @When("User enters the {string} plus footer")
    public void user_enters_phone_number(String phoneNumber) {
        clickSteps.clickButtonWithActionAndWait(FOOTER_PHONE_NUMBER);
        inputSteps.typePhoneNumber(FOOTER_PHONE_NUMBER,phoneNumber);
    }

    @And("User marks checkbox Chce przedłuzyc umowę w Plusie plus footer")
    public void user_marks_checkbox_Chce_przedluzyc_umowe_w_plusie() {
        clickSteps.clickAndClickWithAction(FOOTER_CHECKBOX_NUMER_RET);
    }

    @And("User enters the second input {string} plus footer")
    public void user_enters_phone_number_extend(String phoneNumber) {
        inputSteps.typePhoneNumber(FOOTER_PHONE_NUMBER_RET,phoneNumber);
    }
    @And("User marks checkbox Zaznacz wszystkie zgody plus footer")
    public void user_marks_checkbox_Zaznacz_wszystkie_zgody() {
        clickSteps.clickSelectAllAgreements(FOOTER_ALL_AGREMENT);
    }
    @And("User clicks Wyslij button plus footer")
    public void user_clicks_wyslij_button() {
        clickSteps.clickBtn(FOOTER_BUTTON_WYSLIJ);
    }

    @Then("Thank you message appears on-screen plus footer")
    public void the_thank_you_text_is_displayed() {
        thankYouSteps.getThankYouText(FOOTER_TXT_THANK_YOU_TEXT,"Dziękujemy za wypełnienie formularza");
    }

    @But("The phone numbers aren't correct plus footer")
    public void the_phone_numbers_aren_t_correct() {
        errorsSteps.checkIfErrorIsDisplayed(FOOTER_ERROR_MESSAGE_PHONE_NUMBER);
        errorsSteps.checkIfErrorIsDisplayed(FOOTER_ERROR_MESSAGE_PHONE_NUMBER_RET);
    }

    @Then("The thank you text isn't displayed plus footer")
    public void the_thank_you_text_isn_t_displayed() {
        thankYouSteps.thankYouTextIsNotVisible(ZOSTAW_NUMER_WIELOSIM_TXT_THANK_YOU_TEXT);
    }

    @And("The error messages about phone numbers are displayed plus footer")
    public void the_error_message_about_phone_numbers_are_displayed() {
        errorsSteps.checkIfErrorMessageIsCorrect(FOOTER_ERROR_MESSAGE_PHONE_NUMBER,"Poprawny format numeru to XXX XXX XXX lub XXXXXXXXX");
        errorsSteps.checkIfErrorMessageIsCorrect(FOOTER_ERROR_MESSAGE_PHONE_NUMBER_RET,"Poprawny format numeru to XXX XXX XXX lub XXXXXXXXX");
    }

    @But("Zaznacz wszystkie zgody checkbox isn't marked plus footer")
    public void the_checkbox_zaznacz_wszystkie_zgody_isn_t_marked() {
        errorsSteps.checkIfErrorIsDisplayed(FOOTER_ERROR_MESSAGE_AGREMENT_1);
    }

    @And("The error message about agreement is displayed plus footer")
    public void the_error_message_about_zgody_is_displayed() {
        errorsSteps.checkIfErrorMessageIsCorrect(FOOTER_ERROR_MESSAGE_AGREMENT_1,"Informujemy, że wyrażenie zgód jest dobrowolne, ale bez wyrażenia zgód nie będziemy mogli przyjąć zgłoszenia.");
    }

    @But("The phone numbers aren't entered plus footer")
    public void the_phone_number_isn_t_entered() {
        errorsSteps.checkIfErrorIsDisplayed(FOOTER_ERROR_MESSAGE_PHONE_NUMBER);
        errorsSteps.checkIfErrorIsDisplayed(FOOTER_ERROR_MESSAGE_PHONE_NUMBER_RET);}

    @And("The error message about empty phone numbers are displayed plus footer")
    public void the_error_message_about_empty_phone_number_is_displayed() {
        errorsSteps.checkIfErrorMessageIsCorrect(FOOTER_ERROR_MESSAGE_PHONE_NUMBER,"Poprawny format numeru to XXX XXX XXX lub XXXXXXXXX");
        errorsSteps.checkIfErrorMessageIsCorrect(FOOTER_ERROR_MESSAGE_PHONE_NUMBER_RET,"Poprawny format numeru to XXX XXX XXX lub XXXXXXXXX");
    }

}

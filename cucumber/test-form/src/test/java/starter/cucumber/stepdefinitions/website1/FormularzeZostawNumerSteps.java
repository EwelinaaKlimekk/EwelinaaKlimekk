package starter.cucumber.stepdefinitions.website1;

import io.cucumber.java.en.*;
import locators.Website1;
import net.thucydides.core.annotations.Steps;
import pages.serenitysteps.website1.NavigationWebsite1Steps;
import pages.serenitysteps.steps.*;

public class FormularzeZostawNumerSteps implements Website1 {

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
    @Steps
    ElementStateSteps elementStateSteps;

    @Given("User is on zostaw kontakt plus site")
    public void user_is_on_site_website1_formularze_zostaw_numer_page() {
        navigationWebsite1Steps.openFormularzeZostawNumerPage();
    }

    @When("User enters the {string},{string} zostaw kontakt plus")
    public void user_enters_phone_number(String phoneNumber,String email) {
        clickSteps.clickButtonWithActionAndWait(FORMULARZE_ZOSTAW_NUMER_PHONE_NUMBER);
        inputSteps.typePhoneNumber(FORMULARZE_ZOSTAW_NUMER_PHONE_NUMBER,phoneNumber);
        inputSteps.typePhoneNumber(FORMULARZE_ZOSTAW_NUMER_EMAIL,email);
    }

    @And("User select dropdown zostaw kontakt plus")
    public void user_select_dropdown() {
//        clickAndClickWithActionSteps.clickByLinkText(FORMULARZE_ZOSTAW_NUMER_DROPDOWN);
        elementStateSteps.selectDropdown("Przenoszę numer do Plusa",FORMULARZE_ZOSTAW_NUMER_DROPDOWN,FORMULARZE_ZOSTAW_NUMER_DROPDOWN_2);
    }

    @And("User marks checkbox Zaznacz wszystkie zgody zostaw kontakt plus")
    public void user_marks_checkbox_Zaznacz_wszystkie_zgody() {
        clickSteps.clickSelectAllAgreements(FORMULARZE_ZOSTAW_NUMER_ALL_AGREMENT);
    }

    @And("User clicks Wyslij button zostaw kontakt plus")
    public void user_clicks_wyslij_button() {
        clickSteps.clickBtn(FORMULARZE_ZOSTAW_NUMER_BUTTON_WYSLIJ);
    }

    @Then("Thank you message appears on-screen zostaw kontakt plus")
    public void the_thank_you_text_is_displayed() {
        thankYouSteps.getThankYouText(FORMULARZE_ZOSTAW_NUMER_TXT_THANK_YOU_TEXT,"Dziękujemy za wypełnienie formularza");
    }

    @But("Data aren't correct plus footer zostaw kontakt plus")
    public void the_phone_numbers_aren_t_correct() {
        errorsSteps.checkIfErrorIsDisplayed(FORMULARZE_ZOSTAW_NUMER_ERROR_MESSAGE_PHONE_NUMBER);
        errorsSteps.checkIfErrorIsDisplayed(FORMULARZE_ZOSTAW_NUMER_ERROR_MESSAGE_EMAIL);
    }

    @Then("The thank you text isn't displayed zostaw kontakt plus")
    public void the_thank_you_text_isn_t_displayed() {
        thankYouSteps.thankYouTextIsNotVisible(FORMULARZE_ZOSTAW_NUMER_TXT_THANK_YOU_TEXT);
    }

    @And("The error messages about data are displayed zostaw kontakt plus")
    public void the_error_message_about_phone_numbers_are_displayed() {
        errorsSteps.checkIfErrorMessageIsCorrect(FORMULARZE_ZOSTAW_NUMER_ERROR_MESSAGE_PHONE_NUMBER,"Poprawny format numeru to XXX XXX XXX lub XXXXXXXXX");
        errorsSteps.checkIfErrorMessageIsCorrect(FORMULARZE_ZOSTAW_NUMER_ERROR_MESSAGE_EMAIL,"Błędny e-mail");
    }

    @But("Zaznacz wszystkie zgody checkbox isn't marked zostaw kontakt plus")
    public void the_checkbox_zaznacz_wszystkie_zgody_isn_t_marked() {
        errorsSteps.checkIfErrorIsDisplayed(FORMULARZE_ZOSTAW_NUMER_ERROR_MESSAGE_AGREMENT_1);
    }

    @And("The error message about agreement is displayed zostaw kontakt plus")
    public void the_error_message_about_zgody_is_displayed() {
        errorsSteps.checkIfErrorMessageIsCorrect(FORMULARZE_ZOSTAW_NUMER_ERROR_MESSAGE_AGREMENT_1,"Informujemy, że wyrażenie zgód jest dobrowolne, ale bez wyrażenia zgód nie będziemy mogli przyjąć zgłoszenia.");
    }

    @But("Data aren't entered zostaw kontakt plus")
    public void the_phone_number_isn_t_entered() {
        errorsSteps.checkIfErrorIsDisplayed(FORMULARZE_ZOSTAW_NUMER_ERROR_MESSAGE_PHONE_NUMBER);
        errorsSteps.checkIfErrorIsDisplayed(FORMULARZE_ZOSTAW_NUMER_ERROR_MESSAGE_EMAIL);
    }

    @And("The error message about empty data are displayed zostaw kontakt plus")
    public void the_error_message_about_empty_phone_number_is_displayed() {
        errorsSteps.checkIfErrorMessageIsCorrect(FORMULARZE_ZOSTAW_NUMER_ERROR_MESSAGE_PHONE_NUMBER,"Poprawny format numeru to XXX XXX XXX lub XXXXXXXXX");
        errorsSteps.checkIfErrorMessageIsCorrect(FORMULARZE_ZOSTAW_NUMER_ERROR_MESSAGE_EMAIL,"Pole wymagane");
    }

}

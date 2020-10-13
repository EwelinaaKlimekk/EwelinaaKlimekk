package locators;

import org.openqa.selenium.By;

public interface Website1 {

    /**
     * Scroll To View method in ClickStep
     * **/
    By SCROLL_TO_VIEW = By.cssSelector("#super-contact-form-new-contact .select-all-statements");

    //Plus
    By ZOSTAW_NUMER_ZATRZYMANIE_PHONE_NUMBER=By.id("form-leave-phone");//id
    By ZOSTAW_NUMER_ZATRZYMANIE_EMAIL=By.id("form-leave-mail");//id
    By ZOSTAW_NUMER_ZATRZYMANIE_PHONE_NUMBER_RET=By.id("form-leave-phone-ret");//id
    By ZOSTAW_NUMER_ZATRZYMANIE_ALL_AGREEMENT=By.className("select-all-statements");//class
    By ZOSTAW_NUMER_ZATRZYMANIE_BTN_WYSLIJ=By.id("submit-leave-form");//id
    By ZOSTAW_NUMER_ZATRZYMANIE_TXT_THANK_YOU_TEXT=By.xpath("//div[@id='form-lead-consultant']/p");
    By ZOSTAW_NUMER_ZATRZYMANIE_ERROR_MESSAGE_PHONE_NUMBER=By.cssSelector("#form-lead-consultant > div > div.green-cont > div.my-fields > div > div:nth-child(1) > span");//css
    By ZOSTAW_NUMER_ZATRZYMANIE_ERROR_MESSAGE_EMAIL=By.cssSelector("#form-lead-consultant > div > div.green-cont > div.my-fields > div > div:nth-child(2) > span");//css
    By ZOSTAW_NUMER_ZATRZYMANIE_ERROR_MESSAGE_PHONE_NUMBER_RET=By.cssSelector("#form-lead-consultant > div > div.green-cont > div.my-fields > div > div:nth-child(3) > span");//css
    By ZOSTAW_NUMER_ZATRZYMANIE_ERROR_MESSAGE_ALL_AGREEMENT=By.cssSelector("#form-lead-consultant > div > div.green-cont > div.statements-section > div.statements-container > div > div > div:nth-child(1) > span");//css

    By FOOTER_PHONE_NUMBER=By.id("telkontakt-footer");//id
    By FOOTER_CHECKBOX_NUMER_RET=By.id("checkbox-ret");//""#checkbox-ret";//id, css
    By FOOTER_PHONE_NUMBER_RET=By.id("telglowny-footer");//id
    By FOOTER_ALL_AGREMENT=By.className("select-all-statements");//class
    By FOOTER_BUTTON_WYSLIJ=By.id("submit-footer-form");//id
    By FOOTER_TXT_THANK_YOU_TEXT=By.cssSelector("div#glcf-footer-form > .thx-block");//css
    By FOOTER_ERROR_MESSAGE_PHONE_NUMBER=By.cssSelector(".input-section .otp-error:nth-of-type(1) .otp-error-label");//css
    By FOOTER_ERROR_MESSAGE_PHONE_NUMBER_RET=By.cssSelector(".input-section .otp-error:nth-of-type(3) .otp-error-label");//css
    By FOOTER_ERROR_MESSAGE_AGREMENT_1=By.cssSelector(".states .otp-error:nth-of-type(1) .otp-error-label");//css

    By FORMULARZE_ZOSTAW_NUMER_PHONE_NUMBER=By.id("nr_kontakt");//id
    By FORMULARZE_ZOSTAW_NUMER_EMAIL=By.id("email");//id
    By FORMULARZE_ZOSTAW_NUMER_DROPDOWN=By.linkText("Wybierz temat rozmowy");//linkText
    By FORMULARZE_ZOSTAW_NUMER_DROPDOWN_2=By.className("choice-cont");//className
    By FORMULARZE_ZOSTAW_NUMER_ALL_AGREMENT=By.className("select-all-statements");//className,//"div#super-contact-form-main  .statements-section  .select-all-statements";
    By FORMULARZE_ZOSTAW_NUMER_BUTTON_WYSLIJ=By.id("submit-super-cf");//id
    By FORMULARZE_ZOSTAW_NUMER_TXT_THANK_YOU_TEXT=By.cssSelector(".journal-content-article  h2");//css
    By FORMULARZE_ZOSTAW_NUMER_ERROR_MESSAGE_PHONE_NUMBER=By.cssSelector(".input-section > div:nth-of-type(1) > .otp-error-label");//css
    By FORMULARZE_ZOSTAW_NUMER_ERROR_MESSAGE_EMAIL=By.cssSelector(".input-section > div:nth-of-type(2) > .otp-error-label");//css
    By FORMULARZE_ZOSTAW_NUMER_ERROR_MESSAGE_AGREMENT_1=By.cssSelector(".states > div:nth-of-type(1) > .otp-error-label");//css

    By CONTACT_PHONE_NUMBER= By.id("nr_kontakt");
    By CONTACT_EMAIL=By.id("email");
    By CONTACT_DROPDOWN= By.className("choice-cont");
    By CONTACT_ALL_AGREEMENTS=By.className("select-all-statements");
    By CONTACT_BUTTON_SUBMIT=By.id("submit-super-cf");
    By CONTACT_TXT_THANK_YOU_TEXT=By.cssSelector(".typ h2");
    By CONTACT_ERROR_MESSAGE_PHONE_NUMBER=By.cssSelector("div:nth-of-type(1) > .otp-error-label");
    By CONTACT_ERROR_MESSAGE_EMAIL=By.cssSelector("div:nth-of-type(2) > .otp-error-label");
    By CONTACT_ERROR_MESSAGE_AGREEMENT=By.cssSelector("#super-contact-form-new-contact .statements-section .otp-error:nth-of-type(3) .otp-error-label");

    //Plus multisim ind
    By MULTISIM_SLIDER_NUMBER_OF_USERS = By.cssSelector(".multisim-slider ul li:nth-of-type(2)");
    By MULTISIM_BNT_WITHOUT_PHONE = By.cssSelector("div:nth-of-type(2) > .block-buttons .plk-button.plk-button-right.plk-button-white");
    By MULTISIM_BNT_NEXT_STEP = By.cssSelector(".next-step .cta-arrow");
    By MULTISIM_BNT_ORDER = By.cssSelector(".next-step .cta-arrow");
    By MULTISIM_INPUT = By.cssSelector(".input-wrapper [type]");
    By MULTISIM_ALL_AGREEMENT = By.cssSelector(".agreements-all-wrapper");
    By MULTISIM_BNT_SEND = By.cssSelector(".send-form");
    By MULTISIM_TXT_THANK_YOU_TEXT = By.cssSelector(".row.thank > h2");
    By MULTISIM_ERROR_MESSAGE = By.cssSelector(".error.input-wrapper > .error-msg");
    By MULTISIM_ERROR_MESSAGE_ALL_AGREEMENT = By.cssSelector(".agreements-all-wrapper.error > .error-msg");

    //Plus multisim soho
    By MULTISIM_SLIDER_NUMBER_OF_USERS_SOHO = By.cssSelector(".multisim-slider  ul > li:nth-of-type(2)");
    By MULTISIM_BNT_WITHOUT_PHONE_SOHO = By.cssSelector("div:nth-of-type(2) > .longBlock.offerBlock .plk-button.plk-button-right.plk-button-white > .xl");

    //Plus zostaw_numer_chat
    By ZOSTAW_NUMER_CHAT_INPUT_1_PLUS = By.id("chat-phone");
    By ZOSTAW_NUMER_CHAT_INPUT_2_PLUS = By.id("chat-ret-phone");
    By ZOSTAW_NUMER_CHAT_INPUT_CHECKBOX_PLUS = By.id("chat-checkbox");
    By ZOSTAW_NUMER_CHAT_ALL_AGREEMENT = By.cssSelector("div#form-chat-plk .select-all-statements");
    By ZOSTAW_NUMER_CHAT_SEND_BUTTON = By.id("submit-chat-form");
    By ZOSTAW_NUMER_CHAT_TXT_THANK_YOU_PAGE = By.cssSelector("div#form-chat-plk > p");
    By ZOSTAW_NUMER_CHAT_ERROR_MESSAGE_INPUT_1 = By.cssSelector(".input-section > div:nth-of-type(1) > .otp-error-label");
    By ZOSTAW_NUMER_CHAT_ERROR_MESSAGE_INPUT_2 = By.cssSelector(".input-section > div:nth-of-type(3) > .otp-error-label");
    By ZOSTAW_NUMER_CHAT_ERROR_MESSAGE_1 = By.cssSelector("#form-chat-plk .statements-section .otp-error:nth-of-type(1) .otp-error-label");
    By ZOSTAW_NUMER_CHAT_ERROR_MESSAGE_2 = By.cssSelector("#form-chat-plk .otp-error:nth-of-type(2) .otp-error-label");
    By ZOSTAW_NUMER_CHAT_ERROR_MESSAGE_3 = By.cssSelector("#form-chat-plk .statements-section .otp-error:nth-of-type(3) .otp-error-label");

    By INTERNET_LTE_PRZEDLUZ_UMOWE_BTN_PHONE_NUMBER=By.id("ret-otp-phone");//id
    By INTERNET_LTE_PRZEDLUZ_UMOWE_PHONE_NUMBER =By.id("ret-otp-phone");//id
    By INTERNET_LTE_PRZEDLUZ_BTN_SPRAWDZ=By.linkText("Sprawdź");
    By INTERNET_LTE_PRZEDLUZ_UMOWE_BTN_PHONE_NUMBER_LEAD=By.id("phone");
    By INTERNET_LTE_ALL_AGREEMENT=By.cssSelector("div.dev-statements-checkbox.input-row.select-all > label");//"label[for='select_all']";//css
    By INTERNET_LTE_BTN_WYSLIJ=By.linkText("Wyślij");//linkText
    By INTERNET_LTE_TXT_THANK_YOU_TEXT=By.cssSelector("#slide-ret-lead-bar > div.typ > h2");//css
    By INTERNET_LTE_ERROR_MESSAGE_PHONE_NUMBER=By.cssSelector("div > div.input-row.otp-error > span");//css
    By INTERNET_LTE_ERROR_MESSAGE_ALL_AGREEMENT=By.cssSelector("div.dev-statements-checkbox.input-row.select-all.otp-error > span");

    By ABONAMENT_ZMIEN_UMOWE_PHONE_NUMBER=By.id("nr_kontakt");//ID
    By ABONAMENT_ZMIEN_UMOWE_PHONE_NUMBER_TO_CHANGE=By.id("nr_glowny");
    By ABONAMENT_ZMIEN_UMOWE_ALL_AGREEMENT=By.className("select-all-statements");//CLASS_NAME
    By ABONAMENT_ZMIEN_UMOWE_BTN_WYSLIJ=By.id("submit-super-cf");
    By ABONAMENT_ZMIEN_UMOWE_TXT_THANK_YOU_TEXT=By.cssSelector("div.small-12.medium-6.large-6.columns.form-box > div.tym.typ > h2");
    By ABONAMENT_ZMIEN_UMOWE_ERROR_MESSAGE_PHONE_NUMBER=By.cssSelector("div.my-fields > div > div:nth-child(1) > span");
    By ABONAMENT_ZMIEN_UMOWE_ERROR_MESSAGE_PHONE_NUMBER_TO_CHANGE=By.cssSelector("div.my-fields > div > div:nth-child(2) > span");
    By ABONAMENT_ZMIEN_UMOWE_ERROR_MESSAGE_ALL_AGREEMENT=By.cssSelector("div.statements-container > div > div > div:nth-child(1) > span");

    By OFERTA_AMBASADORSKA_CHECKBOX_POTWIERDZAM=By.cssSelector("#wa-flex > a.chbox");//CSS
    By OFERTA_AMBASADORSKA_BTN_PRZEJDZ=By.cssSelector("#wa-flex > a.plk-button.plk-button-right");//CSS
    By OFERTA_AMBASADORSKA_BTN_ZOSTAW_KONTAKT=By.cssSelector("#offers > div:nth-child(1) > div.block-buttons > div > a");//CSS
    By OFERTA_AMBASADORSKA_PHONE_NUMBER=By.id("nr_kontakt");//id
    By OFERTA_AMBASADORSKA_ALL_AGREEMENT=By.cssSelector("#super-contact-form-bezpieczny > div > div.statements-section > div.statements-ctrl > a.select-all-statements");//CSS
    By OFERTA_AMBASADORSKA_BTN_WYSLIJ=By.id("submit-super-cf");//id
    By OFERTA_AMBASADORSKA_TXT_THANK_YOU_TEXT=By.cssSelector("div.tym.typ > h2");//css
    By OFERTA_AMBASADORSKA_ERROR_MESSAGE_PHONE_NUMBER=By.cssSelector("div.input-row.otp-error > span");//css
    By OFERTA_AMBASADORSKA_ERROR_MESSAGE_ALL_AGREEMENT=By.cssSelector("div.statements-container > div > div > div:nth-child(1) > span");//css

    By PRZEDLUZ_SMART_PHONE_NUMBER=By.id("phone-smart-ret");//id
    By PRZEDLUZ_SMART_ALL_AGREEMENT=By.className("select-all-statements");//CLASS NAME
    By PRZEDLUZ_SMART_BTN_WYSLIJ=By.id("smart-submit");//id
    By PRZEDLUZ_SMART_BTN_WYSLIJ_BY_CSS=By.cssSelector("#smart-submit");
    By PRZEDLUZ_SMART_TXT_THANK_YOU_TEXT=By.cssSelector("#formPrzedluzSmart > div > h3");//css
    By PRZEDLUZ_SMART_ERROR_MESSAGE_PHONE_NUMBER=By.cssSelector("#formPrzedluzSmart > div.form-cont > div.upper > div.my-fields > div > div > span");//css
    By PRZEDLUZ_SMART_ERROR_MESSAGE_ALL_AGREEMENT=By.xpath("//div[@class='dev-statements-checkbox input-row otp-error']/span");//xpath

    By ZOSTAW_NUMER_WIELOSIM_PHONE_NUMBER=By.id("phone-wielosim");//id
    By ZOSTAW_NUMER_WIELOSIM_ALL_AGREEMENT=By.className("select-all-statements");//CLASS NAME
    By ZOSTAW_NUMER_WIELOSIM_BTN_WYSLIJ=By.id("submit-wielosim");//id
    By ZOSTAW_NUMER_WIELOSIM_TXT_THANK_YOU_TEXT=By.cssSelector("By.cssSelector(#glcf-test > div > h3");//css
    By ZOSTAW_NUMER_WIELOSIM_ERROR_MESSAGE_PHONE_NUMBER=By.cssSelector("#glcf-test > div.form-cont > div.upper > div.my-fields > div > div > span");//css
    By ZOSTAW_NUMER_WIELOSIM_ERROR_MESSAGE_ALL_AGREEMENT=By.xpath("//div[@class='dev-statements-checkbox input-row otp-error']/span[@class='otp-error-label']");//xpath

    //Plus swiatłowód
    By SWIATLOWOD_INPUT_MIEJSCOWOSC=By.cssSelector("#app > div.all-form > div.row.inputs-row > div.input-wrapper.input-wrapper-city > input[type=text]");//css
    By SWIATLOWOD_INPUT_ULICA=By.cssSelector("#app > div.all-form > div.row.inputs-row > div.input-wrapper.input-wrapper-street > input[type=text]");//css
    By SWIATLOWOD_INPUT_NR_DOMU=By.cssSelector("#app > div.all-form > div.row.inputs-row > div.input-wrapper.small.input-wrapper-house > span");//css
    By SWIATLOWOD_BTN_SPRAWDZ_DOSTEPNOSC=By.cssSelector("#app > div.all-form > div.row.inputs-row > button");//CSS
    By SWIATLOWOD_ALL_AGREEMENT=By.cssSelector("label[for='agreements-check-all']");//CSS
    By SWIATLOWOD_BNT_SELECT= By.cssSelector("#app > div:nth-child(7) > div > div > div.offer-content > a"); //CSS
    By SWIATLOWOD_INPUT_PHONE_NUMBER= By.cssSelector("#form > div > div.input-wrapper"); //CSS
    By SWIATLOWOD_BNT_SEND= By.cssSelector(".form-content .cta"); //CSS
    By SWIATLOWOD_BNT_TXT_THANK_YOU_TEXT= By.cssSelector(".form-content p"); //CSS
    By SWIATLOWOD_ERROR_MESSAGE_PHONE_NUMBER=By.cssSelector("#form > div > p");//css
    By SWIATLOWOD_ERROR_MESSAGE_ALL_AGREEMENT=By.cssSelector("#form > div > div.agreements > div.head > p");//css
    By SWIATLOWOD_HEADING_TXT=By.cssSelector("#app > div.result > div > p");//css
    By SWIATLOWOD_HEADING_POSTAL_CODE=By.cssSelector("#app > div:nth-child(3) > div:nth-child(1) > p");//css
    By SWIATLOWOD_POSTAL_CODE= By.cssSelector("#app > div:nth-child(3) > div.row.inputs-row > div > input[type=text]");//css
    By SWIATLOWOD_POSTAL_CODE_BTN_CONFIRM=By.cssSelector("#app > div:nth-child(3) > div.row.inputs-row > button");//css
    By SWIATLOWOD_POSTAL_CODE_HEADING_TEXT_FAILURE=By.cssSelector("#app > div.result > div > div > div > div.info > p");//css

    //Plus netmining nowy numer
    By NETMINING_POPUP_NEW_NUMBER_INPUT= By.id("_i1_telephone1570787543790"); //ID
    By NETMINING_POPUP_NEW_NUMBER_BNT_SEND= By.id("_i1_submit1570787646614"); //ID
    By NETMINING_POPUP= By.id("_i1_popin"); //ID
    By NETMINING_POPUP_ERROR_MESSAGE= By.cssSelector("._i1_inline_errors"); //CSS

    //Plus netmining przedłuż umowę
    By NETMINING_POPUP_RET_INPUT_1= By.id("_i1_telefonretencja1570787589104"); //ID
    By NETMINING_POPUP_RET_INPUT_2= By.id("_i1_telephone1570787543790"); //ID
    By NETMINING_POPUP_RET_BNT_SEND= By.id("_i1_submit1570787646614"); //ID
    By NETMINING_POPUP_ERROR_MESSAGE_1= By.cssSelector("div:nth-of-type(3) > ._i1_col-1-1._i1_div._i1_error > ._i1_inline_errors"); //CSS
    By NETMINING_POPUP_ERROR_MESSAGE_2= By.cssSelector("div:nth-of-type(4) > ._i1_col-1-1._i1_div._i1_error > ._i1_inline_errors"); //CSS

}


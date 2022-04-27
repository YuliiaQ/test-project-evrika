package pages;

import enums.RegistrationFields;
import org.apache.commons.lang3.RandomStringUtils;

public class RegistrationPage extends BasePage {

    private static final String REGISTRATION_BUTTON = "//button[@class=\"button button_three button_fs_xl button_full\"]";
    private static final String ORGANIZATION_RADIO_BUTTON = "//span[text()='%s']";
    private static final String REGISTRATION_INPUT_FIELD = "//input[@name='%s']";
    private static final String PHONE_INPUT_FIELD = "//div[text()='Регистрация']//following::form//descendant::input[@type='tel']";
    private static final String PASSWORD_CONFIRMATION_INPUT_FIELD = "//label[text()='Повторите пароль']//preceding-sibling::input[@type='password']";
    private static final String FINISH_REGISTRATION_BUTTON = "//button[@class='button button_full button_one']";
    private static final String PRIVACY_POLICY_CHECKBOX = "//label[@class='input-choice']//descendant::span[2]";

    public void clickRegistrationButton() {
        findElementByXPath(REGISTRATION_BUTTON).click();
    }

    public void clickOrganizationRadioButton(RegistrationFields button) {
        findElementByXPath(String.format(ORGANIZATION_RADIO_BUTTON, button)).click();
    }

    public void inputDataToRegistrationField(RegistrationFields field, String data) {
        findElementByXPath(String.format(REGISTRATION_INPUT_FIELD, field.toString())).sendKeys(data);

    }

    public void inputEmailToEmailField(RegistrationFields field) {
        findElementByXPath(String.format(REGISTRATION_INPUT_FIELD, field.toString()))
                .sendKeys(String.format("%s@gmail.com", RandomStringUtils.randomAlphanumeric(6)));
    }

    public void inputDataToPhoneField(String data) {
        findElementByXPath(PHONE_INPUT_FIELD).sendKeys(data);
    }

    public void inputDataToPasswordConfirmField(String data) {
        findElementByXPath(PASSWORD_CONFIRMATION_INPUT_FIELD).sendKeys(data);
    }

    public void clickFinishRegistrationButton() {
        BasePage.captureScreen();
        findElementByXPath(FINISH_REGISTRATION_BUTTON).click();
    }

    public void clickCheckbox() {
//        findElementByXPath(getCssElement(findElementByXPath(PRIVACY_POLICY_CHECKBOX), ":after")).click();
//        findAllElementsByXPath(PRIVACY_POLICY_CHECKBOX).get(0).click();
        findElementByXPath(PRIVACY_POLICY_CHECKBOX).click();
    }
}

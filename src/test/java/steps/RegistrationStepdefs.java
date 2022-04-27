package steps;

import cache.TestCache;
import cache.TestCacheKey;
import enums.RegistrationFields;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.apache.commons.lang3.RandomStringUtils;
import org.assertj.core.api.Assertions;
import pages.HeaderComponent;
import pages.ProfilePage;
import pages.RegistrationPage;

public class RegistrationStepdefs {

    private static final RegistrationPage registrationPage = new RegistrationPage();
    private static final HeaderComponent headerComponent = new HeaderComponent();
    private static final ProfilePage profilePage = new ProfilePage();

    @Given("Login page is opened in pop up")
    public void loginPageIsOpenedInPopUp() {
        headerComponent.clickSignInButton();
    }

    @When("I click sign in button")
    public void iClickSignInButton() {
        registrationPage.clickRegistrationButton();
    }

    @And("I choose the enum type of radio button {}")
    public void iChooseTheEnumTypeOfRadioButton(RegistrationFields button) {
        registrationPage.clickOrganizationRadioButton(button);
    }

    @And("I enter the enum field {} data {string}")
    public void iEnterTheEnumFieldData(RegistrationFields field, String data) {
        registrationPage.inputDataToRegistrationField(field, data);
    }

    @And("I enter the Phone Field data {string}")
    public void iEnterThePhoneFieldData(String data) {
        registrationPage.inputDataToPhoneField(data);
    }

    @And("I input random data in the {} field on Registration Page")
    public void iInputRandomDataInTheFieldOnRegistrationPage(RegistrationFields field) {
        registrationPage.inputEmailToEmailField(field);
    }

    @And("I enter the enum field {} data required {string}")
    public void iEnterTheEnumFieldDataRequired(RegistrationFields field, String password) {
        String randomPassword = password + RandomStringUtils.randomAlphanumeric(8);
        registrationPage.inputDataToRegistrationField(field, randomPassword);
        TestCache.putDataInCache(TestCacheKey.PASSWORD, randomPassword);
    }

    @And("I enter the Password Confirm field data")
    public void iEnterThePasswordConfirmFieldData() {
        String randomPassword = TestCache.getStringFromCache(TestCacheKey.PASSWORD);
        registrationPage.inputDataToPasswordConfirmField(randomPassword);
    }

    @And("I click the Privacy Policy checkbox")
    public void iClickThePrivacyPolicyCheckbox() {
        registrationPage.clickCheckbox();
    }

    @And("I click button Register")
    public void iClickButtonRegister() {
        registrationPage.clickFinishRegistrationButton();
    }

    @Then("{string} heading is displayed")
    public void personalInfoHeadingIsDisplayed(String expectedMessage)  {
        String actualMessage = profilePage.isPersonalInfoHeadingDisplayed();
        Assertions.assertThat(actualMessage).as(String.format("Expected : %s, Actual : %s", expectedMessage,
                actualMessage)).contains(expectedMessage);
    }
}

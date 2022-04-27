package steps;

import enums.LoginFields;
import io.cucumber.java.en.And;
import pages.LoginPage;

public class LoginStepdefs {

    private static final LoginPage loginPage = new LoginPage();

    @And("I enter in the enum field {} data {string}")
    public void iEnterInTheEnumFieldData(LoginFields field, String data) {
        loginPage.inputDataToFields(field, data);
    }

    @And("I click Login button")
    public void iClickLoginButton() {
        loginPage.clickLoginButton();
    }
}

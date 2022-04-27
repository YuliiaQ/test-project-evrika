package pages;

import enums.LoginFields;

public class LoginPage extends BasePage {
    private static final String INPUT_FIELD = "//input[@name='%s']";
    private static final String SIGN_IN_BUTTON = "//button[text()='Войти']";

    public void inputDataToFields(LoginFields xpathFields, String data){
        findElementByXPath(String.format(INPUT_FIELD, xpathFields.toString())).sendKeys(data);
    }

    public void clickLoginButton(){
        BasePage.captureScreen();
        findElementByXPath(SIGN_IN_BUTTON).click();
    }
}

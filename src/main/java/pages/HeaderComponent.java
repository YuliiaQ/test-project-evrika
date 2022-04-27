package pages;

public class HeaderComponent extends BasePage {

    private static final String SIGN_IN_BUTTON= "//div[@class=\"header__actions-item header__actions-item_user\"]";
    private static final String HELP_CONSULTATION_DROPDOWN_BUTTON= "//span[text()='Помощь и консультация']";
    private static final String EMAIL_LINK_BUTTON= "//div[@class='contacts-widget__button is-active']//following::div[@class='contacts-widget__dropdown'][1]//descendant::a[text()='support@evrika.com']";

    public void clickSignInButton() {
        findElementByXPath(SIGN_IN_BUTTON).click();
    }

    public void clickHelpDropdownButton() {
        findElementByXPath(HELP_CONSULTATION_DROPDOWN_BUTTON).click();
    }

    public void clickEmailLink(){
        findElementByXPath(EMAIL_LINK_BUTTON).click();
    }

}

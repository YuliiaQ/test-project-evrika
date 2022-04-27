package pages;

public class ProfilePage extends BasePage {

    private static final String PERSONAL_INFO_HEADING = "//div[contains(text(), 'добро пожаловать в личный кабинет!')]";

    public String isPersonalInfoHeadingDisplayed() {
        return findElementByXPath(PERSONAL_INFO_HEADING).getText();
    }
}

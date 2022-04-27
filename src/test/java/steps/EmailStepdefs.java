package steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.When;
import pages.HeaderComponent;

public class EmailStepdefs {

    private static final HeaderComponent headerComponent = new HeaderComponent();

    @When("I click Support button in HeaderComponent")
    public void iClickSupportButtonInHeaderComponent() {
        headerComponent.clickHelpDropdownButton();
    }

    @And("I click email link")
    public void iClickEmailLink() {
        headerComponent.clickEmailLink();
    }
}

package steps;

import enums.*;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.assertj.core.api.Assertions;
import pages.OrderPage;
import pages.ShoppingPage;

public class OrderStepdefs {

    private static final ShoppingPage shoppingPage = new ShoppingPage();
    private static final OrderPage orderPage = new OrderPage();

    @When("I click Catalog Dropdown button")
    public void iClickCatalogDropdownButton() throws InterruptedException {
        shoppingPage.clickCatalogDropdown();
    }

    @And("I click choose Category button")
    public void iClickGroupOfItemsButton() {
        shoppingPage.clickProductCategories();
    }

    @And("I click item")
    public void iClickItem() {
        shoppingPage.clickGroupsItem();
    }

    @And("I click the enum item {}")
    public void iClickAddToShoppingCartButton(ListOfItems item) {
        shoppingPage.clickEnumProductName(item);
    }

    @And("Add To Shopping Cart button")
    public void addToShoppingCartButton() {
        shoppingPage.clickAddToShoppingCart();
    }

    @And("I click Checkout Button")
    public void iClickMakeAnOrderButton() {
        shoppingPage.clickCheckout();
    }

    @And("I click enum button {}")
    public void iClickEnumButton(OrderIcons icon) {
        orderPage.clickOrderIcon(icon);
    }

    @And("I click Confirm Order button")
    public void iClickButtonOrder() {
        orderPage.clickConfirmOrderButton();
    }

    @And("I click Accept Cookies button")
    public void iClickAcceptCookiesButton() {
        shoppingPage.acceptCookies();
    }

    @And("I enter in the address enum field {} data {string}")
    public void iEnterInTheAddressEnumFieldData(AddressData field, String data) {
        orderPage.inputDataToAddressField(field, data);
    }

    @And("I click the DatePicker to choose the date of delivery")
    public void iClickTheDatePickerToChooseTheDateOfDelivery() {
        orderPage.clickDatePicker();
    }

    @And("I click Select Time Dropdown button")
    public void iClickSelectTimeDropdownButton() {
        orderPage.clickTimeDropdown();
    }

    @And("I click Delivery time enum button {}")
    public void iClickDeliveryTimeEnumButton(DelieveryTimeSelection button) {
        orderPage.clickDeliveryTimeSelection(button);
    }

    @Then("message {string} is displayed")
    public void errorMessageIsDisplayed(String expectedMessage) {
        String actualMessage = orderPage.getErrorMessageOfMakingOrder();
        String actualTrimmedMessage = actualMessage.trim();
        Assertions.assertThat(actualTrimmedMessage).as(String.format("Expected : %s, Actual : %s", expectedMessage,
                actualTrimmedMessage)).isEqualTo(expectedMessage);
    }

    @And("I enter in the field Surname data {string}")
    public void iEnterInTheFieldSurnameData(String data) {
        orderPage.inputDataToSurnameField(data);
    }

    @And("I click the next day after current day")
    public void iClickTheNextDayAfterCurrentDay() {
        orderPage.clickTheNextDayInDatePicker();
    }
}

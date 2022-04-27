package pages;

import enums.AddressData;
import enums.DelieveryTimeSelection;
import enums.OrderIcons;

public class OrderPage extends BasePage {
    private static final String ORDER_ICONS = "//span[text()='%s']";
    private static final String SURNAME_INPUT_FIELD = "//label[@class='form-label']//preceding-sibling::input[@class='form-input ']";
    private static final String ADDRESS_DATA = "//label[text()='%s']//preceding-sibling::input[@class='form-input form-input_sm  ']";
    private static final String DATEPICKER = "//input[@class='form-input form-input_sm js-dmi js-datepicker _dmi-is-loaded flatpickr-input']";
    private static final String DAY_DATEPICKER = "//span[@class='flatpickr-day today flatpickr-disabled']//following::span[1]";
    private static final String DELIVERY_TIME_DROPDOWN = "//div[@title='Время']";
    private static final String TIME_SELECTION = "//li[@data-value='%s']";
    private static final String ORDER_CONFIRM = "//button[@form='checkout-form']";
    private static final String ERROR_MESSAGE_OF_MAKING_ORDER = "//h2[text()='Ошибка создания заказа. Повторите попытку чуть позже']";


    public void inputDataToSurnameField(String data){
        findElementByXPath(SURNAME_INPUT_FIELD).sendKeys(data);
        BasePage.captureScreen();
    }

    public void clickOrderIcon(OrderIcons xpathField){
        findElementByXPath(String.format(ORDER_ICONS, xpathField.toString())).click();
    }

    public void inputDataToAddressField(AddressData field, String data){
        findElementByXPath(String.format(ADDRESS_DATA, field.toString())).sendKeys(data);
    }

    public void clickDatePicker(){
        findElementByXPath(DATEPICKER).click();
    }

    public void clickTheNextDayInDatePicker() {
        findElementByXPath(DAY_DATEPICKER).click();
    }

    public void clickTimeDropdown(){
        findElementByXPath(DELIVERY_TIME_DROPDOWN).click();
    }

    public void clickDeliveryTimeSelection(DelieveryTimeSelection button){
        findElementByXPath(String.format(TIME_SELECTION, button.toString())).click();
        BasePage.captureScreen();
    }

    public void clickConfirmOrderButton(){
        findElementByXPath(ORDER_CONFIRM).click();
    }

    public String getErrorMessageOfMakingOrder() {
        return findElementByXPath(ERROR_MESSAGE_OF_MAKING_ORDER).getText();
    }
}

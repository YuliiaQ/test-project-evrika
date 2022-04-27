package pages;

import enums.ListOfItems;

public class ShoppingPage extends BasePage {

    private static final String CATALOG_DROPDOWN = "//div[@class='menu__button ']";
    private static final String PRODUCTS_CATEGORIES = "//a[@class='menu__link']//descendant::span[text()='Смартфоны и гаджеты']";
    private static final String GROUPS_ITEMS = "//ul[@class='category-links']//descendant::a[text()='Смарт-часы']";
    private static final String PRODUCT_NAME = "//div[@class='goods-tile__name']//descendant::a[text()='%s']";
    private static final String ADD_TO_SHOPPING_CART = "//div[@class='_df-hide']//descendant::span[text()='Купить']";
    private static final String MAKE_AN_ORDER_BUTTON = "//a[@class='button button_one']";
    private static final String ACCEPT_COOKIES_BUTTON = "//button[@class='cookie__button']";

    public void clickCatalogDropdown() throws InterruptedException {
        Thread.sleep(5000);
        findElementByXPath(CATALOG_DROPDOWN).click();
    }

    public void clickProductCategories(){
        findElementByXPath(PRODUCTS_CATEGORIES).click();
    }

    public void clickGroupsItem(){
        findElementByXPath(GROUPS_ITEMS).click();
    }

    public void clickEnumProductName(ListOfItems item){
        findElementByXPath(String.format(PRODUCT_NAME, item)).click();
    }

    public void clickAddToShoppingCart(){
        findElementByXPath(ADD_TO_SHOPPING_CART).click();
    }

    public void clickCheckout(){
        findElementByXPath(MAKE_AN_ORDER_BUTTON).click();
    }

    public void acceptCookies(){
        findElementByXPath(ACCEPT_COOKIES_BUTTON).click();
    }
}

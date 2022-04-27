package enums;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public enum OrderIcons {
    COURIER_DELIVERY("Доставка курьером"),
    PAYING_CASH("Наличными"),
    PAYING_CARD("Картой онлайн");

    private final String xpathField;

    @Override
    public String toString(){
        return xpathField;
    }
}

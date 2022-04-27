package enums;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public enum AddressData {
    STREET ("Улица"),
    HOUSE ("Дом");

    private final String xpathField;

    @Override
    public String toString(){
        return xpathField;
    }
}

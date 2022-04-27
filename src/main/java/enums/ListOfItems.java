package enums;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public enum ListOfItems {
    ITEM_1("Смарт устройства Aimoto Disney Холодное сердце"),
    ITEM_2("Смарт устройства Aimoto Disney Принцессы");

    private final String xpathField;

    @Override
    public String toString(){
        return xpathField;
    }
}

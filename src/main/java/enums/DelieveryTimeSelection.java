package enums;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public enum DelieveryTimeSelection {
    TIME1("2"),
    TIME2("3"),
    TIME3("4");

    private final String xpathField;

    @Override
    public String toString(){
        return xpathField;
    }
}

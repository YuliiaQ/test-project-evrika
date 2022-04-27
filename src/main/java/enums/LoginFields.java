package enums;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public enum LoginFields {
    LOGIN("login"),
    PASSWORD("password");

    private final String xpathField;

    @Override
    public String toString(){
        return xpathField;
    }
}

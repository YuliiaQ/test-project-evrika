package enums;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public enum RegistrationFields {
    RADIOBUTTON_1("Физ. лицо"),
    RADIOBUTTON_2("Юридическое лицо"),
    NAME("name"),
    SURNAME("surname"),
    EMAIL("email"),
    PASSWORD("password");

    private final String xpathField;

    @Override
    public String toString(){
        return xpathField;
    }
}

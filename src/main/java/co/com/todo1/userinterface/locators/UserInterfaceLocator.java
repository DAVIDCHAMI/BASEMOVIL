package co.com.todo1.userinterface.locators;

import co.com.todo1.utils.mobileobjectfinder.Locator;

import static co.com.todo1.utils.constantes.TipoClaseConstante.CLASE_LOCATOR;
import static co.com.todo1.utils.mobileobjectfinder.Locator.locator;

public class UserInterfaceLocator {
    public static final Locator BTN_EJEMPLO_LOCATOR = locator().withAndroid("xpath$//escribir_xpath").withIos("id$escribirId");
    public static final Locator BTN_EJEMPLO_DOS_LOCATOR = locator().withAndroid("xpath$//escribir_xpath_dinamico_{0}").withIos("id$escribirId");

    private UserInterfaceLocator(){
        throw new IllegalStateException(CLASE_LOCATOR);
    }
}

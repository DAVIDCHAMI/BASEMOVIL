package co.com.todo1.userinterface.pages;

import net.serenitybdd.screenplay.targets.Target;

import static co.com.todo1.userinterface.locators.UserInterfaceLocator.BTN_EJEMPLO_DOS_LOCATOR;
import static co.com.todo1.userinterface.locators.UserInterfaceLocator.BTN_EJEMPLO_LOCATOR;
import static co.com.todo1.utils.constantes.TipoClaseConstante.CLASE_INTERFAZ_USUARIO;
import static co.com.todo1.utils.mobileobjectfinder.ElementFinder.dynamicElement;
import static co.com.todo1.utils.mobileobjectfinder.ElementFinder.theElementBy;

public class UserInterface {
    public static final Target BTN_EJEMPLO = Target.the("Boton de ejemplo").located(theElementBy(BTN_EJEMPLO_LOCATOR));
    public static final Target BTN_EJEMPLO_DOS = Target.the("Boton de ejemplo").locatedBy(dynamicElement(BTN_EJEMPLO_DOS_LOCATOR));

    private UserInterface(){
        throw new IllegalStateException(CLASE_INTERFAZ_USUARIO);
    }
}

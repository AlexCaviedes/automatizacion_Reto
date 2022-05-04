package userinterface;

import net.serenitybdd.screenplay.targets.Target;
import net.serenitybdd.core.annotations.findby.By;

public class OpenCarLogin {

    public static final Target input_user = Target.the("Ingresa el usuario")
            .located(By.id("input-username"));
    public static final Target input_password = Target.the("Ingresa la contrasema")
            .located(By.id("input-password"));
    public static final Target Buton_singin = Target.the("Ingresa la contrasema")
            .located(By.xpath("//button[@type='submit'][contains(text(), 'Login')]"));
    public static final Target Text = Target.the("Verifica que haya iniciado session")
            .located(By.cssSelector("#content > div.page-header > div > h1"));
}

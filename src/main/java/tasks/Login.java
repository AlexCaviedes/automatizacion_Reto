package tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import userinterface.OpenCarLogin;
import model.openCart;
import java.util.List;

public class Login implements Task{

    private List<openCart> openCart;

    public Login(List<openCart> openCart) {
        this.openCart = openCart;
    }

    public static Login session(List<openCart> openCart) {
        return Tasks.instrumented(Login.class, openCart);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue((openCart.get(0).getSrtUser())).into(OpenCarLogin.input_user),
                Enter.theValue((openCart.get(0).getSrtPassword())).into(OpenCarLogin.input_password),
                Click.on(OpenCarLogin.Buton_singin)
        );
    }
}

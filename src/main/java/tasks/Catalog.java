package tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.matchers.WebElementStateMatchers;
import net.serenitybdd.screenplay.waits.WaitUntil;
import userinterface.OpenCartCatalog;

public class Catalog implements Task{

    public static Catalog Categories() {
        return Tasks.instrumented(Catalog.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                WaitUntil.the(OpenCartCatalog.Buton_catalog, WebElementStateMatchers.isEnabled()),
                Click.on(OpenCartCatalog.Buton_catalog),
                WaitUntil.the(OpenCartCatalog.Buton_categories, WebElementStateMatchers.isEnabled()),
                Click.on(OpenCartCatalog.Buton_categories)
        );
    }
}

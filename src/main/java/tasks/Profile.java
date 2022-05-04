package tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.matchers.WebElementStateMatchers;
import net.serenitybdd.screenplay.waits.WaitUntil;
import userinterface.OpenCarProfile;

public class Profile implements Task{

    public static Profile YourProfile() {
        return Tasks.instrumented(Profile.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                WaitUntil.the(OpenCarProfile.Buton_username, WebElementStateMatchers.isEnabled()),
                Click.on(OpenCarProfile.Buton_username),
                WaitUntil.the(OpenCarProfile.Buton_yourprofile, WebElementStateMatchers.isEnabled()),
                Click.on(OpenCarProfile.Buton_yourprofile)
        );
    }
}

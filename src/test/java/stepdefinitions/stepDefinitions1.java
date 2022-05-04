package stepdefinitions;

import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import model.openCart;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import questions.AnswerOne;
import tasks.Login;
import tasks.OpenUp;

import java.util.List;

public class stepDefinitions1 {

    @Before
    public void setStage(){
        OnStage.setTheStage(new OnlineCast());
    }

    @Given("^Alex abre la pagina de OpenCart$")
    public void alexAbreLaPaginaDeOpenCart() {
        OnStage.theActorCalled("Alex").wasAbleTo(OpenUp.thepage());
    }


    @When("^Alex ingresa el usuario y la contrasena da click en iniciar session$")
    public void alexIngresaElUsuarioYLaContrasenaDaClickEnIniciarSession(List<openCart> openCart) {
        OnStage.theActorCalled("Alex").wasAbleTo(Login.session(openCart));
    }

    @Then("^Alex lee el mensaje en la interfaz de usuario$")
    public void alexLeeElMensajeEnLaInterfazDeUsuario(List<openCart> openCart) {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(AnswerOne.toThe(openCart)));
    }

}

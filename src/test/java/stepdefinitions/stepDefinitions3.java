package stepdefinitions;

import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import questions.AnswerOne;
import tasks.Catalog;
import tasks.Login;
import tasks.OpenUp;
import model.openCart;
import tasks.Profile;

import java.util.List;

public class stepDefinitions3 {

    @Before
    public void setStage(){
        OnStage.setTheStage(new OnlineCast());
    }

    @Given("^Alex abre la pagina de OpenCart e ingresa los datos del login$")
    public void alexAbreLaPaginaDeOpenCartEIngresaLosDatosDelLogin(List<openCart> openCart) {
        OnStage.theActorCalled("Alex").wasAbleTo(OpenUp.thepage(), Login.session(openCart));
    }

    @When("^Alex da click en Catalog y click en categories$")
    public void alexDaClickEnCatalogYClickEnCategories() {
        OnStage.theActorInTheSpotlight().wasAbleTo(Catalog.Categories());
    }

    @Then("^Alex lee el mensaje en la interfaz de usuario de categories$")
    public void alexLeeElMensajeEnLaInterfazDeUsuarioDeCategories(List<openCart> openCart) {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(AnswerOne.toThe(openCart)));
    }

}

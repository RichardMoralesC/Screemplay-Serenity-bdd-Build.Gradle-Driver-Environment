package starter.stepdefinitions;

import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.WebDriver;
import starter.search.*;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static org.hamcrest.Matchers.*;
import static starter.matchers.StringContainsIgnoringCase.containsIgnoringCase;

public class AccountCreateStrpDefinitions {


    @Managed
    WebDriver driver;
    Actor sam = Actor.named("samuel");


    @Before
    public void setTheStage() {
        sam.can(BrowseTheWeb.with(driver));
        sam.attemptsTo(Open.url("http://automationpractice.com/index.php"));
    }

    @Given("the client samuel enters the page and goes to the option to create an account")
    public void the_client_samuel_enters_the_page_and_goes_to_the_option_to_create_an_account() {
        // Write code here that turns the phrase above into concrete actions
        sam.attemptsTo(
                SearchPage.term()
        );
    }

    @When("enter your email and press register account")
    public void enter_your_email_and_press_register_account() {
        sam.attemptsTo(
                AccountRegisterFor.withCredentials("samualbwt34t@gmail.com")
        );
    }

    @When("enter your personal information to create the account and press register account")
    public void enter_your_personal_information_to_create_the_account_and_press_register_account() {
        sam.attemptsTo(
                AccountInformationFor.withCredentials("prueba","prueba","prueba",
                        "aderft","defrdr","dvfr","direcion1","pruebas",
                        "35762","254785","58745896","45875","Colombia","prueba")
        );
    }

    @Then("shown in section")
    public void shown_in_section() {
        sam.should(
                seeThat(
                        AcountResulMessage.titles()
                )
        );
    }
}

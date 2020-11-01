package starter.stepdefinitions;

import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Open;
import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.WebDriver;
import starter.search.ContatcForm;
import starter.search.SearchPage;

public class ContactStrepDefinitions {

    @Managed
    WebDriver driver;
    Actor sam = Actor.named("samuel");


    @Before
    public void setTheStage() {
        sam.can(BrowseTheWeb.with(driver));
        sam.attemptsTo(Open.url("http://automationpractice.com/index.php"));
    }


    @Given("a user contacts to find out why a trouser i buy in a smaller size")
    public void a_user_contacts_to_find_out_why_a_trouser_i_buy_in_a_smaller_size() {
        // Write code here that turns the phrase above into concrete actions
        sam.attemptsTo(
                SearchPage.contact()
        );
    }

    @When("sends their request with their mail the reference order umero and the message")
    public void sends_their_request_with_their_mail_the_reference_order_umero_and_the_message() {
        // Write code here that turns the phrase above into concrete actions
        sam.attemptsTo(
                ContatcForm.withCredentials(

                        "samualbwt@gmail.com","12568","prueba de envio de informacion"
                )
        );
    }

    @Then("expects a response")
    public void expects_a_response() {
        // Write code here that turns the phrase above into concrete actions
    }
}

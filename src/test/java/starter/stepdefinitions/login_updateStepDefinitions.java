package starter.stepdefinitions;

import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.core.pages.WebElementFacade;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Open;
import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import starter.search.SearchPage;
import starter.search.loginForm;
import starter.search.updateinformationForm;

import java.lang.annotation.Target;

public class login_updateStepDefinitions {
    @Managed
    WebDriver driver;
    Actor sam = Actor.named("samuel");


    @Before
    public void setTheStage() {
        sam.can(BrowseTheWeb.with(driver));
        sam.attemptsTo(Open.url("http://automationpractice.com/index.php"));
    }


    @Given("the user when entering the page is directed to their account")
    public void the_user_when_entering_the_page_is_directed_to_their_account() {
        sam.attemptsTo(
                SearchPage.term()
        );
    }

    @When("enters their suary and password to enter")
    public void enters_their_suary_and_password_to_enter() {
        sam.attemptsTo(
                loginForm.withCredentials("samualbwt@gmail.com","prueba")
        );
    }

    @When("they click on the section to update data")
    public void they_click_on_the_section_to_update_data() {
        sam.attemptsTo(
                SearchPage.update_user()
        );
    }

    @When("enter all the information to update")
    public void enter_all_the_information_to_update() {
      sam.attemptsTo(
              updateinformationForm.withCredentials("prueba","alberto","alberto")
      );
    }

    @Then("and update their information")
    public void and_update_their_information() {

    }
}

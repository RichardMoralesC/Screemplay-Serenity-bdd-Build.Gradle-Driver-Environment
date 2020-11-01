package starter.search;


import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;


import static net.serenitybdd.screenplay.Tasks.instrumented;

public class AccountRegisterFor implements Task {

    private final String email;

    public AccountRegisterFor(String email){
        this.email = email;
    }


    public  static Performable withCredentials(String email){
        return  instrumented(AccountRegisterFor.class,email);
    }



    @Override
    public <T extends Actor> void performAs(T actor) {
    actor.attemptsTo(
            Enter.theValue(email).into(DoAccountRegisterForm.SEARCH_EMAIL),
            Click.on(DoAccountRegisterForm.SEARCH_BUTTON)
    );
    }
}

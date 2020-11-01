package starter.search;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class loginForm implements Task {

    private final String textEmail;
    private final String textpass;

    public loginForm(String textEmail, String textpass){
        this.textEmail = textEmail;
        this.textpass = textpass;


    }

    public  static Performable withCredentials(String textEmail, String textpass){
        return instrumented(loginForm.class,textEmail,textpass);
    }


    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue(textEmail).into(Dologinfor.LOGIN_EMAIL),
                Enter.theValue(textpass).into(Dologinfor.LOGIN_PASS),
                Click.on(Dologinfor.SUBMIT_LOGIN)

        );
    }
}

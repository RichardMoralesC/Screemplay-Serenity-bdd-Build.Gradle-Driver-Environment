package starter.search;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.SelectFromOptions;
import org.openqa.selenium.By;

import javax.swing.event.CaretListener;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class ContatcForm  implements Task {
    private final String textEmail;
    private final String textOrder;
    private final String textMessage;


    public ContatcForm(String textEmail, String textOrder,String textMessage){
        this.textEmail = textEmail;
        this.textOrder = textOrder;
        this.textMessage = textMessage;

    }

    public  static Performable withCredentials(String textEmail, String textOrder,String textMessage){
        return instrumented(ContatcForm.class,textEmail,textOrder,textMessage);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                SelectFromOptions.byVisibleText("Customer service").from(DoContavtFor.INPUT_CONTACT),
                Enter.theValue(textEmail).into(DoContavtFor.INPUT_EMAIL),
                Enter.theValue(textOrder).into(DoContavtFor.INPUT_ORDER),
                Enter.theValue(textMessage).into(DoContavtFor.INPUT_MESSAGE),
                Click.on(DoContavtFor.SUBMIT_CONTACT)
        );
    }
}

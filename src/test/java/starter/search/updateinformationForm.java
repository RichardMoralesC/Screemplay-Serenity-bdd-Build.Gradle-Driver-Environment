package starter.search;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.SelectFromOptions;
import org.openqa.selenium.By;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class updateinformationForm implements Task {


    public final String txtPassOld;
    public final String txtPssNew;
    public final String txtPassCon;


    public  updateinformationForm(String txtPassOld,String txtPssNew,String txtPassCon){

        this.txtPassOld = txtPassOld;
        this.txtPssNew = txtPssNew;
        this.txtPassCon = txtPassCon;
    }

    public  static Performable withCredentials(String txtPassOld,String txtPssNew,String txtPassCon){
        return instrumented(updateinformationForm.class,txtPassOld,txtPssNew,txtPassCon);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue(txtPassOld).into(DoUpdateInformationFor.INPUT_PASS_OLD),
                Enter.theValue(txtPssNew).into(DoUpdateInformationFor.INPUT_PASS_NEW),
                Enter.theValue(txtPassCon).into(DoUpdateInformationFor.INPUT_PASS_CONF),
                Click.on(DoUpdateInformationFor.SUBMIT_PASS_CONF)
        );
    }
}

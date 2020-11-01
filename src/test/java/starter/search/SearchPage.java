package starter.search;

import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Clear;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

public class SearchPage {
    public static Performable term() {
        return Task.where("{0} attempts to search for #term",
                Click.on(pageSearch.SEARCH_BUTTON)
        );
    }

    public static  Performable contact(){
        return  Task.where("",
                Click.on(pageSearch.BUTTON_CONTACT));
    }

    public static  Performable update_user(){
        return  Task.where("",
                Click.on(pageSearch.UPDATE_USER));
    }
}

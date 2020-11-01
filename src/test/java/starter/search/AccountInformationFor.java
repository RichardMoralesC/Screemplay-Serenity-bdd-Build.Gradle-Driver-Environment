package starter.search;

import io.cucumber.java.eo.Do;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import org.yecht.Data;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class AccountInformationFor implements Task {

    private final String textName;
    private final String text_Lastname;
    private final String textPasswd;
    private final String textFisrstName;
    private final String textFLastName;
    private final String textCompany;
    private final String textAddresOne;
    private final String textAddresTwo;
    private  final String textCity;
    private  final  String extPostCode;
    private final String textPhone;
    private final String textPhone_mobile;
    private final String textAlias;
    private final String textOther;

    public AccountInformationFor(String textName, String text_Lastname, String textPasswd, String textFisrstName,
                                 String textFLastName, String textCompany, String textAddresOne, String textAddresTwo,
                                 String extPostCode, String textPhone, String textPhone_mobile , String textAlias,
                                 String textCity,String textOther){
        this.textName =textName;
        this.text_Lastname =text_Lastname;
        this.textPasswd = textPasswd;
        this.textFisrstName = textFisrstName;
        this.textFLastName = textFLastName;
        this.textCompany = textCompany;
        this.textAddresOne = textAddresOne;
        this.textAddresTwo = textAddresTwo;
        this.extPostCode = extPostCode;
        this.textPhone = textPhone;
        this.textPhone_mobile = textPhone_mobile;
        this.textAlias = textAlias;
        this.textCity = textCity;
        this.textOther = textOther;


    }
    public  static Performable withCredentials(String textName, String text_Lastname, String textPasswd, String textFisrstName,
                                               String textFLastName, String textCompany, String textAddresOne, String textAddresTwo,
                                               String extPostCode, String textPhone, String textPhone_mobile , String textAlias, String textCity,String textOther){
        return instrumented(AccountInformationFor.class,textName,text_Lastname,textPasswd,textFisrstName,textFLastName,
                textCompany,textAddresOne,textAddresTwo, extPostCode,textPhone,textPhone_mobile,textAlias,textCity,textOther);

    }



    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(DoAccountInformationForm.INPUT_GENERE),
                Enter.theValue(textName).into(DoAccountInformationForm.INPUT_TEXT_NAME),
                Enter.theValue(text_Lastname).into(DoAccountInformationForm.INPUT_LASTNAME),
                Enter.theValue(textPasswd).into(DoAccountInformationForm.INPUT_PASSWORD),
                Enter.theValue(textFisrstName).into(DoAccountInformationForm.INPUT_FIRSTNAME),
                Enter.theValue(textFLastName).into(DoAccountInformationForm.INPUT_TEXT_NAME_LAST),
                Enter.theValue(textCompany).into(DoAccountInformationForm.INPUT_COMPANY),
                Enter.theValue(textAddresOne).into(DoAccountInformationForm.INPUT_ADDRES_ONE),
                Enter.theValue(textAddresTwo).into(DoAccountInformationForm.INPUT_ADDRES_TWO),
                Enter.theValue(textCity).into(DoAccountInformationForm.INPUT_CITY),
                Click.on(DoAccountInformationForm.INPUT_STATE),
                Enter.theValue(extPostCode).into(DoAccountInformationForm.INPUT_POST_CODE),
                Enter.theValue(textPhone).into(DoAccountInformationForm.INPUT_PHONE),
                Enter.theValue(textPhone_mobile).into(DoAccountInformationForm.INPUT_PHONE_MOBILE),
                Enter.theValue(textOther).into(DoAccountInformationForm.INPUT_OTHER),
                Enter.theValue(textAlias).into(DoAccountInformationForm.INPUT_ALIAS),
                Click.on(DoAccountInformationForm.BUTTON_REGISTER)

        );
    }
}

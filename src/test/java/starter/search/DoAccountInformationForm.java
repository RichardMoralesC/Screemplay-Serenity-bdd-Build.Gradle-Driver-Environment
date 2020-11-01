package starter.search;

import org.openqa.selenium.By;

public class DoAccountInformationForm {
    static By INPUT_GENERE = By.id("id_gender1");
    static By INPUT_TEXT_NAME = By.cssSelector("input[id='customer_firstname']");
    static By INPUT_LASTNAME = By.cssSelector("input[id='lastname']");
    static By INPUT_PASSWORD = By.cssSelector("input[id='passwd']");
    static By INPUT_FIRSTNAME= By.cssSelector("input[id='firstname']");
    static By INPUT_TEXT_NAME_LAST = By.cssSelector("input[id='customer_lastname']");
    static By INPUT_COMPANY = By.cssSelector("input[id='company']");
    static By INPUT_ADDRES_ONE = By.cssSelector("input[id='address1']");
    static By INPUT_ADDRES_TWO = By.cssSelector("input[id='address2']");
    static By INPUT_CITY = By.cssSelector("input[id='city']");
    static By INPUT_STATE = By.cssSelector("#id_state > option:nth-child(2)");
    static By INPUT_POST_CODE = By.cssSelector("input[id='postcode']");
    static By INPUT_OTHER = By.cssSelector("textarea[id='other']");
    static By INPUT_PHONE = By.cssSelector("input[id='phone']");
    static By INPUT_PHONE_MOBILE = By.cssSelector("input[id='phone_mobile']");
    static By INPUT_ALIAS = By.cssSelector("input[id='alias']");
    static By BUTTON_REGISTER = By.cssSelector("button[name='submitAccount']");





}

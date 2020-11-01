package starter.search;

import org.openqa.selenium.By;

public class DoUpdateInformationFor {
    static By INPUT_DAY = By.cssSelector("select#days");
    static By INPUT_MONTH = By.cssSelector("select#months");
    static By INPUT_YEAR = By.cssSelector("select#years");
    static By INPUT_PASS_OLD = By.id("old_passwd");
    static By INPUT_PASS_NEW = By.id("passwd");
    static By INPUT_PASS_CONF = By.id("confirmation");
    static By SUBMIT_PASS_CONF = By.name("submitIdentity");
}

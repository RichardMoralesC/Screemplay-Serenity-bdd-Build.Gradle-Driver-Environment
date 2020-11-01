package starter.search;

import org.openqa.selenium.By;

public class pageSearch {
    static By SEARCH_BUTTON = By.cssSelector("div.header_user_info a[class='login']");
    static By BUTTON_CONTACT = By.id("contact-link");
    static By UPDATE_USER = By.cssSelector("ul.myaccount-link-list li:nth-child(4)");
}

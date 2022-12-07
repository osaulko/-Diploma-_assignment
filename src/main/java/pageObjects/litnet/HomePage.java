package pageObjects.litnet;

import org.openqa.selenium.By;
import pageObjects.baseObjects.BasePage;

public class HomePage extends BasePage {

    private final By loginBtn = By.cssSelector("[class=ln_topbar_login]>[class=ln_topbar_nav-lnk]");

    private final By loginBtn2 = By.linkText("Телефон или Email");
//Сменить название локатора(loginBtn2 на вход по номеру телефона или Email или что-то в этом роде)

    public HomePage open() {
        load();
        return this;
    }

    public HomePage clickLoginBtn() {
        click(loginBtn);
        return this;
    }

    public HomePage clickLoginBtn2() {
        click(loginBtn2);
        return this;
    }
}
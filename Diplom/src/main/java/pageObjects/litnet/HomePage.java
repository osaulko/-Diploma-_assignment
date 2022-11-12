package pageObjects.litnet;

import org.openqa.selenium.By;
import pageObjects.baseObjects.BasePage;

public class HomePage extends BasePage {

    private By loginBtn = By.xpath("/html/body/div[2]/div/div/div[2]/div[2]/a[1]");

    public HomePage open(String url) {
        load(url);
        return this;
    }
    public HomePage clickLoginBtn() {
        click(loginBtn);
        return this;
    }
}

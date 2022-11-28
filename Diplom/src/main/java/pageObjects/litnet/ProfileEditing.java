package pageObjects.litnet;

import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import pageObjects.baseObjects.BasePage;

import java.util.concurrent.TimeUnit;

public class ProfileEditing extends BasePage {

    private final By loadPhoto = By.id("avatar-js-upload-btn");
    private final By pageWithPhoto = By.cssSelector("#avatar-image-modal > div > div");
    private final By clickSaveBtn = By.id("avatar-submit-button");

    public ProfileEditing clickChangePhotoBtn(){
        driver.findElement(loadPhoto).sendKeys("C:\\Users\\hugo\\Desktop\\проекты\\Diplom\\Diplom\\src\\Load_File.jpg");//Переделаю через проперти
        driver.findElement(pageWithPhoto);
            JavascriptExecutor js = (JavascriptExecutor) driver;
            js.executeScript("window.scrollBy(0,500)");
        wait.until(ExpectedConditions.elementToBeClickable(clickSaveBtn));
            click(clickSaveBtn);
        return this;
    }

}

package pageObjects.litnet;

import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import pageObjects.baseObjects.BasePage;

import java.io.File;

import static java.io.File.pathSeparator;
import static java.io.File.separator;

public class ProfileEditing extends BasePage {

    private final By loadPhoto = By.id("avatar-js-upload-btn");
    private final By pageWithPhoto = By.cssSelector("#avatar-image-modal > div > div");
    private final By clickSaveBtn = By.id("avatar-submit-button");
    private final By addRomance = By.linkText("Добавить роман");

    public ProfileEditing propertyPath (){
        System.getProperty( "user.dir" + "Image/Load_File.jpg");
        return this;
    }

    public ProfileEditing clickChangePhotoBtn(){
        String absolutePath = new File("Image/Load_File.jpg").getAbsolutePath();
        driver.findElement(loadPhoto).sendKeys(absolutePath);
        driver.findElement(pageWithPhoto);
        wait.until(ExpectedConditions.elementToBeClickable(clickSaveBtn));
            click(clickSaveBtn);
        return this;
    }
    public ProfileEditing clickAddRomance(){
        click(addRomance);
        return this;
    }
}

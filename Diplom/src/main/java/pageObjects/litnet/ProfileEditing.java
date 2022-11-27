package pageObjects.litnet;

import org.openqa.selenium.By;
import pageObjects.baseObjects.BasePage;

import java.awt.*;
import java.awt.image.ImageObserver;
import java.awt.image.ImageProducer;
import java.security.Key;

public class ProfileEditing extends BasePage {

    private final By changePhotoBtn = By.id("avatar-js-upload_file_action_btn");

    public ProfileEditing clickChangePhotoBtn(){
        //click(changePhotoBtn);
        driver.findElement(changePhotoBtn).sendKeys("Load_File.jpg");
        //System.getProperty(("user.dir")+"Load_File.jpg");
        return this;
    }
}

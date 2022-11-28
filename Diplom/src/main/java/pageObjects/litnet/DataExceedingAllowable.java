package pageObjects.litnet;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import pageObjects.baseObjects.BasePage;

public class DataExceedingAllowable extends BasePage {

    private final By account = By.cssSelector("[class='ln_topbar_avatar']");

    private final By editProfile = By.linkText("Редактировать профиль");

    private final By personalSite = By.id("editprofileform-site");

    private final By verifyLimitValues = By.cssSelector("[class='col-xs-4']>[class='form-group field-editprofileform-site has-error']>[class='help-block']");

    public DataExceedingAllowable clickAccount(){
        click(account);
        return this;
    }
    public DataExceedingAllowable clickEditProfile(){
        click(editProfile);
        return this;
    }
    public DataExceedingAllowable enterLimit39(){
        enter(personalSite , "123456789012345678901234567890123456789");
        return this;
    }
    public DataExceedingAllowable enterLimit40(){
        enter(personalSite , "1234567890123456789012345678901234567890");
        return this;
    }
    public DataExceedingAllowable enterLimit41(){
        enter(personalSite , "12345678901234567890123456789012345678901");
        return this;
    }
    public DataExceedingAllowable verifyLimitValues(){
        Assert.assertEquals(getText(verifyLimitValues),"Значение «Личный сайт» должно содержать максимум 40 символов.");
        return this;
    }

    public DataExceedingAllowable verifyLimitValuesNormal(){
        Assert.assertEquals(getText(verifyLimitValues),"");
        return this;
    }
}

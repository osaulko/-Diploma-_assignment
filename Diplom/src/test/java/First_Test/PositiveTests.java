package First_Test;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import pageObjects.baseObjects.BaseTest;
import pageObjects.litnet.*;

public class PositiveTests extends BaseTest {

    @BeforeTest
    @Parameters("url")
    public void precondition () {
        new HomePage()
                .open()
                .clickLoginBtn()
                .clickLoginBtn2();
        new LoginPage()
                .enterUsername()
                .enterPassword()
                .clickLogin();
    }

    @Test (priority = 1)
    public void positiveTestTwo (){
        new PopUpWindow()
                .clickBell()
                .checkTableIsDisplayed2();
    }

    @Test (priority = 2)
    public void positiveTestThree (){
        new CreateEssence()
                .clickBookType("fentezi")
                .clickBookOne()
                .clickAddInLibrary()
                .clickMyLibrary()
                .verifyLibrary();
    }

    @Test (priority = 3)
    public void positiveTestFour (){
        new RemoveEssence()
                .scrollToCenter()
                .clickMove()
                .clickRemoveFromLibrary()
                .verifyLibrary();
    }

    @Test (priority = 4)
    public void positiveTestSix(){
        new DataExceedingAllowable()
                .clickEditProfile();
        new DataExceedingAllowable()
                .clickChangePhotoBtn();
    }

    @Test  (priority = 5)
    public void positiveTestOne () {
        new DataExceedingAllowable()
                .clickAccount()
                .clickEditProfile()
                .enterLimit("123456789012345678901234567890123456789")
                .verifyLimitValuesNormal()
                .enterLimit("1234567890123456789012345678901234567890")
                .verifyLimitValuesNormal();
    }

    @Test (priority = 6)
    public void positiveTestFive(){
        new DataExceedingAllowable()
                .clickAddRomance();
        new AddNewRomance()
                .checkDialogMassage();
    }
}
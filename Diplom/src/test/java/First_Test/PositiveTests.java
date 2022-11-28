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
                .clickFantasyGenre()
                .clickBookOne()
                .clickAddInLibrary()
                .clickMyLibrary()
                .VerifyLibrary();
    }

    @Test (priority = 3)
    public void positiveTestFour (){
        new RemoveEssence()
                .scrollLibrary()
                .clickMove()
                .clickRemoveFromLibrary()
                .VerifyLibrary();
    }

    @Test (priority = 4)
    public void testSix(){
        new RemoveEssence()
                .clickEditProfile();
        new ProfileEditing()
                .clickChangePhotoBtn();
    }
}
package First_Test;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import pageObjects.baseObjects.BaseTest;
import pageObjects.litnet.CreateEssence;
import pageObjects.litnet.HomePage;
import pageObjects.litnet.LoginPage;
import pageObjects.litnet.RemoveEssence;

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

    @Test
    public void positiveTestThree (){
        new CreateEssence()
                .clickLitnetBtn()
                .clickFantasyGenre()
                .clickBookOne()
                .clickAddInLibrary()
                .clickMyLibrary();
    }

    @Test
    public void positiveTestFour(){
        String bookName = "Нищенка в Королевской Академии магии. Зимняя практика 2";
        new RemoveEssence();
        String newBook = RemoveEssence.enterBookName(bookName);
        Assert.assertEquals(newBook, "Нищенка в Королевской Академии магии. Зимняя практика 2");
    }

//    @Test
//    public void positiveTestFour (){
//        new CreateEssence()
//                .clickMyLibrary()
//                .clickMove()
//                .clickRemoveFromLibrary();
//    }
}

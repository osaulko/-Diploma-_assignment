package pageObjects.litnet;

import org.openqa.selenium.By;
import pageObjects.baseObjects.BasePage;

import java.time.Duration;

public class CreateAndRemoveEssence extends BasePage {

    private final By departmentBooks = By.id("choose_genre");

    private final By myLibrary = By.linkText("Моя библиотека");

    //private final By fantasyGenre = By.linkText("Фэнтези");
    private final By fantasyGenre = By.xpath("//html/body/div[3]/div/div/div[1]/div[1]/div[1]/div[2]/div/div/ul/li[1]");

    private final By bookOne = By.linkText("Нищенка в Королевской Академии магии. Зимняя практика 2");

    private final By litnetBtn = By.xpath("/html/body/div[2]/div/div/div[1]/div/a");

    private final By addInLibrary = By.cssSelector("[class=lib-btn]>[class=to_lib]");

    private final By move = By.linkText("Переместить");

    private final By removeFromLibrary = By.xpath("/html/body/div[3]/div/div/div[2]/div[6]/div[1]/div[2]/div[2]/ul/li[3]/a");


    public CreateAndRemoveEssence clickDepartmentBooks (){
        click(departmentBooks);
        return this;
    }

    public CreateAndRemoveEssence clickFantasyGenre () {
        click(fantasyGenre);
        return this;
    }
    public CreateAndRemoveEssence clickLitnetBtn(){
        click(litnetBtn);
        return this;
    }

    public CreateAndRemoveEssence clickBookOne () {
        click(bookOne);
        return this;
    }

    public CreateAndRemoveEssence clickAddInLibrary () {
        click(addInLibrary);
        return this;
    }

    public CreateAndRemoveEssence clickMyLibrary (){
        click(myLibrary);
        return this;
    }

    public CreateAndRemoveEssence clickMove () {
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20)); //проба 2
        click(move);
        return this;
    }


    public CreateAndRemoveEssence clickRemoveFromLibrary  () {
        click(removeFromLibrary);
        return this;
    }


}

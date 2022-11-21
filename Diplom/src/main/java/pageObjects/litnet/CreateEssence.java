package pageObjects.litnet;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import pageObjects.baseObjects.BasePage;

public class CreateEssence extends BasePage {

    private final By departmentBooks = By.id("choose_genre");

    private final By fantasyGenre = By.xpath("//html/body/div[3]/div/div/div[1]/div[1]/div[1]/div[2]/div/div/ul/li[1]");

    private final By bookOne = By.linkText("Нищенка в Королевской Академии магии. Зимняя практика 2");

    private final By litnetBtn = By.xpath("/html/body/div[2]/div/div/div[1]/div/a");

    private final By addInLibrary = By.cssSelector("[class=lib-btn]>[class=to_lib]");

    private final By myLibrary = By.linkText("Моя библиотека");


    public CreateEssence clickDepartmentBooks (){
        click(departmentBooks);
        return this;
    }

    public CreateEssence clickFantasyGenre () {
        click(fantasyGenre);
        return this;
    }
    public CreateEssence clickLitnetBtn(){
        click(litnetBtn);
        return this;
    }

    public CreateEssence clickBookOne () {
        click(bookOne);
        return this;
    }

    public CreateEssence clickAddInLibrary () {
        click(addInLibrary);
        return this;
    }
    public CreateEssence clickMyLibrary (){
        click(myLibrary);
        return this;
    }

}

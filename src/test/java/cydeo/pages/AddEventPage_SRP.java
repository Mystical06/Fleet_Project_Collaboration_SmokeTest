package cydeo.pages;

import cydeo.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.ArrayList;
import java.util.List;

public class AddEventPage_SRP {

    public AddEventPage_SRP() {


        PageFactory.initElements(Driver.getDriver(), this);
    }

   // @FindBy(xpath = "//*[@id=\"main-menu\"]/ul/li[2]/a/span")
    @FindBy(xpath="(//span[@class='title title-level-1'])[2]")
    public WebElement fleetButton;

    @FindBy(xpath = "//*[@id=\"main-menu\"]/ul/li[2]/div/div/ul/li[3]/a/span")
    public WebElement vehiclesButton;
    @FindBy(xpath = "//tbody[@class='grid-body']/tr[2]")
    public WebElement vehiclesTable;
    @FindBy(xpath = "//a[@title='Add an event to this record']/i")
    public WebElement addEventButton;

    @FindBy(xpath = "//span[@class='ui-dialog-title']")
    public WebElement popupAddEvent;

    @FindBy(xpath= "//label[@class='required']")
    public List<WebElement> compulsoryFields;

    @FindBy(xpath = "//i[@class='fa-caret-down']")
    public WebElement logoutButton;

    @FindBy(xpath ="//button[@title='close']")
    public WebElement popWindowClose;

    public  List<String> getElementsText(List<WebElement> list) {
        List<String> elemTexts = new ArrayList<>();
        for (WebElement el : list) {
            elemTexts.add(el.getText());
        }
        return elemTexts;
    }


}

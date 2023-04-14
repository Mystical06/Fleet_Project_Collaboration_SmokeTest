package cydeo.pages;

import cydeo.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class QuickLaunchPadPage_T {

    public QuickLaunchPadPage_T() {
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "(//span[@class='title title-level-1'])[1]")
    public WebElement fleetBtn;

    @FindBy(xpath = "//span[@class='title title-level-2']")
    public  WebElement vehiclesBtn;

    //@FindBy(xpath = "//h1[@class='oro-subtitle']")
    //public WebElement carsPage;

    @FindBy(xpath = "//a[@title='Filters']")
    public WebElement filtersIcon;

    @FindBy(xpath = "//a[@class='add-filter-button']")
    public WebElement manageFilterBtn;

    @FindBy(xpath = "//input[@id='ui-multiselect-0-0-option-1']")
    public WebElement tagsBtn;

    @FindBy(xpath = "//div[@class='btn filter-criteria-selector oro-drop-opener oro-dropdown-toggle filter-default-value']")
    public WebElement tagsSelector;

    @FindBy(xpath = "(//button[@class='btn dropdown-toggle'])[1]")
    public WebElement isAnyOfMethod1;

    @FindBy(xpath = "(//a[@class='dropdown-item choice-value'])[1]")
    public  WebElement isAnyOfmethod2;

    @FindBy(xpath = "//a[@class='dropdown-item choice-value']")
    public List<WebElement> isAnyOfDropD;

    @FindBy(xpath = "(//input[@type='text'])[2]")
    public WebElement chooseValueBox;

    @FindBy(xpath = "(//div[@class='select2-result-label'])[1]")
    public WebElement compactOption;

    @FindBy(xpath = "//button[@class='btn btn-primary filter-update']")
    public WebElement updateBtn;

    @FindBy(xpath = "(//a[@class = 'dropdown-item choice-value'])[2]")
    public WebElement isNotAnyOf;

    @FindBy(xpath = "//tbody[@class='grid-body']/tr/td[2]")
    public List<WebElement> compactCorrespondingValue;





}

package cydeo.pages;

import cydeo.utilities.BrowserUtils;
import cydeo.utilities.Driver;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class ManageFiltersPage_Aysegul {
    public ManageFiltersPage_Aysegul() {
        PageFactory.initElements(Driver.getDriver(), this);
    }


    @FindBy(xpath = "(//span[@class='title title-level-1'])[1]")
    public WebElement fleetButton;

    @FindBy(xpath = "//span[text()='Vehicles']")
    public WebElement vehicleButton;

    @FindBy(xpath = "//a[@title='Filters']")
    public WebElement filtersIcon;



    @FindBy(xpath = "//a[@class='add-filter-button']")
    public WebElement manageFiltersButton;

    public void isDisplayedManageFiltersButton() {
        BrowserUtils.waitForVisibility(manageFiltersButton, 2);
        Assert.assertTrue(manageFiltersButton.isDisplayed());
    }

    @FindBy(xpath = "//ul[@class='ui-multiselect-checkboxes ui-helper-reset fixed-li']/li")
    public List<WebElement> multiSelectCheckBoxes;


    @FindBy(xpath = "//input[@type='search']")
    public WebElement filterInputBox;

    @FindBy(xpath = "//ul[@class='ui-multiselect-checkboxes ui-helper-reset fixed-li']/li[16]")
    public WebElement CO2EmissionFilter;

    @FindBy(xpath = "//span[@class='filter-items']")
    public WebElement Co2EmissionFilterDisplay;
    @FindBy(xpath = "//input[@id='ui-multiselect-0-0-option-2']")
    public WebElement driverFilters;

    @FindBy(xpath = "//input[@id='ui-multiselect-0-0-option-3']")
    public WebElement locationFilters;



}

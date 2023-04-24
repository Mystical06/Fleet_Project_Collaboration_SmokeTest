package cydeo.pages;

import cydeo.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import javax.xml.xpath.XPath;

public class VehicleTableViewPageAmbreen {
    public  VehicleTableViewPageAmbreen (){
        PageFactory.initElements(Driver.getDriver(),this);

    }
@FindBy (xpath = "(//span[@class='title title-level-1'])[1]")
    public WebElement fleetButton;

    @FindBy(xpath = "//span[@class='title title-level-2']")
    public WebElement vehicleButton;

    @FindBy(xpath = "//tbody[@class='grid-body']/tr")
    public WebElement wholeTableView;


    @FindBy(xpath ="(//label[@class='dib'])[2]" )
    public WebElement totalPageNumber;

    @FindBy (xpath = "//ul[@class='icons-holder']/li[1]/a/i")
    public WebElement backButton;

    @FindBy(xpath = "//ul[@class='icons-holder']/li[3]/a")
    public  WebElement forwardButton;

    @FindBy(xpath = "//ul[@class='icons-holder']/li[2]/input")
    public WebElement pageNumber;

@FindBy(xpath = "(//label[@class='dib'])[3]")
public WebElement getTotalNumberofRecords;



}



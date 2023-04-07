package cydeo.pages;

import cydeo.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class QuickLaunchpadPage extends BasePage{

    public QuickLaunchpadPage() {
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "/html/body/div[2]/div[2]/header/div[2]/ul/li[1]/a/span")
    public WebElement fleetOnQLaunchpad;





@FindBy(xpath = "/html/body/div[2]/div[2]/div[1]/div[2]/div[3]/div[3]/div[2]/div[2]/div[2]/div/table/tbody/tr[1]/td[20]/div/div/a")
    public WebElement threeDotOnDriver;

@FindBy(xpath = "//*[@id=\"flash-messages\"]/div/div/div/div")
    public WebElement noPermissionMessage;















}

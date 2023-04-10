package cydeo.pages;

import cydeo.utilities.BrowserUtils;
import cydeo.utilities.ConfigurationReader;
import cydeo.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class LoginPage extends BasePage {

	public LoginPage(){

		PageFactory.initElements(Driver.getDriver(),this);

	}

	//---locators----------------

	@FindBy(id = "prependedInput")
	public WebElement usernameField;

	@FindBy(id = "prependedInput2")
	public WebElement passwordField;

	@FindBy(id = "_submit")
	public WebElement loginBtn;

	//nilay's locators starts
	@FindBy(xpath = "//h1[.='Quick Launchpad']")
	public WebElement quickLaunchPadN;
	@FindBy(xpath = "//div[@id=\"main-menu\"]/ul/li[1]/a/span/text()")
	public WebElement fleetTabN;

	@FindBy(xpath = "/html/body/div[2]/div[2]/header/div[2]/ul/li[1]/a/span")
	public WebElement fleetOnQLaunchpad;

	@FindBy(xpath = "//span[.='Vehicles']")
	public WebElement vehicleTabN;

	@FindBy(xpath = "//h1[@class='oro-subtitle']")
	public WebElement carsHeaderPageN;

	@FindBy(xpath = "//a[@class='action btn mode-icon-only']")
	public WebElement filterIconN;
	@FindBy(xpath = "//a[@class='add-filter-button']")
	public WebElement manageFilterLinkN;

	@FindBy(xpath = "//input[@value='Location']")
	public WebElement locationCheckboxN;

	@FindBy(xpath = "//div[@class='btn filter-criteria-selector oro-drop-opener oro-dropdown-toggle filter-default-value']")
	public WebElement locationButtonN;

	@FindBy(xpath = "//button[@class='btn dropdown-toggle']")
	public WebElement containsMethodN;

	@FindBy(xpath = "//div[@class='btn-group btn-block']")
	public WebElement containButtonN;

	@FindBy(xpath = "(//ul[@class='dropdown-menu'])/li[@class='active']")
	public WebElement methodsDropDownN;

	@FindBy(xpath = "//div[@class='btn-group btn-block open']//ul[@class='dropdown-menu']")
	public WebElement methodsDropDown1N;

	@FindBy(xpath = "//a[@class='dropdown-item choice-value']")
	public List<WebElement> mutullahdropdown;
	@FindBy(xpath = "//a[@data-value='2']")
	public WebElement doesNotContainMethodN;

	@FindBy(xpath = "//a[@data-value='3']")
	public WebElement isEqualToMethodN;
	@FindBy(xpath = "//a[@data-value='4']")
	public WebElement startsWithMethodN;
	@FindBy(xpath = "//a[@data-value='5']")
	public WebElement endsWithMethodN;
	@FindBy(xpath = "//a[@data-value='6']")
	public WebElement isAnyOfMethodN;
	@FindBy(xpath = "//a[@data-value='7']")
	public WebElement isNotAnyOfMethodN;
	@FindBy(xpath = "//a[@data-value='filter_empty_option']")
	public WebElement emptyMethodN;
	@FindBy(xpath = "//a[@data-value='filter_not_empty_option']")
	public WebElement isNotEmptyMethodN;





	//nilay's locators ends

	@FindBy(className = "oro-subtitle")
	private WebElement pageSubtitle;

	//---methods-----------------

	public void goLoginPage() {
		driver.get(ConfigurationReader.getProperty("url"));
	}


	public void loginAsUserType(String userType){

		//userType variable is in BasePage
		//it'll be used in other Scenarios
		BasePage.userType = userType;

		String password = "";
		String username = "";

		switch (userType.toLowerCase()) {
			case "driver":
				username = ConfigurationReader.getProperty("driver.username");
				password = ConfigurationReader.getProperty("all.pw");
				break;
			case "sales manager":
				username = ConfigurationReader.getProperty("salesmanager.username");
				password = ConfigurationReader.getProperty("all.pw");
				break;
			case "store manager":
				username = ConfigurationReader.getProperty("storemanager.username");
				password = ConfigurationReader.getProperty("all.pw");
				break;
		}

		usernameField.sendKeys(username);
		passwordField.sendKeys(password);
		loginBtn.click();
	}

	public String getSubtitle(){
		BrowserUtils.wait(1);
		return pageSubtitle.getText();
	}
}

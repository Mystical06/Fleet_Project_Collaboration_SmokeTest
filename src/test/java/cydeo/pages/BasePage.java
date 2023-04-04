package cydeo.pages;

import cydeo.utilities.ConfigurationReader;
import cydeo.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BasePage {
    public BasePage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }
    @FindBy(id="prependedInput")
    public WebElement inputUsername;

    @FindBy (id="prependedInput2")
    public WebElement inputPassword;

    @FindBy(id="_submit")
    public WebElement logInButton;

    public void DriverLogin(){
        Driver.getDriver().get(ConfigurationReader.getProperty("login.page.url"));
        inputUsername.sendKeys(ConfigurationReader.getProperty("driver.username"));
        inputPassword.sendKeys(ConfigurationReader.getProperty("all.pw"));
        logInButton.click();

    }

    public void SalesManagerLogin(){
        Driver.getDriver().get(ConfigurationReader.getProperty("login.page.url"));
        inputUsername.sendKeys(ConfigurationReader.getProperty("salesmanager.username"));
        inputPassword.sendKeys(ConfigurationReader.getProperty("all.pw"));
        logInButton.click();

    }    public void StoreManagerLogin(){
        Driver.getDriver().get(ConfigurationReader.getProperty("login.page.url"));
        inputUsername.sendKeys(ConfigurationReader.getProperty("storemanager.username"));
        inputPassword.sendKeys(ConfigurationReader.getProperty("all.pw"));
        logInButton.click();
    }




}

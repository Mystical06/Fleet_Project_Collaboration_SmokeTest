package cydeo.step_definitions;

import cydeo.pages.BasePage;
import cydeo.pages.VehicleTableViewPageAmbreen;
import cydeo.utilities.BrowserUtils;
import cydeo.utilities.ConfigurationReader;
import cydeo.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.ArrayList;
import java.util.List;

public class VehicleTableViewStep_DefinitionAmbreen {

    VehicleTableViewPageAmbreen tableView = new VehicleTableViewPageAmbreen();


    @Given("The  user \\(driver)is on the login page")
    public void the_user_driver_is_on_the_login_page() {

        Driver.getDriver().get(ConfigurationReader.getProperty("login.page.url"));

    }

    @When("the user enters the driver information")
    public void the_user_enters_the_driver_information() {
        String username = ConfigurationReader.getProperty("driver.username");
        String password = ConfigurationReader.getProperty("all.pw");

        BasePage basePage = new BasePage();
        basePage.DriverLogin();

    }

    @When("the user navigates to Fleet, Vehicles")
    public void the_user_navigates_to_fleet_vehicles() {
        tableView.fleetButton.click();
        tableView.vehicleButton.click();

    }

    @Then("the user can see all vehicle information in a table")
    public void the_user_can_see_all_vehicle_information_in_a_table() {
        tableView.wholeTableView.isDisplayed();

    }

    @Then("the user can see the total page number")
    public void the_user_can_see_the_total_page_number() {
        tableView.totalPageNumber.isDisplayed();

    }

    @Then("the user can go to the next page by clicking {string} button and" +
            " can go to the previous page by clicking {string} button")
    public void the_user_can_go_to_the_next_page_by_clicking_button_and_can_go_to_the_previous_page_by_clicking_button
            (String string, String string2) {

        Assert.assertEquals(tableView.pageNumber.getAttribute("value"), "1");
        tableView.forwardButton.click();
        Assert.assertEquals(tableView.pageNumber.getAttribute("value"), "2");
        BrowserUtils.sleep(1);
        tableView.backButton.click();
        BrowserUtils.sleep(1);
        Assert.assertEquals(tableView.pageNumber.getAttribute("value"), "1");

    }

    @Then("the user can see total recordings of vehicles")
    public void the_user_can_see_total_recordings_of_vehicles() {
        System.out.println("tableView.getTotalNumberofRecords.isDisplayed() = " + tableView.getTotalNumberofRecords.isDisplayed());


    }


}












//All of my Locators
////*[@id="main-menu"]/ul/li[1]/a/span/text() this is my fleet button
////*[@id="main-menu"]/ul/li[1]/div/div/ul/li[3]/a/span// this is my vehicle button

// //tbody[@class='grid-body']/tr to see the whole table
////*[@id="grid-custom-entity-grid-1619866585"]/div[2]/div[1]/div/div[4]/label[2]// to see the total pages
////*[@id="grid-custom-entity-grid-1619866585"]/div[2]/div[1]/div/div[4]/ul/li[1]/a/i to click on the right button
////i[@class='fa-chevron-left hide-text'] another for  back arrow
// //i[@class='fa-chevron-right hide-text'] for forward arrow
// //*[@id="grid-custom-entity-grid-1619866585"]/div[2]/div[1]/div/div[4]/label[3] for the total numbner of recordings
////(//label[@class='dib'])[3]
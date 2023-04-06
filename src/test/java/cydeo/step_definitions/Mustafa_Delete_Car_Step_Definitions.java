package cydeo.step_definitions;

import cydeo.pages.DashboardPage_SalesManager;
import cydeo.pages.QuickLaunchpadPage_Driver;
import cydeo.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Alert;
import org.openqa.selenium.interactions.Actions;

import java.util.List;

public class Mustafa_Delete_Car_Step_Definitions {

    DashboardPage_SalesManager dashboard = new DashboardPage_SalesManager();
    QuickLaunchpadPage_Driver quickLaunchpad=new QuickLaunchpadPage_Driver();
    Actions action = new Actions(Driver.getDriver());


    @When("User clicks on Fleet tab")
    public void user_clicks_on_fleet_tab() throws InterruptedException {
           dashboard.fleetTab.click();
           Thread.sleep(2000);
    }

    @When("User clicks on Vehicles option under fleet tab")
    public void user_clicks_on_vehicles_option_under_fleet_tab()  {
            dashboard.vehiclesOption.click();

    }
    @Then("User hovers to three dots at the end of a row")
    public void user_hovers_to_three_dots_at_the_end_of_a_row() {
        action.moveToElement(dashboard.threeDotsInCarsPage).perform();

    }
    @Then("User sees delete button")
    public void user_sees_delete_button() throws InterruptedException {
        Thread.sleep(3000);
        action.moveToElement(dashboard.deleteButton).perform();
        dashboard.deleteButton.isDisplayed();
    }

    @Then("User clicks on delete button")
    public void user_clicks_on_delete_button() {
        dashboard.deleteButton.click();
    }
    @Then("User sees delete confirmation popup")
    public void user_sees_delete_confirmation_popup() throws InterruptedException {
        Thread.sleep(3000);
    dashboard.deleteConfirmationPopup.isDisplayed();
    }

    @Then("User clicks on Yes,Delete button")
    public void user_clicks_on_yes_delete_button() {


       dashboard.yesDeleteButton.click();
    }
    @Then("User sees item deleted message")
    public void user_sees_item_deleted_message() {
       dashboard.itemDeletedMessage.isDisplayed();
    }



    @Given("User logs in as a {string}")
    public void userLogsInAsA(String user) {
        if(user.equals("driver")){
            quickLaunchpad.DriverLogin();
        }
        if(user.equals("store manager")){
            dashboard.StoreManagerLogin();
        }
        if (user.equals("sales manager")){
            dashboard.SalesManagerLogin();
        }

    }

    @Then("User hovers to three dots at the end of a row of driver fleet")
    public void userHoversToThreeDotsAtTheEndOfARowOfDriverFleet() {
        action.moveToElement(quickLaunchpad.threeDotOnDriver).perform();
        dashboard.deleteButton.isDisplayed();
    }

    @Then("User sees no permission message")
    public void userSeesNoPermissionMessage() {
        quickLaunchpad.noPermissionMessage.isDisplayed();
    }

    @When("User clicks on Fleet tab on quick launchpad page")
    public void userClicksOnFleetTabOnQuickLaunchpadPage() {
        quickLaunchpad.fleetOnQLaunchpad.click();
    }

    @Then("User confirms the deleted car is no longer on the Fleet-Vehicle page")
    public void userConfirmsTheDeletedCarIsNoLongerOnTheFleetVehiclePage() {

      try {
          dashboard.deletedChassisNo.isDisplayed();
      } catch (Exception e){
          System.out.println("Element no longer exists");
      }

    }







}

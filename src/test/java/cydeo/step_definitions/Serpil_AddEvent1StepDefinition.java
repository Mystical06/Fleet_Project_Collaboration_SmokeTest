package cydeo.step_definitions;

import cydeo.pages.AddEventPage_SRP;
import cydeo.pages.BasePage;
import cydeo.utilities.BrowserUtils;
import cydeo.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class Serpil_AddEvent1StepDefinition {

   AddEventPage_SRP addEventPageSRP = new AddEventPage_SRP();
   BasePage basePage = new BasePage();

    @Given("user is on the  dashboard page")
    public void user_is_on_the_dashboard_page() {
        basePage.storeManagerLogin();

    }
    @When("the user hover over and clicks on the fleet module")
    public void theUserHoverOverAndClicksOnTheFleetModule() {
//        Actions actions = new Actions(Driver.getDriver());
//        actions.moveToElement(addEventPageSRP.fleetButton).perform();
        addEventPageSRP.fleetButton.click();

    }
    @Then("the user clicks on the vehicles module")
    public void the_user_clicks_on_the_vehicles_module() {
        addEventPageSRP.vehiclesButton.click();

    }
    @Then("the user clicks on the any vehicles row")
    public void the_user_clicks_on_the_any_vehicles_row() {
        BrowserUtils.waitFor(20);
        addEventPageSRP.vehiclesTable.click();
        BrowserUtils.waitFor(10);
    }
    @And("user should be able to see {string} button")
    public void user_should_be_able_to_see_button(String expectedAddButton) {
        Assert.assertEquals(expectedAddButton, addEventPageSRP.addEventButton.getText());

    }

    @Then("the user clicks on the Add Event button")
    public void the_user_clicks_on_the_add_event_button() {
        addEventPageSRP.addEventButton.click();
        BrowserUtils.waitFor(10);
    }


    @Then("user should be able to see pop up window and sees following compulsory fields")
    public void user_should_be_able_to_see_pop_up_window_and_sees_following_compulsory_fields(List<String> expectedFields) {
//        String parentWindowHandler = Driver.getDriver().getWindowHandle(); // Store your parent window
//        String subWindowHandler = null;
//
//        Set<String> handles = Driver.getDriver().getWindowHandles(); // get all window handles
//        Iterator<String> iterator = handles.iterator();
//        while (iterator.hasNext()){
//            subWindowHandler = iterator.next();
//        }
//        Driver.getDriver().switchTo().window(subWindowHandler); // switch to popup window
        Assert.assertEquals("Add Event", addEventPageSRP.popupAddEvent.getText());

        List<String> actualFields = new ArrayList<>();

        List<WebElement> elements = addEventPageSRP.compulsoryFields;
        for (WebElement field : elements) {
            actualFields.add(field.getText());


        }
        System.out.println("expectedFields = " + expectedFields.toString());
        System.out.println("actualFields = " + actualFields);
        Assert.assertEquals(expectedFields, actualFields);

        //Driver.getDriver().switchTo().window(parentWindowHandler);

    }

    @Then("the user logout")
    public void theUserLogout() {

        addEventPageSRP.logoutButton.click();
    }

    @And("user clicks the close button")
    public void userClicksTheCloseButton() {
        addEventPageSRP.popWindowClose.click();
    }



    }


package cydeo.step_definitions;

import cydeo.pages.ManageFiltersPage_Aysegul;
import cydeo.utilities.BrowserUtils;
import cydeo.utilities.Driver;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import java.util.ArrayList;
import java.util.List;


public class Aysegul_FilterMenuStepDefinition {

    ManageFiltersPage_Aysegul manageFiltersPage_aysegul = new ManageFiltersPage_Aysegul();
    Actions actions = new Actions(Driver.getDriver());


    @Then("the user hovers over the fleet menu and clicks the vehicle button")
    public void the_user_hovers_over_the_fleet_menu_and_clicks_the_vehicle_button() {
        BrowserUtils.wait(5);
        actions.moveToElement(manageFiltersPage_aysegul.fleetButton).build().perform(); //for hover over
        actions.moveToElement(manageFiltersPage_aysegul.vehicleButton).click().build().perform(); //for click

    }

    @When("the user clicks on the filter icon")
    public void the_user_clicks_on_the_filter_icon() {
        BrowserUtils.wait(5);
        manageFiltersPage_aysegul.filtersIcon.click();


    }

    @Then("the Manage Filters button should be visible")
    public void the_manage_filters_button_should_be_visible() {

        manageFiltersPage_aysegul.isDisplayedManageFiltersButton();
    }


    @Then("the user clicks on the Manage Filters button")
    public void the_user_clicks_on_the_manage_filters_button() {
        manageFiltersPage_aysegul.manageFiltersButton.click();

    }

    @Then("User should see Manage Filters menu contains the following filters")
    public void user_should_see_manage_filters_menu_contains_the_following_filters(List<String> expectedFilterNames) {

        List<WebElement> manageFiltersList = manageFiltersPage_aysegul.multiSelectCheckBoxes;
        List<String> manageFiltersListText = new ArrayList<>();

        for (WebElement each : manageFiltersList) {
            manageFiltersListText.add(each.getText());

        }
        System.out.println(manageFiltersListText);
        Assert.assertEquals(expectedFilterNames, manageFiltersListText);

    }

    @Then("the user types the filter name in the search bar and presses enter")
    public void the_user_types_the_filter_name_in_the_search_bar_and_presses_enter() {
        BrowserUtils.sleep(5);
        manageFiltersPage_aysegul.filterInputBox.sendKeys("CO2");
        BrowserUtils.wait(5);
        manageFiltersPage_aysegul.CO2EmissionFilter.click();



    }


    @Then("the corresponding filter type should be displayed on the page")
    public void the_corresponding_filter_type_should_be_displayed_on_the_page() {


        Assert.assertTrue(manageFiltersPage_aysegul.Co2EmissionFilterDisplay.isDisplayed());



}

    @Then("the user selects multiple filters")
    public void the_user_selects_multiple_filters() {

        BrowserUtils.wait(5);
        manageFiltersPage_aysegul.driverFilters.click();
        BrowserUtils.wait(5);
        manageFiltersPage_aysegul.locationFilters.click();


    }


    @Then("the corresponding filter types should be displayed on the page")
    public void the_corresponding_filter_types_should_be_displayed_on_the_page() {
      Assert.assertTrue(manageFiltersPage_aysegul.driverFilters.isDisplayed());
      Assert.assertTrue(manageFiltersPage_aysegul.locationFilters.isDisplayed());



          }

}




package cydeo.step_definitions;

import cydeo.pages.BasePage;
import cydeo.pages.LoginPage;
import cydeo.pages.QuickLaunchPadPage_T;
import cydeo.utilities.BrowserUtils;
import cydeo.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import java.util.ArrayList;
import java.util.List;

public class TugbaTagsFilterStepDefinition {

    LoginPage loginPage = new LoginPage();
    BasePage basePage = new BasePage();
    QuickLaunchPadPage_T quickLaunchPadPage_T = new QuickLaunchPadPage_T();
    Actions actions = new Actions(Driver.getDriver());

    @Given("the user is on the Quick Launchpad page")
    public void the_user_is_on_the_quick_launchpad_page() {
        basePage.driverLogin();
    }


    @Then("the user hovers over the Fleet menu and clicks the Vehicle button")
    public void the_user_hovers_over_the_fleet_menu_and_clicks_the_vehicle_button() {
        BrowserUtils.wait(10);
        actions.moveToElement(quickLaunchPadPage_T.fleetBtn).build().perform(); //for hover over
        actions.moveToElement(quickLaunchPadPage_T.vehiclesBtn).click().build().perform(); //for click
    }

    @And("the user is on the {string} page")
    public void the_user_is_on_the_page(String string) {
        BrowserUtils.wait(10);
        Assert.assertTrue(Driver.getDriver().getTitle().contains("Car"));

    }

    @Then("the user clicks on the filters icon")
    public void the_user_clicks_on_the_filters_icon() {
        quickLaunchPadPage_T.filtersIcon.click();
    }

    @And("the user clicks on the manage filter")
    public void the_user_clicks_on_the_manage_filter() {
        quickLaunchPadPage_T.manageFilterBtn.click();
    }

    @And("the user selects the {string} filter")
    public void the_user_selects_the_filter(String string) {
        quickLaunchPadPage_T.tagsBtn.click();
    }

    @And("the user click {string} selector")
    public void the_user_click_selector(String string) {
        quickLaunchPadPage_T.tagsSelector.click();
    }

    @Then("the user click the {string} option")
    public void the_user_click_the_option(String string) {
        BrowserUtils.wait(10);
        quickLaunchPadPage_T.isAnyOfOption1.click();
    }

    @And("User sees all methods in the filter")
    public void user_sees_all_methods_in_the_filter(List<String> expectedMethod) {
        BrowserUtils.wait(10);
       List<String> actualMethod = BrowserUtils.driverIsAnyOf(quickLaunchPadPage_T.isAnyOfDropD);
       Assert.assertEquals(expectedMethod,actualMethod);
        System.out.println(actualMethod);
        System.out.println(expectedMethod);
    }

    @Then("the user click {string} option" )
    public void the_user_click_option(String string) {
    BrowserUtils.wait(10);
    quickLaunchPadPage_T.isAnyOfOption2.click();

}
    @Then("the user click choose values box")
    public void the_user_click_choose_values_box() {
        BrowserUtils.wait(10);
        quickLaunchPadPage_T.chooseValueBox.click();

    }

    @And("the user click the Compact option")
    public void the_user_click_the_compact_option() {
        BrowserUtils.wait(10);
        quickLaunchPadPage_T.compactOption.click();
    }


    @Then("the user click update button")
    public void the_user_click_update_button() {
        BrowserUtils.wait(10);
        quickLaunchPadPage_T.updateBtn.click();
    }


    @Then("the table should display the corresponding value.")
    public void the_table_should_display_the_corresponding_value() {
        BrowserUtils.wait(10);
        List<WebElement> compactCorrespondingValues = quickLaunchPadPage_T.compactCorrespondingValue;
        List<String> compactCorrespondingValuesText = new ArrayList<>();
        for (WebElement each:compactCorrespondingValues) {
        compactCorrespondingValuesText.add(each.getText());
        }
        BrowserUtils.wait(10);
        System.out.println(compactCorrespondingValuesText);
        Assert.assertTrue(compactCorrespondingValuesText.contains("Compact"));
    }

    @Then("the user click Is Not Any Of method")
    public void the_user_click_is_not_any_of_method() {
        BrowserUtils.wait(10);
        quickLaunchPadPage_T.isNotAnyOf.click();
    }


    @Then("the table should not include the corresponding value.")
    public void the_table_should_not_include_the_corresponding_value() {
        BrowserUtils.wait(10);
        List<WebElement> compactCorrespondingValues = quickLaunchPadPage_T.compactCorrespondingValue;
        List<String> compactCorrespondingValuesText = new ArrayList<>();
        for (WebElement each:compactCorrespondingValues) {
            compactCorrespondingValuesText.add(each.getText());
        }
        BrowserUtils.wait(10);
        System.out.println(compactCorrespondingValuesText);
        Assert.assertFalse(compactCorrespondingValuesText.contains("Compact"));
    }

    }



package cydeo.step_definitions;

import cydeo.pages.BasePage;
import cydeo.pages.LoginPage;
import cydeo.pages.QuickLaunchPadPage_TagsF;
import cydeo.utilities.BrowserUtils;
import cydeo.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import java.util.ArrayList;
import java.util.List;

public class TugbaTagsFilterStepDefinition {

    LoginPage loginPage = new LoginPage();
    BasePage basePage = new BasePage();
    QuickLaunchPadPage_TagsF quickLaunchPadPage_TagsF = new QuickLaunchPadPage_TagsF();
    Actions actions = new Actions(Driver.getDriver());

    @Given("the user is on the Quick Launchpad page")
    public void the_user_is_on_the_quick_launchpad_page() {
        basePage.driverLogin();
    }


    @Then("the user hovers over the Fleet menu and clicks the Vehicle button")
    public void the_user_hovers_over_the_fleet_menu_and_clicks_the_vehicle_button() {
        BrowserUtils.wait(10);
        actions.moveToElement(quickLaunchPadPage_TagsF.fleetBtn).build().perform(); //for hover over
        actions.moveToElement(quickLaunchPadPage_TagsF.vehiclesBtn).click().build().perform(); //for click
    }

    @And("the user is on the Cars page")
    public void the_user_is_on_the_cars_page() {
        BrowserUtils.wait(10);
        Assert.assertTrue(Driver.getDriver().getTitle().contains("Car"));

    }

    @Then("the user clicks on the filters icon")
    public void the_user_clicks_on_the_filters_icon() {
        quickLaunchPadPage_TagsF.filtersIcon.click();
    }

    @And("the user clicks on the manage filter")
    public void the_user_clicks_on_the_manage_filter() {
        quickLaunchPadPage_TagsF.manageFilterBtn.click();
    }

    @And("the user selects the Tags filter")
    public void the_user_selects_the_tags_filter() {
        quickLaunchPadPage_TagsF.tagsBtn.click();
    }

    @And("the user click Tags selector")
    public void the_user_click_tags_selector() {
        quickLaunchPadPage_TagsF.tagsSelector.click();
    }

    @Then("the user click the Is Any Of method")
    public void the_user_click_the_is_any_of_method() {
        BrowserUtils.wait(10);
        quickLaunchPadPage_TagsF.isAnyOfMethod1.click();
    }

    @And("User sees all methods in the filters")
    public void user_sees_all_methods_in_the_filters(List<String> expectedMethod) {
        BrowserUtils.wait(10);
        List<String> actualMethod = BrowserUtils.driverIsAnyOf(quickLaunchPadPage_TagsF.isAnyOfDropD);
        Assert.assertEquals(expectedMethod,actualMethod);
        System.out.println(actualMethod);
        System.out.println(expectedMethod);
    }

    @Then("the user click Is Any Of method" )
    public void the_user_click_is_any_of_method() {
    BrowserUtils.wait(10);
    quickLaunchPadPage_TagsF.isAnyOfmethod2.click();

}
    @Then("the user click choose values box")
    public void the_user_click_choose_values_box() {
        BrowserUtils.wait(10);
        quickLaunchPadPage_TagsF.chooseValueBox.click();

    }

    @And("the user click the Compact option")
    public void the_user_click_the_compact_option() {
        BrowserUtils.wait(10);
        quickLaunchPadPage_TagsF.compactOption.click();
    }


    @Then("the user click update button")
    public void the_user_click_update_button() {
        BrowserUtils.wait(10);
        quickLaunchPadPage_TagsF.updateBtn.click();
    }


    @Then("the table should display the corresponding value.")
    public void the_table_should_display_the_corresponding_value() {
        BrowserUtils.wait(10);
        List<WebElement> compactCorrespondingValues = quickLaunchPadPage_TagsF.compactCorrespondingValue;
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
        quickLaunchPadPage_TagsF.isNotAnyOf.click();
    }


    @Then("the table should not include the corresponding value.")
    public void the_table_should_not_include_the_corresponding_value() {
        BrowserUtils.wait(10);
        List<WebElement> compactCorrespondingValues = quickLaunchPadPage_TagsF.compactCorrespondingValue;
        List<String> compactCorrespondingValuesText = new ArrayList<>();
        for (WebElement each:compactCorrespondingValues) {
            compactCorrespondingValuesText.add(each.getText());
        }
        BrowserUtils.wait(10);
        System.out.println(compactCorrespondingValuesText);
        Assert.assertFalse(compactCorrespondingValuesText.contains("Compact"));
    }

    }



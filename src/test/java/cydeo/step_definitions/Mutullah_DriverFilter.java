package cydeo.step_definitions;

import cydeo.pages.DashboardPage;
import cydeo.pages.DropdownsPage;
import cydeo.utilities.BrowserUtils;
import cydeo.utilities.Driver;
import io.cucumber.java.en.Then;
import io.cucumber.java.eo.Se;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import java.util.ArrayList;
import java.util.List;

public class Mutullah_DriverFilter {


    DashboardPage dashboard = new DashboardPage();

    @Then("User clicks on the filter icon")
    public void user_clicks_on_the_filter_icon() throws InterruptedException {
        Thread.sleep(3000);
        dashboard.driverFilterIcon.click();
        Thread.sleep(2000);

    }
    @Then("User clicks on the Manage Filters button")
    public void user_clicks_on_the_manage_filters_button() throws InterruptedException {
        dashboard.manageFilterButton.click();
        Thread.sleep(3000);

    }
    @Then("User clicks the Driver from the dropdown")
    public void user_clicks_the_driver_from_the_dropdown() throws InterruptedException {
        dashboard.driverDropdown.click();
        Thread.sleep(3000);
    }
    @Then("User clicks the Driver:All button")
    public void user_clicks_the_driver_all_button() throws InterruptedException {
        dashboard.driverAllButton.click();
        Thread.sleep(3000);
    }
    @Then("User clicks the Contains button")
    public void user_clicks_the_contains_button() throws InterruptedException {

        //action.moveToElement(dashboard.containsButton).perform();
        dashboard.containsButton.click();
        Thread.sleep(3000);
    }

    DropdownsPage dropdownsPage = new DropdownsPage();
    @Then("User sees all methods in the filter")
    public void user_sees_all_methods_in_the_filter(List<String>expectedMethods) {
        Select select = new Select(dropdownsPage.DriverAllDropdown);
        List<WebElement> actualOptionsAsWebElement = select.getOptions();

        List<String> actualOptionsAsString = new ArrayList<>();

        for (WebElement each : actualOptionsAsWebElement) {
            actualOptionsAsString.add(each.getText());
        }
        Assert.assertEquals(expectedMethods,actualOptionsAsString);

    }

    @Then("User clicks the StartsWith button")
    public void user_clicks_the_starts_with_button() {
        dashboard.driverStartsWith.click();
    }

    @Then("User send the valid key {string}")
    public void user_send_the_valid_key(String keyword) {
        dashboard.valueEnterField.sendKeys(keyword);
        dashboard.updateBtn.click();



    }


}

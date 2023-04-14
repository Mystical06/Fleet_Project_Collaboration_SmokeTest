package cydeo.step_definitions;

import cydeo.pages.DashboardPage;
import cydeo.utilities.BrowserUtils;
import io.cucumber.java.en.Then;
import org.junit.Assert;

import java.util.List;


public class Mutullah_DriverFilter {


    DashboardPage dashboard = new DashboardPage();

    @Then("User clicks on the filter icon")
    public void user_clicks_on_the_filter_icon() throws InterruptedException {
        Thread.sleep(2000);
        dashboard.driverFilterIcon.click();
        Thread.sleep(2000);

    }
    @Then("User clicks on the Manage Filters button")
    public void user_clicks_on_the_manage_filters_button() throws InterruptedException {
        dashboard.manageFilterButton.click();
        Thread.sleep(2000);

    }
    @Then("User clicks the Driver from the dropdown")
    public void user_clicks_the_driver_from_the_dropdown() throws InterruptedException {
        dashboard.driverDropdown.click();
        Thread.sleep(2000);
    }
    @Then("User clicks the Driver:All button")
    public void user_clicks_the_driver_all_button() throws InterruptedException {
        dashboard.driverAllButton.click();
        Thread.sleep(2000);
    }
    @Then("User clicks the Contains button")
    public void user_clicks_the_contains_button() throws InterruptedException {

        //action.moveToElement(dashboard.containsButton).perform();
        dashboard.containsButton.click();
        Thread.sleep(2000);
    }

    @Then("User sees all methods in the filter")
    public void user_sees_all_methods_in_the_filter(List<String>expectedDriverAllDropDown) {

        List<String> actualDriverAllDropDown = BrowserUtils.driverAllDropdownOptionsAsString(dashboard.actualDropDownElements);
        Assert.assertEquals(expectedDriverAllDropDown,actualDriverAllDropDown);

        System.out.println(expectedDriverAllDropDown);
        System.out.println(actualDriverAllDropDown);
    }

    //SECOND SCENARIO


    @Then("User clicks the Starts With button")
    public void user_clicks_the_starts_with_button() throws InterruptedException {
        dashboard.driverStartsWith.click();
        Thread.sleep(2000);
    }
    @Then("User enter valid keyword {string}")
    public void user_enter_valid_keyword(String string) throws InterruptedException {
        dashboard.valueEnterField.sendKeys(string);
        Thread.sleep(2000);
        dashboard.updateBtn.click();
        //dashboard.valueEnterField.sendKeys(Keys.BACK_SPACE);

    }

    @Then("User sees the driver names start with entered keyword")
    public List<String> user_sees_the_driver_names_start_with_entered_keyword() throws InterruptedException {

        Thread.sleep(2000);
        List<String> selectedNamesWithEnteredKeyword = BrowserUtils.selectedNames(dashboard.selectedNamesOnPage);
        System.out.println(selectedNamesWithEnteredKeyword);

        String key = dashboard.enteredKeyword.getText();

        for (String driverNamesOnPage: selectedNamesWithEnteredKeyword) {
            boolean withTheStartsKeys = driverNamesOnPage.startsWith(key);

            System.out.println(withTheStartsKeys);
        }
        return selectedNamesWithEnteredKeyword;
    }

    @Then("User clicks the Ends With button")
    public void user_clicks_the_ends_with_button() throws InterruptedException {
        dashboard.driverEndsWith.click();
        Thread.sleep(2000);

    }
    @Then("User sees the driver names end with entered keyword")
    public List<String> user_sees_the_driver_names_end_with_entered_keyword() throws InterruptedException {
        Thread.sleep(2000);
        List<String> selectedNamesWithEnteredKeyword = BrowserUtils.selectedNames(dashboard.selectedNamesOnPage);
        System.out.println(selectedNamesWithEnteredKeyword);

        String key = dashboard.enteredKeyword.getText();

        for (String driverNamesOnPage: selectedNamesWithEnteredKeyword) {
            boolean withTheEndsKeys = driverNamesOnPage.endsWith(key);

            System.out.println(withTheEndsKeys);
        }
        return selectedNamesWithEnteredKeyword;

    }



}




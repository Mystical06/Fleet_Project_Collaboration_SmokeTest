package cydeo.step_definitions;

import cydeo.pages.LoginPage;
import cydeo.utilities.BrowserUtils;
import cydeo.utilities.ConfigurationReader;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

import java.util.List;

public class Nilay_location_filter_methods_step_definition {
    public LoginPage loginPage = new LoginPage();

    @When("user lands on Quick Launchpad")
    public void user_lands_on_quick_launchpad() throws InterruptedException {
        Thread.sleep(2000);
        String expectedText = "Quick Launchpad";
        System.out.println(expectedText);
        String actualText = loginPage.quickLaunchPadN.getText();
        System.out.println(actualText);
        Assert.assertEquals(actualText, expectedText);
    }

    @Then("user selects Vehicle under Fleet menu")
    public void user_selects_vehicle_under_fleet_menu() throws InterruptedException {
        //loginPage.fleetTabN.click();
        loginPage.fleetOnQLaunchpad.click();
        Thread.sleep(2000);
        loginPage.vehicleTabN.click();
        Thread.sleep(2000);

    }

    @Then("user lands on Cars page")
    public void user_lands_on_cars_page() {
        String expectedText = "Cars";
        System.out.println(expectedText);
        String actualText = loginPage.carsHeaderPageN.getText();
        System.out.println(actualText);
        Assert.assertEquals(actualText, expectedText);
    }

    @Then("user clicks on filter icon")
    public void user_clicks_on_filter_icon() throws InterruptedException {
        Thread.sleep(1000);
        loginPage.filterIconN.click();
        Thread.sleep(2000);

    }

    @Then("user clicks on manage filters and selects location checkbox")
    public void user_clicks_on_manage_filters_and_selects_location_checkbox() throws InterruptedException {
        loginPage.manageFilterLinkN.click();
        Thread.sleep(2000);
        loginPage.locationCheckboxN.click();

    }

    @Then("user clicks on location button to see various methods")
    public void user_clicks_on_location_button_to_see_various_methods() throws InterruptedException {
        loginPage.locationButtonN.click();
        Thread.sleep(3000);
        loginPage.containButtonN.click();


    }

    @Then("User should see below methods")
    public void user_Should_See_Below_Methods(List<String> expectedMethods) throws InterruptedException {
        Thread.sleep(2000);
        List<String> actualMethodDropDown = BrowserUtils.driverAllDropdownOptionsAsString(loginPage.Mdropdown);
        Assert.assertEquals(expectedMethods, actualMethodDropDown);
        System.out.println(expectedMethods);
        System.out.println(actualMethodDropDown);
        Thread.sleep(2000);

    }

    @Then("user enters keyword in the search box and click update button")
    public void user_enters_keyword_in_the_search_box_and_click_update_button() throws InterruptedException {
        loginPage.methodSearchField.sendKeys(ConfigurationReader.getProperty("locationfilter.searchtext"));
        loginPage.methodUpdateBtn.click();
        Thread.sleep(3000);
    }

    @Then("user verifies the results")
    public List<String> user_verifies_the_results() throws InterruptedException {
        Thread.sleep(2000);
        List<String> containsResult = BrowserUtils.methodAllResultsAsString(loginPage.containResults);
        System.out.println(containsResult);
        String expectedResult = ConfigurationReader.getProperty("locationfilter.searchtext");
        System.out.println(expectedResult);

        for (String each : containsResult) {
            boolean result2 = each.contains(expectedResult);
           System.out.println(result2);

        }


        return containsResult;
    }

    @Then("user selects does not contain method")
    public void user_selects_does_not_contain_method() {
        loginPage.doesNotContainMethodN.click();
    }


    @Then("user enters keyword in the search box and clicks on update button")
    public void user_Enters_Keyword_In_The_Search_Box_And_Clicks_On_Update_Button() {
        loginPage.methodSearchField.sendKeys(ConfigurationReader.getProperty("locationfilter.searchtext"));
        loginPage.methodUpdateBtn.click();
    }


    @Then("user clicks on the view per page button and select last option")
    public void userClicksOnTheViewPerPageButtonAndSelectLastOption() throws InterruptedException{
        Thread.sleep(2000);
        loginPage.ViewPerPageBtn.click();
        Thread.sleep(2000);
        loginPage.lastOption.click();



    }
    @Then("user verifies the results on WebTable")
    public List<String> user_Verifies_The_Results_On_WebTable() throws InterruptedException {
        Thread.sleep(2000);
        List<String> containsResult = BrowserUtils.methodAllResultsAsString(loginPage.containResults);
        System.out.println(containsResult);
        String expectedResult = ConfigurationReader.getProperty("locationfilter.searchtext");
        System.out.println(expectedResult);

        for (String each : containsResult) {
            boolean result2 = each.contains(expectedResult);
            System.out.println(!result2);

        }
        return containsResult;




    }



    @Then("user clicks on the second page")
    public void userClicksOnTheSecondPage() throws InterruptedException{
        Thread.sleep(3000);
        loginPage.nextPage.click();
        Thread.sleep(2000);
        loginPage.ViewPerPageBtn.click();
        Thread.sleep(2000);
        loginPage.lastOption.click();
        Thread.sleep(2000);
    }
}
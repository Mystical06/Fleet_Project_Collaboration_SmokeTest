package cydeo.step_definitions;

import cydeo.pages.LoginPage;
import cydeo.utilities.BrowserUtils;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.java.sl.In;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.List;
import java.util.Objects;

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

       WebElement methods = loginPage.methodsDropDown1N;

       String actualMethod = methods.getText().trim();
       System.out.println(actualMethod);
       //List<String> actualMethods = BrowserUtils.dropdownOptionsAsString(loginPage.methodsDropDownN);
        //System.out.println(actualMethod);
        System.out.println(expectedMethods);

        //Assert.assertEquals(actualMethods,expectedMethods);
        // Assert.assertEquals(expectedMethods, actualMethod);
        Thread.sleep(2000);

    }

/*
    @Then("user validate contains method is displayed")
    public void user_validate_contains_method_is_displayed() throws InterruptedException{
        Thread.sleep(2000);
        String expectedText = "Contains";
        System.out.println(expectedText);
        String actualText = loginPage.containsMethodN.getText();
        System.out.println(actualText);
        Assert.assertEquals(actualText, expectedText);
        Thread.sleep(2000);
    }

    @Then("user validate does not contains method is displayed")
    public void user_validate_does_not_contains_method_is_displayed() throws InterruptedException{
        loginPage.containsMethodN.click();
        Thread.sleep(2000);
        loginPage.doesNotContainMethodN.click();
        String expectedText = "Does Not Contain";
        System.out.println(expectedText);
        String actualText = loginPage.doesNotContainMethodN.getText();
        System.out.println(actualText);
        Assert.assertEquals(actualText, expectedText);
        Thread.sleep(2000);
    }

    @Then("user validate is equal to method is displayed")
    public void user_validate_is_equal_to_method_is_displayed() throws InterruptedException {
        loginPage.containsMethodN.click();
        Thread.sleep(2000);
        loginPage.isEqualToMethodN.click();
        String expectedText = "Is Equal To";
        System.out.println(expectedText);
        String actualText = loginPage.isEqualToMethodN.getText();
        System.out.println(actualText);
        Assert.assertEquals(actualText, expectedText);
    }

    @Then("user validate starts with method is displayed")
    public void user_validate_starts_with_method_is_displayed() {
        String expectedText = "Starts With";
        System.out.println(expectedText);
        String actualText = loginPage.startsWithMethodN.getText();
        System.out.println(actualText);
        Assert.assertEquals(actualText, expectedText);
    }

    @Then("user validate ends with method is displayed")
    public void user_validate_ends_with_method_is_displayed() {
        String expectedText = "Ends With";
        System.out.println(expectedText);
        String actualText = loginPage.endsWithMethodN.getText();
        System.out.println(actualText);
        Assert.assertEquals(actualText, expectedText);
    }


    @Then("user validate is any of method is displayed")
    public void user_validate_is_any_of_method_is_displayed() {
        String expectedText = "Is Any Of";
        System.out.println(expectedText);
        String actualText = loginPage.isAnyOfMethodN.getText();
        System.out.println(actualText);
        Assert.assertEquals(actualText, expectedText);
    }

    @Then("user validate is not any of method is displayed")
    public void user_validate_is_not_any_of_method_is_displayed() {
        String expectedText = "Is Not Any Of";
        System.out.println(expectedText);
        String actualText = loginPage.isNotAnyOfMethodN.getText();
        System.out.println(actualText);
        Assert.assertEquals(actualText, expectedText);
    }

    @Then("user validate is empty method is displayed")
    public void user_validate_is_empty_method_is_displayed() {
        String expectedText = "Is Empty";
        System.out.println(expectedText);
        String actualText = loginPage.emptyMethodN.getText();
        System.out.println(actualText);
        Assert.assertEquals(actualText, expectedText);
    }

    @Then("user validate is not empty method is displayed")
    public void user_validate_is_not_empty_method_is_displayed() {
        String expectedText = "Is Not Empty";
        System.out.println(expectedText);
        String actualText = loginPage.isNotEmptyMethodN.getText();
        System.out.println(actualText);
        Assert.assertEquals(actualText, expectedText);
    }
*/

    @Then("user selects contains method")
    public void user_selects_contains_method(String string) {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @Then("user enters keyword in the search box and click update button")
    public void user_enters_keyword_in_the_search_box_and_click_update_button() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @Then("user verifies the results")
    public void user_verifies_the_results() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @Then("user selects does not contain method")
    public void user_selects_does_not_contain_method(String string) {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }


}

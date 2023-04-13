package cydeo.step_definitions;

import cydeo.pages.AddEventPage;
import cydeo.pages.BasePage;
import cydeo.pages.DashboardPage;
import cydeo.pages.LoginPage;
import cydeo.utilities.BrowserUtils;
import cydeo.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.Color;
import org.openqa.selenium.support.ui.Select;

import java.util.*;
import java.util.concurrent.TimeUnit;

import static org.junit.Assert.*;

public class AsiyeAddEvent2Step_definitions {


    BasePage basePage = new BasePage();
    LoginPage loginPage = new LoginPage();

    DashboardPage dashboardPage = new DashboardPage();

    AddEventPage addEventPage = new AddEventPage();

    Actions actions = new Actions(Driver.getDriver());

    @When("user login as a store manager")
    public void user_login_as_a_store_manager() {
        loginPage.storeManagerLogin();
    }

    @When("user clicks on Fleet menu")
    public void user_clicks_on_fleet_menu() throws InterruptedException {
        Thread.sleep(6);
        BrowserUtils.clickWithJS(dashboardPage.fleetTab);
        BrowserUtils.sleep(3);
    }

    @When("user clicks on  Vehicle dropdown")
    public void user_clicks_on_vehicle_dropdown() {
        BrowserUtils.waitFor(3);
        BrowserUtils.clickWithJS(dashboardPage.vehiclesOption);
    }

    @When("user clicks any row on general information page")
    public void user_clicks_any_row_on_general_information_page() {
        BrowserUtils.waitFor(3);
        dashboardPage.anyLicensePlate.click();
    }

    @When("user clicks on Add Event menu")
    public void user_clicks_on_add_event_menu() {
        String currentHandle = Driver.getDriver().getWindowHandle();
        //  System.out.println("currentHandle = " + currentHandle);

        BrowserUtils.waitFor(3);
        dashboardPage.addEventButton.click();

        Set<String> allHandles = Driver.getDriver().getWindowHandles();
        System.out.println("allHandles = " + allHandles);

        for (String eachHandle : allHandles) {
            Driver.getDriver().switchTo().window(eachHandle);
        }
    }


    @When("user fills  compulsory areas")
    public void userFillsCompulsoryAreas(Map<String, String> credentials1) {

        addEventPage.titleInput.sendKeys(credentials1.get("title"));
        actions.moveToElement(addEventPage.organiserNameInput).sendKeys(credentials1.get("organiser")).build().perform();
        System.out.println("**");
        addEventPage.emailInput.sendKeys(credentials1.get("email"));
        System.out.println("***");
        addEventPage.allDayEventButton.click();
        System.out.println("****");


    }

    @And("user select purple color and clicks save button")
    public void userSelectPurpleColorAndClicksSaveButton() {
        System.out.println("*");
        BrowserUtils.clickWithJS(addEventPage.purple);
        System.out.println("**");
        BrowserUtils.waitFor(5);

        assertTrue(BrowserUtils.isAttributePresent(addEventPage.purple, "data-selected"));
        System.out.println("***");

        addEventPage.saveButton.click();
    }

    @And("user navigate back clicking twice backward button")
    public void userNavigateBackClickingTwiceBackwardButton() {
        Driver.getDriver().navigate().back();
        BrowserUtils.waitFor(3);
        Driver.getDriver().navigate().back();
    }

    @And("user on the dashboard again")
    public void userOnTheDashboardAgain() {
        System.out.println("dashboardTitle " + dashboardPage.dashboardTitle.getText());
        assertEquals("Dashboards", dashboardPage.dashboardTitle.getText());
    }


    @Then("user sees the event is added with given color on calendar")
    public void userSeesTheEventIsAddedWithGivenColorOnCalendar(Map<String, String> credentials2) throws InterruptedException {

        Driver.getDriver().navigate().refresh();

        List<String> actualCalendarEventText = new ArrayList<>();  //to get what I add on calendar as String text

        List<WebElement> calendarEvents = addEventPage.calendarEventLocators; //list of webElement is my locators list
        for (WebElement calendarEvent : calendarEvents) {
            actualCalendarEventText.add(calendarEvent.getAttribute("textContent"));
        }
        System.out.println("calendarEventText = " + actualCalendarEventText);//to  see the event list


        List<String> hexbackgroundColorList = new ArrayList<>(); //to make a string list background hex code
        //Web element list coming from my calender holder locators

        for (WebElement eventCalendarHolder : addEventPage.eventCalendarHolders) {
            hexbackgroundColorList.add(Color.fromString(eventCalendarHolder.getCssValue("background-color")).asHex());
        }

        //only to see hexCode string list
        System.out.println("hexbackgroundColorList = " + hexbackgroundColorList);


        //double assertion with calendar event text and background colour match or not

        for (String actualCalendarText : actualCalendarEventText) {
            if (actualCalendarText.contains(credentials2.get("calendarEventName"))) {

                for (String hexColorCode : hexbackgroundColorList) {

                    if (hexColorCode.equalsIgnoreCase(credentials2.get("hexCode"))) {
                        System.out.println("hexColorCode = " + hexColorCode);
                        System.out.println("assertion completed");
                        break;
                    }
                }
            }
        }


    }

    @When("user clicks on All-day event check box")
    public void user_clicks_on_all_day_event_check_box() throws InterruptedException {

        Thread.sleep(10);
        Assert.assertEquals(true,addEventPage.allDayEventCheckBox.isEnabled());

        Thread.sleep(5);
        if ( !addEventPage.allDayEventCheckBox.isSelected() )
        {
            BrowserUtils.clickWithJS(addEventPage.allDayEventCheckBox);
        }
        System.out.println("selected");

    }


    @Then("All-day event check box is selected")
    public void all_day_event_check_box_is_selected()  {


        Assert.assertTrue("The box is selected",(addEventPage.allDayEventCheckBox).isSelected());
        System.out.println(addEventPage.allDayEventCheckBox.isSelected());
    }
    @When("user clicks on Repeat menu")
    public void user_clicks_on_repeat_menu() {

        if ( !addEventPage.repeatTextCheckBox.isSelected() )
        {
            BrowserUtils.clickWithJS(addEventPage.repeatTextCheckBox);
        }

    }

    @When("user clicks the dropdown icon")
    public void user_clicks_the_dropdown_icon() {

        Driver.getDriver().manage().timeouts().implicitlyWait(8, TimeUnit.SECONDS);
        Select select = new Select(addEventPage.repeatsDropdown);
        select.selectByIndex(0);


    }

    @When("dropdown menu includes {int} different options")
    public void dropdown_menu_includes_different_options(Integer int1) {
        Driver.getDriver().manage().timeouts().implicitlyWait(8, TimeUnit.SECONDS);
        Select select = new Select(addEventPage.repeatsDropdown);
        List<WebElement> options = new ArrayList<>(select.getOptions());

        //Assert.assertEquals("Daily",select.getFirstSelectedOption().getText());
        List<String> assertionList = new ArrayList<>();
        assertionList.addAll(Arrays.asList("Daily", "Weekly", "Monthly", "Yearly"));

        for (WebElement option : options) {
            System.out.println(option.getText());
            for (String s : assertionList) {
                if (option.equals(s)) {
                    Assert.assertEquals(option, s);
                }
            }

        }}

    @And("{string} option should be selected")
    public void optionShouldBeSelected(String Never)  {

        Driver.getDriver().manage().timeouts().implicitlyWait(8, TimeUnit.SECONDS);
        System.out.println("assertionRadioButtonForNeverbefore:" +addEventPage.neverRadioButton.isSelected());
        Assert.assertTrue(addEventPage.neverRadioButton.isSelected());

    }
    @When("{string} option should be clickable")
    public void option_should_be_clickable (String After) throws InterruptedException {

        Driver.getDriver().manage().timeouts().implicitlyWait(8, TimeUnit.SECONDS);
        System.out.println("afterRadioButtonBeforeSelect:"+addEventPage.afterRadioButton.isSelected());
        Thread.sleep(4000);
        Assert.assertEquals(false, addEventPage.afterRadioButton.isSelected());

        BrowserUtils.waitClickability(addEventPage.afterRadioButton, 9);
        BrowserUtils.clickWithJS(addEventPage.afterRadioButton);

        System.out.println("afterRadioButtonAfterSelect:"+addEventPage.afterRadioButton.isSelected());
        Assert.assertEquals(true,addEventPage.afterRadioButton.isSelected());

    }

    @And("{string} options should be clickable")
    public void optionsShouldBeClickable (String by){

        Assert.assertEquals(false, addEventPage.byRadioButton.isSelected());
        BrowserUtils.waitClickability(addEventPage.byRadioButton, 9);
        BrowserUtils.clickWithJS(addEventPage.byRadioButton);

        System.out.println("ByRadioAfterClicking:"+addEventPage.byRadioButton.isSelected());
        Assert.assertEquals(true,addEventPage.byRadioButton.isSelected());

    }
    @And("close Add Event Page")
    public void closeAddEventPage() {
        addEventPage.addEventCloseButton.click();
    }

    @When("user fills  title input")
    public void userFillsTitleInput(Map<String,String>credentials3) {
        addEventPage.titleInput.sendKeys(credentials3.get("title"));

    }
    @When("click on save button")
    public void click_on_save_button() {

        BrowserUtils.clickWithJS(addEventPage.saveButton);
    }
    @When("user navigated to general information page")
    public void user_navigated_to_general_information_page() {
        System.out.println("dashboardTitle " + dashboardPage.dashboardTitle.getText());
        Assert.assertEquals("Dashboards",dashboardPage.dashboardTitle.getText());
    }
    @When("user can see event information at the bottom on the page")
    public void user_can_see_event_information_at_the_bottom_on_the_page(Map<String,String>credentials3) {
        Assert.assertEquals(credentials3.get("event"),dashboardPage.eventTitle.getAttribute("innerText"));
        System.out.println(dashboardPage.eventTitle.getAttribute("innerText"));
    }

    @Then("user logout")
    public void userLogout() {
        addEventPage.logOutButton.click();
    }



}




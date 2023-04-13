package cydeo.pages;

import cydeo.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class AddEventPage {


    public AddEventPage() {
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = " //*[@class='ui-dialog-title']")
    public WebElement AddEventTitle;

    @FindBy(css ="span[data-color='#5484ED']")
    public WebElement darkBlue;

    @FindBy(css ="span[data-color='#A4BDFC']")
    public WebElement lightBlue;

    @FindBy(css ="span[data-color='#46D6DB']")
    public WebElement babyBlue;

    @FindBy(css ="span[data-color='#7AE7BF']")
    public WebElement lightGreen;

    @FindBy(css ="span[data-color='#51B749']")
    public WebElement darkGreen;

    @FindBy(css ="span[data-color='#FBD75B']")
    public WebElement yellow;

    @FindBy(css ="span[data-color='#FFB878']")
    public WebElement orange;

    @FindBy(css ="span[data-color='#FF887C']")
    public WebElement pink;

    @FindBy(css ="span[data-color='#DC2127']")
    public WebElement red;

    @FindBy(css ="span[data-color='#DBADFF']")
    public WebElement purple;

    @FindBy(css ="span[data-color='#E1E1E1']")
    public WebElement grey;

    @FindBy(css ="span[data-color='#FFFFFF']")
    public WebElement multiColour;

    @FindBy(xpath ="//label[text()='All-day event']")
    public WebElement allDayEventButton;

    @FindBy(xpath ="//input[starts-with(@id, 'oro_calendar_event_form_allDay-uid')]")
    public WebElement allDayEventCheckBox;


    @FindBy(xpath = "//input[starts-with(@id, 'recurrence-repeat')]")
    public WebElement repeatTextCheckBox;

    //id is dynamic in here
    @FindBy(xpath = "//select[@class='recurrence-repeats__select']")
    public WebElement repeatsDropdown;

    public  List<WebElement>colourLocators=new ArrayList<WebElement>(Arrays.asList(darkBlue,
            lightBlue,babyBlue,lightGreen,darkGreen,yellow,orange,pink,red,purple,grey,multiColour));


    @FindBy(xpath = "(//input[@type='radio'])[1]")
    public WebElement dayRadioButton;
    @FindBy(xpath = "(//input[@type='radio'])[2]")
    public WebElement weekdayRadioButton;

    @FindBy(xpath = "(//input[@type='radio'])[3]")
    public WebElement neverRadioButton;

    @FindBy(xpath = "(//input[@type='radio'])[4]")
    public WebElement afterRadioButton;

    @FindBy(xpath = "(//input[@type='radio'])[5]")
    public WebElement byRadioButton;

    //id is dynamic in this field
    @FindBy(name= "oro_calendar_event_form[title]")
    public WebElement titleInput;

    @FindBy(xpath = "(//label[@class='required'])[3]")
    public WebElement organiserNameInput;

    @FindBy(css = "*[type='email']")
    public WebElement emailInput;


    @FindBy(xpath = "//button[@class='btn btn-primary']")
    public WebElement saveButton;

    @FindBy(css = "span[class='fc-title']")
    public List<WebElement> calendarEventLocators;

    @FindBy(css = "a[class='fc-day-grid-event fc-h-event fc-event fc-start fc-end']")
    public List<WebElement> eventCalendarHolders;

    @FindBy(css = "button[title='close']")
    public WebElement addEventCloseButton;

    @FindBy(xpath = "//i[@class='fa-caret-down']")
    public WebElement logOutButton;

}

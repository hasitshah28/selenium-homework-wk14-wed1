package uk.co.library.pages;

import com.aventstack.extentreports.Status;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;
import uk.co.library.customlisteners.CustomListeners;
import uk.co.library.utility.Utility;

public class HomePage extends Utility {


    @CacheLookup
   // @FindBy(xpath = "//button[@id='save']//div[@class='action-wrapper']")
            @FindBy(xpath = "//span[text()='Accept All']")
    WebElement acceptCookies;
    @CacheLookup
    @FindBy(id = "keywords")
    WebElement jobTitleField;

    @CacheLookup
    @FindBy(id = "location")
    WebElement locationField;

    @CacheLookup
    @FindBy(id = "distance")
    WebElement distanceDropDown;

    @CacheLookup
    @FindBy(xpath = "//button[@id='toggle-hp-search']")
    WebElement moreSearchOptionsLink;

    @CacheLookup
    @FindBy(xpath = "//input[@id='salarymin']")
    WebElement salaryMinField;

    @CacheLookup
    @FindBy(xpath = "//input[@id='salarymax']")
    WebElement salaryMaxField;

    @CacheLookup
    @FindBy(xpath = "//select[@id='salarytype']")
    WebElement salaryTypeDropDown;

    @CacheLookup
    @FindBy(xpath = "//select[@id='tempperm']")
    WebElement jobTypeDropDown;

    @CacheLookup
    @FindBy(xpath = "//input[@id='hp-search-btn']")
    WebElement findJobsBtn;

    public void acceptCookies() {
        clickOnElement(acceptCookies);
        CustomListeners.test.log(Status.PASS, "Click On Accept");
        Reporter.log("Click On Accept" + acceptCookies.toString());

    }
    public void enterJobTitle(String jobTitle){
        sendTextToElement(jobTitleField,jobTitle);
        Reporter.log("Enter job title " + jobTitleField.toString());
        CustomListeners.test.log(Status.PASS, "Job title" + jobTitle);
    }
    public void enterLocation(String location){
        sendTextToElement(locationField,location);
        Reporter.log("Enter location " + locationField.toString());
        CustomListeners.test.log(Status.PASS, "Location " + location);

    }
    public void selectDistance(String distance){
        selectByVisibleTextFromDropDown(distanceDropDown,distance);
        Reporter.log("Select distance " + distanceDropDown.toString());
        CustomListeners.test.log(Status.PASS, "Select from Drop down menu" + distance);
    }
    public  void clickOnMoreSearchOptionLink(){
        clickOnElement(moreSearchOptionsLink);
        Reporter.log("Click on link" + moreSearchOptionsLink.toString());
        CustomListeners.test.log(Status.PASS, "More option " + moreSearchOptionsLink);
    }
    public void enterMinSalary(String minSalary){
        sendTextToElement(salaryMinField,minSalary);
        Reporter.log("Enter minimum salary" +salaryMinField.toString());
        CustomListeners.test.log(Status.PASS, " Minimum Salary select " + minSalary);

    }
    public void enterMaxSalary(String maxSalary){
        sendTextToElement(salaryMaxField,maxSalary);
        Reporter.log("Enter maximum salary" +salaryMaxField.toString());
        CustomListeners.test.log(Status.PASS, " Minimum Salary select " +maxSalary);

    }
    public void selectSalaryType(String sType){
        selectByVisibleTextFromDropDown(salaryTypeDropDown,sType);
        Reporter.log("Select salary type" +salaryTypeDropDown.toString());
        CustomListeners.test.log(Status.PASS, " Minimum Salary select " +sType);

    }
    public void selectJobType(String jobType){
        selectByVisibleTextFromDropDown(jobTypeDropDown,jobType);
        Reporter.log("Select job type" +jobTypeDropDown.toString());
        CustomListeners.test.log(Status.PASS, " Minimum Salary select " +jobType);
    }
    public void clickOnFindJobsButton(){
        clickOnElement(findJobsBtn);
        Reporter.log("Click on Find job btn" +findJobsBtn.toString());
        CustomListeners.test.log(Status.PASS, " Minimum Salary select " +findJobsBtn);
    }

}

package uk.co.library.pages;

import com.aventstack.extentreports.Status;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;
import org.testng.Reporter;
import uk.co.library.customlisteners.CustomListeners;
import uk.co.library.utility.Utility;

public class ResultPage extends Utility {

    @CacheLookup
    @FindBy(xpath = "//h1[@class='search-header__title']")
    WebElement resultText;


    public void verifyTheResults(String expected) {
        CustomListeners.test.log(Status.PASS, "Verify the result");
        Reporter.log("Verify the result" + resultText.toString());
        String actual = getTextFromElement(resultText);
        Assert.assertEquals(expected, actual);
    }
}

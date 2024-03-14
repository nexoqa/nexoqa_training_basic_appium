package steps;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.AppiumDriver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageobject.home.HomePageIOS;

import org.junit.Assert;
import org.openqa.selenium.WebElement;

import utils.WrapMobileDriver;

public class AndroidSteps {

    private HomePageIOS homePageIOS;

    private AppiumDriver driver;

    public AndroidSteps() {
        driver = WrapMobileDriver.getInstance("android");
    }

    @Given("the alert message is present")
    public void theAlertMessageIsPresent() throws Exception {
        WebElement message = driver.findElement(AppiumBy.xpath("//android.widget.LinearLayout[@resource-id='android:id/parentPanel']"));
        if (!message.isDisplayed()){
            throw new Exception("Message not found");
        }
    }

    @When("thse user clicks on ok button")
    public void clickOnButton() throws InterruptedException {
        WebElement okButton = driver.findElement(AppiumBy.xpath("//android.widget.Button[@resource-id='android:id/button1']"));
        okButton.click();

    }

    @Then("the alert message is closed")
    public void getResult() {
        boolean closed = false;
        try{
            driver.findElement(AppiumBy.xpath("//android.widget.LinearLayout[@resource-id='android:id/parentPanel']"));
        }
        catch(Exception ex){
            closed = true;
        }
        Assert.assertTrue(closed);
    }

}

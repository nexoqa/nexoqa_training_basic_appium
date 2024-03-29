package steps;

import io.appium.java_client.AppiumDriver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageobject.home.AlertIOS;
import pageobject.home.HomePageIOS;

import org.junit.Assert;
import utils.WrapMobileDriver;

public class iOSSteps {

    private HomePageIOS homePageIOS;
    private AlertIOS alertIOS;

    private AppiumDriver driver;

    public iOSSteps() {
        driver = WrapMobileDriver.getInstance("ios");
        homePageIOS = new HomePageIOS(driver);
    }

    @Given("the user adds the first number {int}")
    public void addNumberA(int number) throws InterruptedException {
        homePageIOS.getNumberA().clear();
        homePageIOS.getNumberA().sendKeys(String.valueOf(number));
    }

    @And("the user adds the second number {int}")
    public void addNumberB(int number) throws InterruptedException {
        homePageIOS.getNumberB().clear();
        homePageIOS.getNumberB().sendKeys(String.valueOf(number));
    }

    @When("the user clicks on the button")
    public void clickOnButton() throws InterruptedException {
        homePageIOS.getButton().click();
    }

    @Then("the app show the operation result {int}")
    public void getResult(int result) {
        Assert.assertEquals(Integer.valueOf(result), Integer.valueOf(homePageIOS.getResult().getText()));
        // Assert.assertTrue(result == Integer.valueOf(homePageIOS.getResult().getText()));
    }

    @Given("the alert message is Open")
    public void openAlertMessage(){
        homePageIOS.getAlertMessageLink().click();
        alertIOS = new AlertIOS(driver);
    }

    @When("the ok button is clicked")
    public void the_ok_button_is_clicked() {
        alertIOS.getOkButton().click();
    }

    @Then("the alert message is Closed")
    public void the_alert_message_is_closed() {
        boolean actual = false;
        try{
            actual = alertIOS.getWindow().isDisplayed();
        }
        catch(Exception ex){
            actual = false;
        }
        Assert.assertEquals(false, actual);
    }
    

}

package steps;

import io.appium.java_client.AppiumDriver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageobject.home.HomePageIOS;

import org.junit.Assert;
import utils.WrapMobileDriver;

public class iOSSteps {

    private HomePageIOS homePageIOS;

    private AppiumDriver driver;

    public iOSSteps() {
        driver = WrapMobileDriver.getInstance("ios");
        homePageIOS = new HomePageIOS(driver);
    }

    @Given("the user adds the first number {int}")
    public void addNumber1(int number) throws InterruptedException {
        homePageIOS.getNumber1().sendKeys(String.valueOf(number));
    }

    @And("the user adds the second number {int}")
    public void addNumber2(int number) throws InterruptedException {
        homePageIOS.getNumber2().sendKeys(String.valueOf(number));
    }

    @When("the user clicks on the button")
    public void clickOnButton() throws InterruptedException {
        homePageIOS.getButton().click();

    }

    @Then("the app show the operation result {int}")
    public void getResult(int result) {
        Assert.assertTrue(result == Integer.valueOf(homePageIOS.getResult().getText()));
    }

}

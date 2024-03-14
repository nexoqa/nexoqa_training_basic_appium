package pageobject.home;

import org.openqa.selenium.WebElement;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.AppiumDriver;


public class HomePageIOS {

    private WebElement numberA;
    private WebElement numberB;
    private WebElement button;
    private WebElement result;
    private WebElement alertMessageLink;


    public HomePageIOS(AppiumDriver driver){

        this.numberA = driver.findElement(AppiumBy.xpath("//XCUIElementTypeTextField[@name='IntegerA']"));
        this.numberB = driver.findElement(AppiumBy.xpath("//XCUIElementTypeTextField[@name='IntegerB']"));
        this.button = driver.findElement(AppiumBy.xpath("//XCUIElementTypeButton[@name='ComputeSumButton']"));
        this.result = driver.findElement(AppiumBy.xpath("//XCUIElementTypeStaticText[@name='Answer']"));
        this.alertMessageLink = driver.findElement(AppiumBy.xpath("//XCUIElementTypeButton[@name='show alert']"));
    }


    public WebElement getButton() {
        return this.button;
    }

    public WebElement getNumberA() {
        return this.numberA;
    }

    public WebElement getNumberB() {
        return this.numberB;
    }

    public WebElement getResult() {
        return this.result;
    }


    public WebElement getAlertMessageLink() {
        return this.alertMessageLink;
    }

}

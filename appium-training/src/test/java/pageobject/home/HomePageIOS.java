package pageobject.home;

import org.openqa.selenium.WebElement;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.AppiumDriver;


public class HomePageIOS {

    private WebElement number1;
    private WebElement number2;
    private WebElement button;
    private WebElement result;


    public HomePageIOS(AppiumDriver driver){

        this.number1 = driver.findElement(AppiumBy.xpath(""));
        this.number2 = driver.findElement(AppiumBy.xpath(""));
        this.button = driver.findElement(AppiumBy.xpath(""));
        this.result = driver.findElement(AppiumBy.xpath(""));
    }


    public WebElement getButton() {
        return this.button;
    }

    public WebElement getNumber1() {
        return this.number1;
    }

    public WebElement getNumber2() {
        return this.number2;
    }

    public WebElement getResult() {
        return this.result;
    }

}

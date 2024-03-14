package pageobject.home;

import org.openqa.selenium.WebElement;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.AppiumDriver;

public class AlertIOS {

    private WebElement window;
    private WebElement okButton;

    public AlertIOS(AppiumDriver driver){
        window = driver.findElement(AppiumBy.xpath("//XCUIElementTypeAlert[@name='Cool title']"));
        okButton = driver.findElement(AppiumBy.xpath("//XCUIElementTypeButton[@name='OK']"));
    }

    public WebElement getOkButton() {
        return okButton;
    }

    public WebElement getWindow() {
        return window;
    }
    
}

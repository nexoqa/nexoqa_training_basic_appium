package pageobject.home;

import org.openqa.selenium.WebElement;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.AppiumDriver;

public class HomePageAndroid {

    private WebElement displayTextButton;
    private WebElement textDisplayed;

    private AppiumDriver driver;

    public HomePageAndroid(AppiumDriver driver){
        this.driver = driver;
        this.displayTextButton = driver.findElement(AppiumBy.xpath("//android.widget.Button[@content-desc='visibleButtonTestCD']"));
        
    }

    public WebElement getDisplayTextButton() {
        return displayTextButton;
    }

    public void loadTextDisplayed() {
        this.textDisplayed = this.driver.findElement(AppiumBy.xpath("//android.widget.TextView[@resource-id='io.selendroid.testapp:id/visibleTextView']"));
    }

    public WebElement getTextDisplayed(){
        return this.textDisplayed;
    }

    
}

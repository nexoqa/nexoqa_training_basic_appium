package utils;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.remote.options.BaseOptions;

import java.net.URL;

public class WrapMobileDriver {

    private static WrapMobileDriver instance;
    private AppiumDriver driver;

    @SuppressWarnings("rawtypes")
    private WrapMobileDriver(String platform) {
        String appiumUrl = "http://127.0.0.1:4723";
        try {
            switch (platform) {
                case "ios":
                    BaseOptions options = new BaseOptions()
                            .amend("platformName", "iOS")
                            .amend("appium:platformVersion", "17.2")
                            .amend("appium:app",
                                    "/Users/jojedava/accenture-appium-test/nexoqa_training_basic_appium/appium-training/builds/ios/TestApp-iphonesimulator.app")
                            .amend("appium:deviceName", "iPhone 15 Pro Max")
                            .amend("appium:automationName", "xcuitest")
                            .amend("appium:noReset", false)
                            .amend("appium:fullReset", false)
                            .amend("appium:includeSafariInWebviews", true)
                            .amend("appium:newCommandTimeout", 3600)
                            .amend("appium:connectHardwareKeyboard", true);

                    driver = new IOSDriver(new URL(appiumUrl), options);
                    break;
                case "android":

                    break;
                default:
                    break;
            }

        } catch (Exception e) {
            e.printStackTrace();
            throw new RuntimeException("Exception occurred in creating singleton driver instance");
        }
    }

    public static AppiumDriver getInstance(String platform) {
        if (instance == null) {
            instance = new WrapMobileDriver(platform);
        }
        return instance.driver;
    }

}

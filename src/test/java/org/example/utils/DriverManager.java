package org.example.utils;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;

public class DriverManager {
    private static AndroidDriver<MobileElement> driver;

    public void initDriver() throws MalformedURLException {
        if (driver == null) {
            DesiredCapabilities caps = new DesiredCapabilities();
            caps.setCapability("platformName", "Android");
            caps.setCapability("deviceName", "emulator-5554");
            caps.setCapability("automationName", "UiAutomator2");
            caps.setCapability("app", "E:\\Studies\\Khaled\\AppiumCucumber\\src\\apps\\General-Store.apk");
            driver = new AndroidDriver<>(new URL("http://127.0.0.1:4723"), caps);
        }
    }

    public static AndroidDriver<MobileElement> getDriver() {
        return driver;
    }

    public void quitDriver() {
        if (driver != null) {
            driver.quit();
        }
    }
}
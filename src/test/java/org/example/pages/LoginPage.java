package org.example.pages;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginPage {
    AndroidDriver<MobileElement> driver;
    WebDriverWait wait;
    By country = By.id("com.androidsample.generalstore:id/spinnerCountry");
    By nameField = By.id("com.androidsample.generalstore:id/nameField");
    By maleGender = By.id("com.androidsample.generalstore:id/radioMale");
    By femaleGender = By.id("com.androidsample.generalstore:id/radioFemale");
    By buttonClick = By.id("com.androidsample.generalstore:id/btnLetsShop");

    public LoginPage(AndroidDriver<MobileElement> driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, 10);
    }

    public void selectCountry(String countryName) {
        wait.until(ExpectedConditions.visibilityOfElementLocated(country)).click();
        driver.findElementByAndroidUIAutomator(
                "new UiScrollable(new UiSelector().scrollable(true)).scrollIntoView(new UiSelector().text(\"" + countryName + "\"));"
        ).click();
    }

    public void enterName(String name) {
        wait.until(ExpectedConditions.visibilityOfElementLocated(nameField)).sendKeys(name);
    }

    public void selectGender(String gender) {
        if (gender.equalsIgnoreCase("Male")) {
            driver.findElement(maleGender).click();
        } else {
            driver.findElement(femaleGender).click();
        }
    }

    public void clickLetsShop() {
        driver.findElement(buttonClick).click();
    }
}
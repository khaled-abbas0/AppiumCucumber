package org.example.stepdefinitions;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.cucumber.java.en.*;
import org.example.pages.LoginPage;
import org.example.utils.DriverManager;

public class LoginSteps {
    AndroidDriver<MobileElement> driver = DriverManager.getDriver();
    private final LoginPage loginPage = new LoginPage(driver);

    @Given("I launch the app")
    public void iLaunchTheApp() {

    }

    @When("I select {string} as country")
    public void i_select_country(String country) {
        loginPage.selectCountry(country);
    }

    @And("I enter {string} as name")
    public void i_enter_name(String name) {
        loginPage.enterName(name);
    }

    @And("I select gender as {string}")
    public void i_select_gender(String gender) {
        loginPage.selectGender(gender);
    }

    @And("I click the Let's Shop button")
    public void i_click_lets_shop() {
        loginPage.clickLetsShop();
    }

    @Then("I should be taken to the product page")
    public void i_should_see_product_page() {
        // Add verification logic here
    }
}
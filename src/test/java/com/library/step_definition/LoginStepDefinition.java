package com.library.step_definition;

import com.library.page.LoginPage;
import com.library.utilities.ConfigurationReader;
import com.library.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class LoginStepDefinition {
    LoginPage loginPage = new LoginPage();
    @Given("librarian on the login page")
    public void librarian_on_the_login_page() {
        Driver.getDriver().get(ConfigurationReader.getProperty("url"));
    }
    @When("librarian enter valid username")
    public void librarian_enter_valid_username() {
        loginPage.username.sendKeys(ConfigurationReader.getProperty("username"));
    }
    @When("librarian enter valid password")
    public void librarian_enter_valid_password() {
        loginPage.password.sendKeys(ConfigurationReader.getProperty("pass"));
    }
    @When("librarian click login button")
    public void librarian_click_login_button() {
        loginPage.loginBtn.click();
    }

    @Then("librarian should see the {string} title")
    public void librarianShouldSeeTheTitle(String title) {
        title = ConfigurationReader.getProperty("homePageTitle");
        Assert.assertTrue(Driver.getDriver().getTitle().contains(title));
    }

    @When("librarian enter invalid username")
    public void librarian_enter_invalid_username() {
        loginPage.username.sendKeys("librarian123@library");
    }
    @When("librarian enter invalid password")
    public void librarian_enter_invalid_password() {
        loginPage.password.sendKeys("libraryUser1234");
    }
    @Then("librarian should see the error message")
    public void librarian_should_see_the_error_message() {
        String errorMsg = loginPage.errorMsg.getText();
        Assert.assertTrue(errorMsg.contains(ConfigurationReader.getProperty("errorMsg")));
    }
}

package Steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.com.LMS.base.Base;
import org.example.com.LMS.pages.HomePage;
import org.example.com.LMS.pages.LoginPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


import java.io.IOException;
import java.util.concurrent.TimeUnit;

public class LoginSteps extends Base {

    LoginPage loginPage;
    HomePage homePage;

    @Given("user open website and login to the system")
    public void user_Open_Website(){
        lanuchBrowser();
    }

    @When("User fill email as {string} and {string} and click login")
    public void userFillEmailAsAndAndClickLogin(String userName, String Password) throws InterruptedException {
        loginPage = new LoginPage();
        loginPage.performInvalidLogin(userName,Password);

    }

    @Then("Error message should appear")
    public void errorMessageShouldAppear() {
        loginPage.ErrorMessageIsDisplayed();
    }

    @When("user fill the data")
    public void userFillTheData() {
        loginPage = new LoginPage();
        homePage= loginPage.PerformValidLogin();
    }

    @Then("Validate you are in the dashboard")
    public void validateYouAreInTheDashboard() {
        homePage.isLogDisplayed();
        loginPage.ValidatingCorrectLoginandLogout();
    }
}

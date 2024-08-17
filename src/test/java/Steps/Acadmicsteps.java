package Steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.example.com.LMS.base.Base;
import org.example.com.LMS.pages.AcademicYearPage;
import org.example.com.LMS.pages.LoginPage;
import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


import java.util.concurrent.TimeUnit;


public class Acadmicsteps extends Base {

    WebDriver driver;
    WebElement date;
    LoginPage loginPage;
    AcademicYearPage academicYearPage;


    @Given("Open website and login")
    public void navigateToAcademicYearTab() {
        lanuchBrowser();
        loginPage = new LoginPage();
        loginPage.PerformValidLogin();
    }

    @When("Click on setting and AcademicYear")
    public void settingClick(){
        academicYearPage = new AcademicYearPage();
        academicYearPage.goToSettings();
    }


    @Then("Fill the data")
    public void fillTheData(){
        academicYearPage = new AcademicYearPage();
        academicYearPage.fillTheData();
    }


    @When("user Delete one record using the three dots")
    public void userClickTheThreeDotsOnOneOfTheRecords() {
        academicYearPage = new AcademicYearPage();
        academicYearPage.deleteOnRecord();
    }

    @Then("Click on the delete button")
    public void clickOnTheDeleteButton() {
        academicYearPage = new AcademicYearPage();
        academicYearPage.checkIfTheNameIsExist();
    }


    @Then("user click on update")
    public void userClickOnUpdate() {
        academicYearPage = new AcademicYearPage();
        academicYearPage.clickOnUpdate();
    }

    @Then("update the data and click save")
    public void updateTheDataAndClickSave() {
        academicYearPage = new AcademicYearPage();
        academicYearPage.updateTheData();
    }


}

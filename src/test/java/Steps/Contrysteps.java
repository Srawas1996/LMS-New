package Steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.com.LMS.base.Base;
import org.example.com.LMS.pages.CountryPage;
import org.example.com.LMS.pages.LoginPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


import java.util.concurrent.TimeUnit;

import static org.example.com.LMS.base.Base.lanuchBrowser;

public class Contrysteps extends Base {

    CountryPage countryPage;
    LoginPage loginPage;

    @Given("User-navigate-to-country-tab")
    public void User_Navigate_to_Country_Tab() {
        lanuchBrowser();
        loginPage = new LoginPage();
        loginPage.PerformValidLogin();
    }


    @When("User-Click-on-the-country")
    public void User_Click_on_the_country() {
        countryPage = new CountryPage();
        countryPage.goToSettings();
    }

    @Then("User-save-the-new-changes")
    public void User_Save_the_new_changes() {
        driver.manage().timeouts().implicitlyWait(7000, TimeUnit.SECONDS);
        driver.manage().timeouts().implicitlyWait(5000, TimeUnit.SECONDS);
        driver.findElement(By.cssSelector(".flex.flex-col.gap-2 > div:nth-of-type(1) > button[role='checkbox']")).click();
        driver.manage().timeouts().implicitlyWait(5000, TimeUnit.SECONDS);
        driver.findElement(By.xpath("/html[1]/body[1]/div[3]/div[2]/form[1]/div[2]/div[1]/div[1]/div[1]/button[1]")).click();
    }

    @Then("User-remove-items-from-the-list")
    public void userRemoveItemsFromTheList() {
        for (int i = 0; i < 5 ; i++){
            driver.findElement(By.xpath("/html[1]/body[1]/div[3]/div[2]/form[1]/div[1]/div[1]/div[1]/div[1]/button[1]")).click();
        }
        driver.findElement(By.xpath("/html[1]/body[1]/div[3]/div[3]/div[1]/button[1]")).click();
    }

    @Then("Add three items to the list")
    public void addThreeItemsToTheList() {
        for (int i = 0; i < 3; i++){
            driver.findElement(By.xpath("//body/div[@id='radix-:rk:']/div[2]/form[1]/div[2]/div[1]/div[1]/div[1]/button[1]")).click();
        }
        driver.findElement(By.xpath("/html[1]/body[1]/div[3]/div[3]/div[1]/button[1]")).click();
    }



}

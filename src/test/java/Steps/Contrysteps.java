package Steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.com.LMS.base.Base;
import org.example.com.LMS.pages.CountryPage;
import org.example.com.LMS.pages.LoginPage;


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
        countryPage = new CountryPage();
        countryPage.AddOnOfTheCountry();
    }

    @Then("User-remove-items-from-the-list")
    public void userRemoveItemsFromTheList() {
        countryPage = new CountryPage();
        countryPage.removeCountry();
    }

    @Then("Add three items to the list")
    public void addThreeItemsToTheList() {
        countryPage = new CountryPage();
        countryPage.AddmultiCountry();
    }



}

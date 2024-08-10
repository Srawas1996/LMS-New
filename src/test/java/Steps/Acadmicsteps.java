package Steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


import java.util.concurrent.TimeUnit;


public class Acadmicsteps {

    WebDriver driver;
    WebDriverWait wait;
    WebElement date;


    @Given("user navigate to the acadmic year tab")
    public void navigateToAcadmicYearTab() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://dev-lms-frontend.joacademy.tech/");
        driver.findElement(By.xpath("//body/div[@id='__next']/div[1]/div[1]/aside[1]/div[1]/div[1]/div[1]/nav[1]/button[9]")).click();
        driver.manage().timeouts().implicitlyWait(3000, TimeUnit.SECONDS);
        driver.findElement(By.xpath("//span[contains(text(),'Academic Years')]")).click();
        driver.manage().timeouts().implicitlyWait(3000, TimeUnit.SECONDS);
    }

    @When("open the calander")
    public void openTheCalander() {
        driver.findElement(By.xpath("//body/div[@id='__next']/div[1]/main[1]/div[1]/div[1]/button[1]")).click();
        driver.manage().timeouts().implicitlyWait(3000, TimeUnit.SECONDS);
        driver.
                findElement(By
                        .xpath("/html[1]/body[1]/div[3]/div[2]/form[1]/div[1]/div[1]/input[1]")).sendKeys("Salim"
                + (int) (Math.random()*100000));

        date = driver.findElement(By.xpath("/html[1]/body[1]/div[3]/div[2]/form[1]/div[1]/div[2]/button[1]"));

        date.click();
    }


    @Then("Select start date")
    public void SelectStartDate() {
        WebElement moveToNextMonth = driver.findElement(By.name("next-month"));
        for (int i = 0; i < 2 ; i++) {
            moveToNextMonth.click();
        }
        WebElement selectDate = driver
                .findElement(
                        By.xpath("/html[1]/body[1]/div[3]/div[2]/form[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/table[1]/tbody[1]/tr[2]/td[1]/button[1]"));

        selectDate.click();

    }

    @Then("select the end date")
    public void selectEndDate() {
        driver.findElement(By.xpath("/html[1]/body[1]/div[3]/div[2]/form[1]/div[1]/div[3]/button[1]")).click();

        WebElement moveToNextMonth
                = driver.findElement(By.xpath("/html[1]/body[1]/div[3]/div[2]/form[1]/div[1]/div[3]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/button[2]"));

        for (int i = 0; i < 11 ; i++) {
            moveToNextMonth.click();
        }

        WebElement selectDate = driver
                .findElement(
                        By.xpath("/html[1]/body[1]/div[3]/div[2]/form[1]/div[1]/div[3]/div[1]/div[1]/div[1]/div[1]/div[1]/table[1]/tbody[1]/tr[1]/td[2]/button[1]"));

        selectDate.click();
    }

    @Then("save the academic year")
    public void saveTheAcademicYear() {
        WebElement formSave = driver
                .findElement(By.xpath("//button[contains(text(),'Create')]"));

        formSave.click();
    }


    @Then("saveing Duplicate academic year")
    public void saveingDuplicateAcademicYear() {
        driver.
                findElement(By
                        .xpath("/html[1]/body[1]/div[3]/div[2]/form[1]/div[1]/div[1]/input[1]"))
                .sendKeys("salim");

        WebElement moveToNextMonth = driver.findElement(By.name("next-month"));
        for (int i = 0; i < 2 ; i++) {
            moveToNextMonth.click();
        }
        WebElement selectDate = driver
                .findElement(
                        By.xpath("/html[1]/body[1]/div[3]/div[2]/form[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/table[1]/tbody[1]/tr[2]/td[1]/button[1]"));

        selectDate.click();

        driver.findElement(By.xpath("/html[1]/body[1]/div[3]/div[2]/form[1]/div[1]/div[3]/button[1]")).click();

        moveToNextMonth
                = driver.findElement(By.xpath("/html[1]/body[1]/div[3]/div[2]/form[1]/div[1]/div[3]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/button[2]"));

        for (int i = 0; i < 11 ; i++) {
            moveToNextMonth.click();
        }

        selectDate = driver
                .findElement(
                        By.xpath("/html[1]/body[1]/div[3]/div[2]/form[1]/div[1]/div[3]/div[1]/div[1]/div[1]/div[1]/div[1]/table[1]/tbody[1]/tr[1]/td[2]/button[1]"));

        selectDate.click();
        WebElement formSave = driver
                .findElement(By.xpath("//button[contains(text(),'Create')]"));

        formSave.click();

    }


    @When("user click the check box for on of the records")
    public void userClickTheCheckBoxForOnOfTheRecords() {
    }

    @Then("Click on the delete button")
    public void clickOnTheDeleteButton() {
    }

    @When("user click on the three dots")
    public void userClickOnTheThreeDots() {
    }

    @Then("user click on update")
    public void userClickOnUpdate() {
    }

    @Then("update the data and click save")
    public void updateTheDataAndClickSave() {
    }

    @Then("user click on Semesters")
    public void userClickOnSemesters() {
    }

    @Then("Click on the next tab")
    public void clickOnTheNextTab() {
    }

    @Then("Click on the last tab")
    public void clickOnTheLastTab() {
    }

    @Then("Click on the first page")
    public void clickOnTheFirstPage() {
    }


}

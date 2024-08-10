package Steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class SemesterSteps {
    WebDriver driver;

    @Given("Open website")
    public void open_the_websit(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://dev-lms-frontend.joacademy.tech/");
        driver.manage().timeouts().implicitlyWait(10000, TimeUnit.SECONDS);
    }

    @When("userFillTheData")
    public void userfillthedata() {
        driver.findElement(By.name("email")).sendKeys("owner@app.com");
        driver.findElement(By.name("password")).sendKeys("12345678");
        driver.findElement(By.xpath("//button[contains(text(),'Sign in')]")).click();
        driver.manage().timeouts().implicitlyWait(3000, TimeUnit.SECONDS);
        driver.findElement(By.xpath("//body/div[@id='__next']/div[1]/div[1]/aside[1]/div[1]/div[1]/div[1]/nav[1]/button[9]")).click();
        driver.manage().timeouts().implicitlyWait(3000, TimeUnit.SECONDS);
        driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/aside[1]/div[1]/div[1]/div[2]/div[1]/div[1]/nav[1]/div[1]/a[2]/span[1]")).click();
        driver.manage().timeouts().implicitlyWait(3000, TimeUnit.SECONDS);
    }

    @When("Click on Academic year and select one of the academic years")
    public void clickOnAcademicYearAndSelectOneOfTheAcademicYears() {
        driver.findElement(By.xpath("//tbody/tr[1]/td[6]/button[1]/*[1]")).click();
        driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/div[1]")).click();
    }

    @Then("Add First semester")
    public void addFirstSemester() {
        driver.manage().timeouts().implicitlyWait(5000, TimeUnit.SECONDS);
        driver.findElement(By.xpath("//main[@id='main']/div/div/button")).click();
        driver.manage().timeouts().implicitlyWait(3000, TimeUnit.SECONDS);
        driver.findElement(By.xpath("//input[@id=':rg7:-form-item']")).sendKeys("SemesterOne");
        driver.findElement(By.xpath("//input[@id=':rg8:-form-item']")).sendKeys("SemesterTwo");
        String startDate
                = driver.findElement(By.cssSelector("#react-day-picker-1")).getText();
        for (int i = 0; i < 12; i++){
            if (startDate.contains("September")) {
                driver.findElement(By.xpath("xpath=(//button[@name='day'])[16]")).click();
            }
            else {
               driver.findElement(By.name("next-month")).click();
            }
        }

    }


    @Then("Add second semester")
    public void addSecondSemester() {
    }


}

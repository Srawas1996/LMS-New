package org.example.com.LMS.pages;

import org.example.com.LMS.base.Base;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.concurrent.TimeUnit;

public class LoginPage extends Base {

    CountryPage countryPage;
    public LoginPage(){
        PageFactory.initElements(driver,this);
    }

    @FindBy(name = "email")
    WebElement email;

    @FindBy(name = "password")
    WebElement password;

    @FindBy(xpath = "//button[contains(text(),'Sign in')]")
    WebElement SingInButton;

    @FindBy(xpath = "//body/div[@id='__next']/div[1]/section[1]/ol[1]/li[1]")
    WebElement errorMessageDisplayed;

    @FindBy(xpath = "/html[1]/body[1]/div[1]/div[1]/header[1]/div[2]/button[2]/span[1]/span[1]")
    WebElement ClickOnProflie;

    @FindBy(xpath = "//div[contains(text(),'Log Out')]")
    WebElement ClickOnLogOut;


    public void performInvalidLogin(String userName, String password) throws InterruptedException {
        Thread.sleep(3000);
        this.email.sendKeys(userName);
        this.password.sendKeys(password);
        this.SingInButton.click();
    }

    public HomePage PerformValidLogin(){
        this.email.sendKeys(properties.get("username").toString());
        this.password.sendKeys(properties.get("password").toString());
        this.SingInButton.click();
        return new HomePage();

    }

    public void ErrorMessageIsDisplayed(){
        this.errorMessageDisplayed.isDisplayed();
    }

    public void ValidatingCorrectLoginandLogout(){
        this.ClickOnProflie.isEnabled();
        this.ClickOnProflie.click();
        this.ClickOnLogOut.click();

    }
}

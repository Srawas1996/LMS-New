package org.example.com.LMS.pages;

import org.example.com.LMS.base.Base;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.concurrent.TimeUnit;

public class CountryPage extends Base {

    public CountryPage(){
        PageFactory.initElements(driver,this);
    }

    @FindBy(css = ".lucide-settings")
    WebElement ClickOnSetting;

    @FindBy(xpath = "//a[@href ='/settings/countries']")
    WebElement ClickOnCountry;

    @FindBy(css = ".lucide-plus")
    WebElement ClickOnThePlusSign;


    public void goToSettings(){
        driver.manage().timeouts().implicitlyWait(5000, TimeUnit.SECONDS);
        ClickOnSetting.click();
        driver.manage().timeouts().implicitlyWait(5000, TimeUnit.SECONDS);
        ClickOnCountry.click();
        ClickOnThePlusSign.click();
    }










}

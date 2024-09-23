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

    @FindBy(xpath = "/html[1]/body[1]/div[3]/div[2]/form[1]/div[2]/div[1]/div[1]/div[1]")
    WebElement AddOnOfTheCountry;

    @FindBy(css = ".text-primary-foreground")
    WebElement SaveTheCountries;

    @FindBy(xpath = "/html[1]/body[1]/div[3]/div[2]/form[1]/div[1]/div[1]/div[1]/div[1]/button[1]")
    WebElement RemoveCountry;

    @FindBy(xpath = "//*[@placeholder='Search countries']")
    WebElement SearchBar;


    public void goToSettings(){
        driver.manage().timeouts().implicitlyWait(5000, TimeUnit.SECONDS);
        ClickOnSetting.click();
        driver.manage().timeouts().implicitlyWait(5000, TimeUnit.SECONDS);
        ClickOnCountry.click();
        ClickOnThePlusSign.click();
        driver.manage().timeouts().implicitlyWait(5000, TimeUnit.SECONDS);
    }

    public void AddOnOfTheCountry(){
        driver.manage().timeouts().implicitlyWait(5000, TimeUnit.SECONDS);
        AddOnOfTheCountry.click();
        SaveTheCountries.click();
    }

    public void removeCountry(){
        for (int i = 0; i < 5 ; i++)
            RemoveCountry.click();

        driver.manage().timeouts().implicitlyWait(5000, TimeUnit.SECONDS);
        SaveTheCountries.click();
    }

    public void AddmultiCountry(){
        for (int i = 0; i < 3; i++)
            AddOnOfTheCountry.click();

        driver.manage().timeouts().implicitlyWait(5000, TimeUnit.SECONDS);
        SaveTheCountries.click();
    }

    public void SearchByCountry(){
        SearchBar.sendKeys("France");
    }












}

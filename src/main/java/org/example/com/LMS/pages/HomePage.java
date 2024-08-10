package org.example.com.LMS.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage {

    @FindBy(xpath = "//*[@alt='logo']")
    WebElement CheckTheHomePage;


    public void isLogDisplayed(){
        CheckTheHomePage.isDisplayed();
    }


}

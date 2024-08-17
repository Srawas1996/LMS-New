package org.example.com.LMS.pages;

import org.example.com.LMS.base.Base;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.concurrent.TimeUnit;

public class AcademicYearPage extends Base {

    @FindBy(css = ".lucide-settings")
    WebElement clickOnSettings;

    @FindBy(xpath = "//span[contains(text(),'Academic Years')]")
    WebElement clickOnAcademicYear;

    @FindBy(css = ".lucide-plus")
    WebElement clickOnPlusSign;

    @FindBy(name = "name.en")
    WebElement setEnglishName;

    @FindBy(name = "name.ar")
    WebElement setArabicName;

    @FindBy(xpath = "//div[3]/button")
    WebElement startDate;

    @FindBy(xpath = "//div[4]/button")
    WebElement endDate;

    @FindBy(xpath = "//div[3]/div/div/div/div/div/div/div")
    WebElement getStartDateMonth;

    @FindBy(xpath = "//div[4]/div/div/div/div/div/div/div")
    WebElement getEndDateMonth;

    @FindBy(css = ".end-1 > .lucide")
    WebElement goToNextMonthStart;

    @FindBy(xpath = "/html[1]/body[1]/div[3]/div[2]/form[1]/div[1]/div[4]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/button[2]")
    WebElement goToNextMonthEnd;


    @FindBy(xpath = "(//button[@name='day'])[8]")
    WebElement pickStartDateDay;

    @FindBy(css = ".flex:nth-child(2) > .h-9:nth-child(5) > .rdp-button_reset")
    WebElement pickEndDateDy;

    @FindBy(xpath = "//div[3]/div/button")
    WebElement clickOnCreate;

    @FindBy(xpath = "//tbody/tr[1]/td[6]/button[1]/*[1]")
    WebElement clickOnTheThreeDots;

    @FindBy(xpath = "//body/div[2]/div[1]/div[4]")
    WebElement clickOnDeleteButton;

    @FindBy(xpath = "//button[contains(text(),'Yes Delete')]")
    WebElement confirmationTheDeletion;

    @FindBy(xpath = "//td[contains(text(),'2025/2026-en')]")
    WebElement nameCheck;

    @FindBy(css = ".cursor-default:nth-child(2)")
    WebElement updateButton;

    @FindBy(css = ".gap-2 > .bg-primary")
    WebElement clickOnUpdate;

    public AcademicYearPage(){
        PageFactory.initElements(driver,this);
    }

    public void goToSettings(){
        driver.manage().timeouts().implicitlyWait(5000, TimeUnit.SECONDS);
        clickOnSettings.click();
        driver.manage().timeouts().implicitlyWait(5000, TimeUnit.SECONDS);
        clickOnAcademicYear.click();
        driver.manage().timeouts().implicitlyWait(5000, TimeUnit.SECONDS);
    }

    public void pickTheStartDate(){
        startDate.click();
        String stratDateMonth = getStartDateMonth.getText();
        for (int i = 0 ; i < 12 ; i++){
            if (stratDateMonth.contains("September")){
                //Select the date
                pickStartDateDay.click();
            }
            else {
                //go to the next month
                goToNextMonthStart.click();
                stratDateMonth = getStartDateMonth.getText();

            }
        }


    }

    public void pickTheEndDate(){
        endDate.click();
        String EndDateMonth = getEndDateMonth.getText();
        for (int i = 0 ; i < 12 ; i++){
            if (EndDateMonth.contains("June")){
                //Select the date
                driver.manage().timeouts().implicitlyWait(10000, TimeUnit.SECONDS);
                pickEndDateDy.click();
                break;
            }
            else {
                //go to the next month
                goToNextMonthEnd.click();
                EndDateMonth = getEndDateMonth.getText();
            }

        }
    }

    public void fillTheData(){
        clickOnPlusSign.click();
        setEnglishName.sendKeys("2025/2026-en");
        setArabicName.sendKeys("2025/2026-ar");
        pickTheStartDate();
        pickTheEndDate();
        clickOnCreate.click();
    }

    public void deleteOnRecord(){
        clickOnTheThreeDots.click();
        clickOnDeleteButton.click();
        confirmationTheDeletion.click();

    }

    public void checkIfTheNameIsExist(){
        nameCheck.isDisplayed();
    }

    public void clickOnUpdate(){
        clickOnTheThreeDots.click();
        updateButton.click();
    }

    public void updateTheData(){
        setEnglishName.sendKeys("2025/2026-en_new");
        clickOnUpdate.click();

    }

}

package org.example.com.LMS.pages;

import org.example.com.LMS.base.Base;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;
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

    @FindBy(xpath = "/html[1]/body[1]/div[3]/div[2]/form[1]/div[1]/div[4]/button[1]")
    WebElement endDate;

    @FindBy(xpath = "/html[1]/body[1]/div[3]/div[2]/form[1]/div[1]/div[3]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/button[1]/span[1]")
    WebElement getStartDateMonth;

    @FindBy(xpath = "/html[1]/body[1]/div[3]/div[2]/form[1]/div[1]/div[3]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/button[2]/span[1]")
    WebElement getStartDateYear;

    @FindBy(xpath = "/html[1]/body[1]/div[3]/div[2]/form[1]/div[1]/div[4]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/button[1]/span[1]")
    WebElement getEndDateMonth;

    @FindBy(xpath = "/html[1]/body[1]/div[3]/div[2]/form[1]/div[1]/div[4]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/button[2]/span[1]")
    WebElement getEndDateYear;

    @FindBy(xpath = "/html[1]/body[1]/div[3]/div[2]/form[1]/div[1]/div[3]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/button[1]")
    WebElement goToNextMonthStart;

    @FindBy(xpath = "/html[1]/body[1]/div[3]/div[2]/form[1]/div[1]/div[4]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/button[1]")
    WebElement goToNextMonthEnd;


    @FindBy(xpath = "(//button[@name='day'])[8]")
    WebElement pickStartDateDay;

    @FindBy(css = ".flex:nth-child(1) > .h-9:nth-child(4) > .rdp-button_reset")
    WebElement pickEndDateDay;

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

    @FindBy(css = ".py-2 > .peer")
    WebElement TopCheckBok;

    @FindBy(xpath = "//div[contains(text(),'10')]")
    WebElement NumberOfCheckItem;

    @FindBy(css = "tbody")
    WebElement list;

    @FindBy(xpath = "//body/div[@id='__next']/div[1]/main[1]/div[2]/div[1]/div[1]/button[1]")
    WebElement DeleteOptionIsDisplayed;

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

        String startDateYear = getStartDateYear.getText();

        while (!startDateYear.contains("2021")){
            goToNextMonthStart.click();
            startDateYear = getStartDateYear.getText();
        }

        String startDateMonth = getStartDateMonth.getText();
        while (!startDateMonth.contains("September")){
            goToNextMonthStart.click();
            startDateMonth = getStartDateMonth.getText();
        }

        pickStartDateDay.click();
    }



    public void pickTheEndDate(){
        endDate.click();

        String EndDateYear = getEndDateYear.getText();

        for (int i = 0 ; i < 60 ; i++){
            if (EndDateYear.contains("2022")){
                //Select the date
                break;
            }
            else {
                //go to the next month
                goToNextMonthEnd.click();
                EndDateYear = getEndDateYear.getText();
            }
        }

        String EndDateMonth = getEndDateMonth.getText();
        for (int i = 0; i < 12; i++) {
            if (EndDateMonth.contains("June")) {
                pickEndDateDay.click();
                break; // Exit the loop once the current month is reached
            } else {
                goToNextMonthEnd.click();
                EndDateMonth = getEndDateMonth.getText();

            }
        }
    }

    public void fillTheData(){
        clickOnPlusSign.click();
        setEnglishName.sendKeys("2021/2022-en");
        setArabicName.sendKeys("2021/2022-ar");
        pickTheStartDate();
        pickTheEndDate();
        //clickOnCreate.click();
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

    public void ClickOnTopCheckBox(){
        if (!TopCheckBok.isSelected()) {
            TopCheckBok.click();
        }

        assert NumberOfCheckItem.getText().equals(getNumberOfItemsInList()) : "Passed";
        assert DeleteOptionIsDisplayed.isDisplayed() : "Passed";
    }

    public String getNumberOfItemsInList(){
        List<WebElement> webElements = list.findElements(By.tagName("tr"));

        return webElements.size()+"";

    }

}
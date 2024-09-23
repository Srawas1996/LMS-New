package org.example.com.LMS.pages;

import org.example.com.LMS.base.Base;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class SemesterPage extends Base {

    private WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    @FindBy(css = ".lucide-settings")
    WebElement clickOnSettings;

    @FindBy(xpath = "//span[contains(text(),'Academic Years')]")
    WebElement clickOnAcademicYear;

    @FindBy(xpath = "//tbody/tr[1]/td[6]/button[1]/*[1]")
    WebElement clickOnThreeDots;

    @FindBy(xpath = "/html[1]/body[1]/div[2]/div[1]/div[1]")
    WebElement clickOnSemesters;

    @FindBy(xpath = "//main[@id='main']/div/div/button")
    WebElement clickOnThePlusSign;

    @FindBy(xpath = "/html[1]/body[1]/div[3]/div[2]/form[1]/div[1]/div[1]/div[1]/input[1]")
    WebElement englishSemesterName;

    @FindBy(xpath = "/html[1]/body[1]/div[3]/div[2]/form[1]/div[1]/div[2]/div[1]/input[1]")
    WebElement arabicSemesterName;

    @FindBy(xpath = "/html[1]/body[1]/div[1]/div[1]/main[1]/button[1]/div[1]/div[1]/div[1]/table[1]/tbody[1]/tr[1]/td[3]")
    WebElement getAcademicYearStart;

    @FindBy(xpath = "/html[1]/body[1]/div[1]/div[1]/main[1]/button[1]/div[1]/div[1]/div[1]/table[1]/tbody[1]/tr[1]/td[4]")
    WebElement getAcademicYearEnd;

    //Start Date Selection

    @FindBy(xpath = "/html[1]/body[1]/div[3]/div[2]/form[1]/div[1]/div[4]/button[1]")
    WebElement clickOnTheStartDate;

    @FindBy(xpath = "/html[1]/body[1]/div[3]/div[2]/form[1]/div[1]/div[4]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/button[1]/span[1]")
    WebElement getStartMonthName;

    @FindBy(xpath = "/html[1]/body[1]/div[3]/div[2]/form[1]/div[1]/div[4]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/button[2]/span[1]")
    WebElement getStartYearName;

    @FindBy(name = "previous-month")
    WebElement clickOnPreviousMonth;

    @FindBy(xpath = "(//button[@name='day'])[7]")
    WebElement pickStartDateDay;


    //*******************************

    //End Date
    @FindBy(css = ".space-y-1:nth-child(5) > .inline-flex > span")
    WebElement ClickOnEndDate;

    @FindBy(xpath = "/html[1]/body[1]/div[3]/div[2]/form[1]/div[1]/div[5]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/button[1]/span[1]")
    WebElement getEndMonthName;

    @FindBy(xpath = "/html[1]/body[1]/div[3]/div[2]/form[1]/div[1]/div[5]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/button[2]/span[1]")
    WebElement getEndYearName;

    @FindBy(xpath = "/html[1]/body[1]/div[3]/div[2]/form[1]/div[1]/div[5]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/button[1]")
    WebElement endDatePreviousMonth;

    @FindBy(xpath = "(//button[@name='day'])[4]")
    WebElement pickEndDateDay;

    //*************************************************************

    //Actual Start Date

    @FindBy(xpath = "/html[1]/body[1]/div[3]/div[2]/form[1]/div[1]/div[6]/button[1]")
    WebElement clickOnActualStartDate;

    @FindBy(xpath = "/html[1]/body[1]/div[3]/div[2]/form[1]/div[1]/div[6]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/button[1]/span[1]")
    WebElement actualStartDateMonth;

    @FindBy(xpath = "/html[1]/body[1]/div[3]/div[2]/form[1]/div[1]/div[6]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/button[2]/span[1]")
    WebElement actualStartDateYear;

    @FindBy(xpath = "/html[1]/body[1]/div[3]/div[2]/form[1]/div[1]/div[6]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/button[1]")
    WebElement actualStartDatePreviousMonth;

    @FindBy(xpath = "(//button[@name='day'])[15]")
    WebElement pickStartActualDateDay;

    //******************************************************


    //Actual End Date
    @FindBy(xpath = "/html[1]/body[1]/div[3]/div[2]/form[1]/div[1]/div[7]/button[1]")
    WebElement clickOnActualEndDate;

    @FindBy(xpath = "/html[1]/body[1]/div[3]/div[2]/form[1]/div[1]/div[7]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/button[1]/span[1]")
    WebElement actualEndDateMonth;

    @FindBy(xpath = "/html[1]/body[1]/div[3]/div[2]/form[1]/div[1]/div[7]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/button[2]/span[1]")
    WebElement actualEndDateYear;

    @FindBy(xpath = "/html[1]/body[1]/div[3]/div[2]/form[1]/div[1]/div[7]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/button[1]")
    WebElement actualEndDatePreviousMonth;

    @FindBy(xpath = "(//button[@name='day'])[1]")
    WebElement pickEndActualDateDay;

    //*****************************************************

    @FindBy(xpath = "//button[contains(text(),'Create')]")
    WebElement clickOnCreateButton;

    @FindBy(xpath = "//h1[contains(text(),'Semesters')]")
    WebElement TextExist;



    public SemesterPage() {
        PageFactory.initElements(driver,this);
    }

    public void OpenAcademicYearPage(){
        clickOnSettings.click();
        clickOnAcademicYear.click();
    }

    public void OpenSemesterTabPage(){
        clickOnThreeDots.click();
        clickOnSemesters.click();
    }

    public String getAcademicYearStart(){
        return getAcademicYearStart.getText().substring(0, 4);
    }
    public String getAcademicYearEnd(){
        return getAcademicYearEnd.getText().substring(0, 4);
    }



    public void openSemesterTab(String StartYear, String StartMonth,
                                String endYear, String endMonth,
                                String semesterNameEN, String semesterNameAR,
                                String actualStartDateYearName, String actualStartDateMonthName,
                                String actualEndDateYearName, String actualEndDateMonthName){

        if (checkTheTextIfExistOrNot()) {
            clickOnThePlusSign.click();
            englishSemesterName.sendKeys(semesterNameEN);
            arabicSemesterName.sendKeys(semesterNameAR);
            pickTheStartDate(StartYear,StartMonth);
            pickTheEndDate(endYear,endMonth);
            pickTheActualStartDate(actualStartDateYearName,actualStartDateMonthName);
            pickTheActualEndDate(actualEndDateYearName,actualEndDateMonthName);
            clickOnCreateButton.click();

        }

    }

    private boolean checkTheTextIfExistOrNot(){
        return TextExist.isDisplayed();
    }

    //Start Date Picker
    private void pickTheStartDate(String startYear, String startMonth) {
        setImplicitWait(10); // Set implicit wait for 10 seconds
        openStartDatePicker(); // Open the date picker

        navigateToMonthAndSelectDay(startYear,startMonth); // Navigate to September and select the day
    }

    private void setImplicitWait(int seconds) {
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(seconds));
    }

    private void openStartDatePicker() {
        clickOnTheStartDate.click();
    }


    private void selectDay() {
        pickStartDateDay.click();
    }

    private void navigateToMonthAndSelectDay(String startYear, String startMonth) {
        // First, navigate to the current year
        String startDateYear = getStartYearName.getText();
        // Loop until we reach the current year or exhaust 60 iterations
        for (int i = 0; i < 60; i++) {
            if (startDateYear.contains(startYear)) {
                System.out.println(startDateYear);
                break;
            } else {
                goToNextMonth();
                startDateYear = getStartYearName.getText();
            }
        }

        // Then, navigate to the current month
        String startDateMonth = getStartMonthName.getText();
        // Loop until we reach the current month or exhaust 12 iterations
        for (int i = 0; i < 12; i++) {
            if (startDateMonth.contains(startMonth)) {
                selectDay();
                break; // Exit the loop once the current month is reached
            } else {
                goToNextMonth();
                startDateMonth = getStartMonthName.getText();

            }
        }
    }

    private void goToNextMonth() {
        clickOnPreviousMonth.click();
    }

    //***************************************

    // End Date Select
    public void pickTheEndDate(String endYear, String endMonth) {
        setImplicitWait(10); // Set implicit wait for 10 seconds
        openEndDatePicker(); // Open the date picker

        navigateToMonthAndSelectEndDay(endYear, endMonth); // Navigate to September and select the day
    }

    private void openEndDatePicker() {
        ClickOnEndDate.click();
    }

    private void navigateToMonthAndSelectEndDay(String endYear, String endMonth) {
        // First, navigate to the current year
        String startDateYear = getEndYearName.getText();
        // Loop until we reach the current year or exhaust 60 iterations
        for (int i = 0; i < 60; i++) {
            if (startDateYear.contains(endYear)) {
                System.out.println(startDateYear);
                break;
            } else {
                goToNextEndMonth();
                startDateYear = getEndYearName.getText();
            }
        }

        // Then, navigate to the current month
        String startDateMonth = getEndMonthName.getText();
        // Loop until we reach the current month or exhaust 12 iterations
        for (int i = 0; i < 12; i++) {
            if (startDateMonth.contains(endMonth)) {
                selectEndDay();
                break; // Exit the loop once the current month is reached
            } else {
                goToNextEndMonth();
                startDateMonth = getEndMonthName.getText();

            }
        }

    }

    private void selectEndDay() {
        pickEndDateDay.click();
    }


    private void goToNextEndMonth() {
        endDatePreviousMonth.click();
    }

    private void pickTheActualStartDate(String actualStartDateYearName, String actualStartDateMonthName){
        setImplicitWait(10);
        openActualStartDate();

        navigateToMonthAndSelectActualStartDate(actualStartDateYearName, actualStartDateMonthName);
    }

    private void openActualStartDate(){
        clickOnActualStartDate.click();
    }

    private void navigateToMonthAndSelectActualStartDate(String actualStartDateYearName, String actualStartDateMonthName){
        String actualStartDateYear2 = actualStartDateYear.getText();

        for (int i = 0 ; i < 60 ; i++){
            if (actualStartDateYear2.contains(actualStartDateYearName)) {
                break;
            }
            else{
                goToPreviousMonthActualStartDate();
                actualStartDateYear2 = actualStartDateYear.getText();
            }
        }

        String actualStartDateMonth2 = actualStartDateMonth.getText();
        for (int i = 0; i < 12;i++){
            if (actualStartDateMonth2.contains(actualStartDateMonthName)){
                actualStartDatePickTheDay();
                break;
            }
            else {
                goToPreviousMonthActualStartDate();
                actualStartDateMonth2 = actualStartDateMonth.getText();
            }
        }
    }

    private void goToPreviousMonthActualStartDate(){
        actualStartDatePreviousMonth.click();
    }

    private void actualStartDatePickTheDay(){
        pickStartActualDateDay.click();
    }

    private void pickTheActualEndDate(String actualEndDateYearName, String actualEndDateMonthName){
        setImplicitWait(10);
        openActualEndDate();

        navigateToMonthAndSelectActualEndDate( actualEndDateYearName,  actualEndDateMonthName);
    }

    private void openActualEndDate(){
        clickOnActualEndDate.click();
    }

    private void navigateToMonthAndSelectActualEndDate(String actualEndDateYearName, String actualEndDateMonthName){
        String actualEndDateYear2 = actualEndDateYear.getText();

        for (int i = 0 ; i < 60 ; i++){
            if (actualEndDateYear2.contains(actualEndDateYearName)) {
                break;
            }
            else{
                goToPreviousMonthActualEndDate();
                actualEndDateYear2 = actualEndDateYear.getText();
            }
        }

        String actualEndDateMonth2 = actualEndDateMonth.getText();
        for (int i = 0; i < 12;i++){
            if (actualEndDateMonth2.contains(actualEndDateMonthName)){
                actualEndDatePickTheDay();
                break;
            }
            else {
                goToPreviousMonthActualEndDate();
                actualEndDateMonth2 = actualEndDateMonth.getText();
            }
        }
    }

    private void goToPreviousMonthActualEndDate(){
        actualEndDatePreviousMonth.click();
    }

    private void actualEndDatePickTheDay(){
        pickEndActualDateDay.click();
    }





}

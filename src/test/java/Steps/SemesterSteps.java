package Steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.com.LMS.base.Base;
import org.example.com.LMS.pages.LoginPage;
import org.example.com.LMS.pages.SemesterPage;
import org.example.com.LMS.pages.globalVariables;
import org.openqa.selenium.By;

import java.util.Properties;
import java.util.concurrent.TimeUnit;

public class SemesterSteps extends Base {
    LoginPage loginPage;
    SemesterPage semester;
    String academicYear;
    String academicYearEnd;
    globalVariables variables;
    public static Properties properties = new Properties();

    @Given("Open website and Login")
    public void openTheWebsite(){
        lanuchBrowser();
        loginPage = new LoginPage();
        loginPage.PerformValidLogin();
    }


    @When("Click on Academic year and select one of the academic years")
    public void clickOnAcademicYearAndSelectOneOfTheAcademicYears() {
        driver.manage().timeouts().implicitlyWait(3000, TimeUnit.SECONDS);
        semester = new SemesterPage();
        semester.OpenAcademicYearPage();

        academicYear = semester.getAcademicYearStart();
        academicYearEnd = semester.getAcademicYearEnd();

        semester.OpenSemesterTabPage();

    }


    @Then("Create Second Semester")
    public void addSecondSemester() {
        semester = new SemesterPage();
        String semesterTwoStartMonth = globalVariables.semesterTwoStartMonth;
        String semesterTwoEndMonth = globalVariables.semesterTwoEndMonth;
        String semesterTwoActualStartMonth = globalVariables.semesterTwoActualStartMonth;
        String semesterTwoActualEndMonth = globalVariables.semesterTwoActualEndMonth;



        semester.openSemesterTab(academicYear,semesterTwoStartMonth,academicYearEnd,semesterTwoEndMonth,
                "SemesterTwo","الفصل الدراسي الثاني",academicYear,semesterTwoActualStartMonth,
                academicYearEnd,semesterTwoActualEndMonth);
    }


    @Then("Create First Semester")
    public void addFirstSemester() {
        semester = new SemesterPage();
        String semesterOneStartMonth = globalVariables.semesterOneStartMonth;
        String semesterOneEndMonth = globalVariables.semesterOneEndMonth;
        String semesterOneActualStartMonth = globalVariables.semesterOneActualStartMonth;
        String semesterOneActualEndMonth = globalVariables.semesterOneActualEndMonth;

        semester.openSemesterTab("2021",semesterOneStartMonth,"2021",semesterOneEndMonth,
                "SemesterOne","الفصل الدراسي الاول","2021",
                semesterOneActualStartMonth,"2021",semesterOneActualEndMonth);
    }
}

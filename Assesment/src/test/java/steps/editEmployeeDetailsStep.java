package steps;

import Pages.addEmployee;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import Pages.editEmployeeDetails;

public class editEmployeeDetailsStep extends BrowserSteps{
    WebDriver driver;
    editEmployeeDetails editemp;

    @Before
    public void setup() {

        driver = init();
        editemp = PageFactory.initElements(driver, editEmployeeDetails.class);

    }

    @When("User opens the main website page")
    public void User_opens_the_main_website_page (){
        editemp.Open();
    }

    @Then("^User selects a employee and enters firstname \\\"([^\\\"]*)\\\" and surname \\\"([^\\\"]*)\\\" and employeeNumber \\\"([^\\\"]*)\\\" and salary \\\"([^\\\"]*)\\\" and saves.$")
    public void userEntersEmployeeDetailsAndClicksSave(String firstname, String surname, String salary, String employeeNumber) throws Throwable {

        editemp.editAnEmployeesDetails(firstname, surname, salary, employeeNumber);

    }

    @After
    public void TearDown() {
        CloseBrowser();
    }

}

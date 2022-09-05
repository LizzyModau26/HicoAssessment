package steps;

        import cucumber.api.java.en.Then;
        import cucumber.api.java.en.When;
        import org.openqa.selenium.WebDriver;
        import org.openqa.selenium.support.PageFactory;
        import cucumber.api.java.After;
        import cucumber.api.java.Before;
        import Pages.addEmployee;

public class addEmployeeStep extends BrowserSteps {
    WebDriver driver;
    addEmployee addemp;

    @Before
    public void setup() {

        driver = init();
        addemp = PageFactory.initElements(driver, addEmployee.class);

    }

    @When("User is on the the main website page")
    public void User_is_on_the_the_main_website_page (){
           addemp.Open();
    }

    @Then("^User enters firstname \\\"([^\\\"]*)\\\" and surname \\\"([^\\\"]*)\\\" and employeeNumber \\\"([^\\\"]*)\\\" and salary \\\"([^\\\"]*)\\\" login$")
    public void userEntersFirstnameAndSurnameLogin(String firstname, String surname, String salary, String employeeNumber) throws Throwable {

        addemp.addAEmployee(firstname, surname, salary, employeeNumber);

    }

    @After
    public void TearDown() {
        CloseBrowser();
    }



}
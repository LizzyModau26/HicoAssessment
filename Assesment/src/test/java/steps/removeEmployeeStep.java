package steps;
import Pages.removeEmployee;
import cucumber.api.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Then;


public class removeEmployeeStep extends BrowserSteps {

    WebDriver driver;
    removeEmployee removeemp;

    @Before
    public void setup() {

        driver = init();
        removeemp = PageFactory.initElements(driver, removeEmployee.class);

    }

    @When("User is on the main website page")
    public void User_is_on_the_main_website_page (){
        removeemp.Open();
    }

    @Then("^User clicks an employee  and selects remove then user should be removed$")
    public void userClicksAnEmployeeAndSelectsRemoveThenUserShouldBeRemoved() throws InterruptedException {
        removeemp.removeAEmployee();
    }

    @After
    public void TearDown() {
        CloseBrowser();
    }


}

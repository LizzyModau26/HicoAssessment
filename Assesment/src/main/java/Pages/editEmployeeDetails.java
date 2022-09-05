package Pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.Select;

public class editEmployeeDetails {
    WebDriver driver;

    public editEmployeeDetails(WebDriver driver) {
        this.driver = driver;
    }

    @FindBy(how = How.XPATH, using = "//table/tbody/tr[2]/td[1]")WebElement FirstRowInput;
    @FindBy(how = How.XPATH, using = "//input[@id='firstNames']")WebElement FirstNameInput;
    @FindBy(how = How.XPATH, using = "//input[@id='surname']")WebElement SurnameInput;
    @FindBy(how = How.XPATH, using = "//input[@id='employeeNumber']")WebElement EmployeeNumberInput;
    @FindBy(how = How.XPATH, using = "//input[@id='salary']")WebElement SalaryInput;
    @FindBy(how = How.CSS, using = "[type='Radio'][value='Female']") WebElement GenderInput;
    @FindBy(how = How.CSS, using = "[type='Radio'][value='Default']") WebElement ProfileInput;

    @FindBy(how = How.XPATH, using = "//button[text()= \"Save\"]")WebElement SaveButton;

    public void Open() {
        driver.navigate().to("https://sensedev.highcoordination.de:8080/hicotest/index.html");
    }

    public void editAnEmployeesDetails(String firstname, String surname, String salary, String employeeNumber ) throws InterruptedException {
        FirstRowInput.click();
        Thread.sleep(5000);
        FirstNameInput.clear();
        FirstNameInput.sendKeys(firstname);
        SurnameInput.clear();
        SurnameInput.sendKeys(surname);
        Select select = new Select(driver.findElement(By.id("title")));
        select.selectByVisibleText("Mrs.");
        GenderInput.isSelected();
        EmployeeNumberInput.clear();
        EmployeeNumberInput.sendKeys(employeeNumber);
        SalaryInput.clear();
        SalaryInput.sendKeys(salary);
        ProfileInput.isSelected();
        Thread.sleep(5000);
        SaveButton.click();
        Thread.sleep(5000);
    }
}

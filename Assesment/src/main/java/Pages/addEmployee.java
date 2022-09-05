package Pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.Select;

public class addEmployee {
    WebDriver driver;

    public addEmployee(WebDriver driver) {
        this.driver = driver;
    }


    @FindBy(how = How.XPATH, using = "//input[@id='firstNames']")WebElement FirstNameInput;
    @FindBy(how = How.XPATH, using = "//input[@id='surname']")WebElement SurnameInput;
    @FindBy(how = How.XPATH, using = "//input[@id='employeeNumber']")WebElement EmployeeNumberInput;
    @FindBy(how = How.XPATH, using = "//input[@id='salary']")WebElement SalaryInput;
    @FindBy(how = How.CSS, using = "[type='Radio'][value='Female']") WebElement GenderInput;
    @FindBy(how = How.CSS, using = "[type='Radio'][value='Default']") WebElement ProfileInput;


    public void Open() {
        driver.navigate().to("https://sensedev.highcoordination.de:8080/hicotest/index.html");
    }

    public void addAEmployee(String firstname, String surname, String salary, String employeeNumber ) throws InterruptedException {
        FirstNameInput.sendKeys(firstname);
        SurnameInput.sendKeys(surname);
        Select select = new Select(driver.findElement(By.id("title")));
        select.selectByVisibleText("Mr.");
        GenderInput.isSelected();
        EmployeeNumberInput.sendKeys(employeeNumber);
        SalaryInput.sendKeys(salary);
        ProfileInput.isSelected();
        Thread.sleep(10000);
        driver.findElement(By.className("Default-btn")).click();
        Thread.sleep(10000);

    }



}

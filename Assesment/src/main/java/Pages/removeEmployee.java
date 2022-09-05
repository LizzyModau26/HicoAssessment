package Pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class removeEmployee {
    WebDriver driver;

    public removeEmployee(WebDriver driver) {
        this.driver = driver;
    }

    @FindBy(how = How.XPATH, using = "//table/tbody/tr[2]/td[1]")WebElement FirstRowInput;
    @FindBy(how = How.XPATH, using = "//button[text()= \"Remove Employee\"]")WebElement RemoveButton;

    public void Open() {
        driver.navigate().to("https://sensedev.highcoordination.de:8080/hicotest/index.html");
    }

    public void removeAEmployee() throws InterruptedException {
        FirstRowInput.click();
        Thread.sleep(5000);
        RemoveButton.click();
        Thread.sleep(5000);
    }
}

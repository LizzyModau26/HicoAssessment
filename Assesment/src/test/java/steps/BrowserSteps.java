package steps;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserSteps {

    static WebDriver driver;

    public WebDriver init() {

        if (driver == null) {
            System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
            driver = new ChromeDriver();
            driver.manage().window().maximize();
            driver.manage().deleteAllCookies();
            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        }
        return driver;

    }

    public void CloseBrowser() {

        //driver.close();
        driver.quit();

    }

}
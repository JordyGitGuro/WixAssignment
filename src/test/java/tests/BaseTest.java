package tests;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class BaseTest {

    static {
        WebDriverManager.chromedriver()
                .browserVersion("88")
                .setup();
    }

    static WebDriver driver;
    static WebDriverWait wait;

    @BeforeTest
    public void Initialize() {
        final String PATH = "https://google.com/";

        ChromeOptions options = new ChromeOptions();
        options.addArguments("--start-maximized");

        driver = new ChromeDriver(options);
        wait = new WebDriverWait(driver, 10);

        driver.navigate().to(PATH);
    }

    @AfterTest
    public void terminate() {
        driver.quit();
    }
}

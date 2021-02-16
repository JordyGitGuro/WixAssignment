package tests;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class BaseTest {
    static {
        WebDriverManager.chromedriver()
                .setup();
    }

    static WebDriver driver;
    static WebDriverWait wait;

    @BeforeTest
    public void initialize() {
        final String PATH = "https://google.com/";

        driver = new ChromeDriver();
        wait = new WebDriverWait(driver, 10);

        driver.navigate().to(PATH);
        driver.manage().window().maximize();
    }

    @AfterTest
    public void terminate() {
        driver.quit();
    }
}

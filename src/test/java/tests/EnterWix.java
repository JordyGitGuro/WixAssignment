package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.annotations.Test;
import static tests.BaseTest.driver;
import static tests.BaseTest.wait;

public class EnterWix {
    @Test
    public void enterWixSite() {
        final String WIX = "Wix";

        driver.findElement(By.name("q")).sendKeys(WIX);
        driver.findElement(By.cssSelector(".FPdoLc [name = 'btnK']")).click();

        wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("a[href='https://www.wix.com/']")))
                .click();

        wait.withMessage("Page didn't load properly").until
                (ExpectedConditions.visibilityOfElementLocated(By.cssSelector("[title='logo_title']")));
    }
}

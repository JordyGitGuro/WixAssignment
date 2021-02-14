package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.annotations.Test;

public class EnterWix {

    @Test
    public void enterWixSite() {
        final String WIX = "Wix";

        BaseTest.driver.findElement(By.name("q")).sendKeys(WIX);
        BaseTest.driver.findElement(By.cssSelector(".FPdoLc [name = 'btnK']")).click();
        BaseTest.wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("[href='https://www.wix.com/']"))).click();
        BaseTest.wait.withMessage("Page loaded properly").until(ExpectedConditions.elementToBeClickable(By.cssSelector("[title='logo_title']")));
    }
}

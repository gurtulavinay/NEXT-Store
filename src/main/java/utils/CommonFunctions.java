package utils;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class CommonFunctions {

    public static WebDriver driver;
    //public static WebDriver installation so we can use in any package in this project

    public void openBrowser()
    {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
    }
    public void closeBrowser()
    {
        driver.quit();
    }
    public void waitForTime(int waittime)
    {
        driver.manage().timeouts().implicitlyWait(waittime, TimeUnit.SECONDS);
    }
    public void waitForElement(WebElement element, int maxTime)
    {
        WebDriverWait wait = new WebDriverWait(driver, maxTime);
        wait.until(ExpectedConditions.visibilityOf(element));
    }
    public void mouseOver(WebElement element)
    {
        Actions actions = new Actions(driver);
        actions.moveToElement(element).build().perform();
    }
    //somemore functions enteringKey scrolling downToPage
}

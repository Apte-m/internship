package utils;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import paige.MethodPaige;
import steps.Steps;

public class Settings {
    private static WebDriver driver;
    protected Steps steps;

    public static WebDriver getDriver() {
        return driver;
    }

    @BeforeMethod
    public void runPaige() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        steps = new Steps();

    }

    @AfterMethod
    public void stopPaige() {
        driver.quit();
    }
}

package searchGoogleAndReturnInfoSearchAndTime.settings;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import searchGoogleAndReturnInfoSearchAndTime.steps.StepSearch;

public abstract class Settings {
    private static WebDriver webDriver;
    protected StepSearch search;


    public static WebDriver getWebDriver() {
        return webDriver;
    }

    @BeforeMethod
    public void runPaige() {
        WebDriverManager.chromedriver().setup();
        webDriver = new ChromeDriver();
        webDriver.manage().window().maximize();
        webDriver.get("https://www.google.com/");
        search = new StepSearch();


    }

    @AfterMethod
    public void stopPaige() {
        webDriver.quit();
    }
}

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.Select;

import java.time.Duration;
import java.util.NoSuchElementException;

import static java.util.concurrent.TimeUnit.SECONDS;

public class Timeouts {
    static {
        System.setProperty("webdriver.chrome.driver", "C:\\projects\\java\\antara_java_at_2021_08\\chromedriver.exe");
    }

    static WebDriver driver = new ChromeDriver();
    static WebElement params;

    public static void main(String[] args) {
        try {
            Thread.sleep(3_000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        //driver.manage().window().maximize();

        //javaWait();
        //implicitlyWait();

        //explicitly wait
        //webDriverWait();
        //fluentWait();

        untilContains();


        try {
            Thread.sleep(10_000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        driver.close();


    }

    private static void javaWait() {
        driver.get("https://www.kinopoisk.ru/s/");

        //Механизм ожидания предоставляемый Java
        try {
            Thread.sleep(7_000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        params = driver.findElement(By.cssSelector("#find_film"));

        params.click();

    }

    private static void implicitlyWait() {
        driver.get("https://www.kinopoisk.ru/s/");

        //implicitly wait
        driver.manage().timeouts().implicitlyWait(10, SECONDS);

        params = driver.findElement(By.cssSelector("#find_film"));
        params.click();

        //сбросим время неявного ожидания
        driver.manage().timeouts().implicitlyWait(0, SECONDS);

    }

    private static void webDriverWait() {
        driver.get("https://www.kinopoisk.ru/s/");

        //webdriver wait
        WebDriverWait wait = new WebDriverWait(driver, 5);
        params = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#find_film")));

        params.click();
    }

    private static void fluentWait() {
        driver.get("https://www.kinopoisk.ru/s/");

        //fluent wait
        Wait<WebDriver> fluentWait = new FluentWait<WebDriver>(driver)
                .withTimeout(Duration.ofSeconds(30))
                .pollingEvery(Duration.ofSeconds(1))
                .ignoring(NoSuchElementException.class);
        params = fluentWait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#find_film")));

        params.click();
    }

    private static void untilContains(){
        driver.get("https://www.kinopoisk.ru/s/");

        // scroll
        WebElement someElement = driver.findElement(By.xpath("//input[@id='find_studio']"));
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", someElement);


        //webdriver wait
        // wait.until(d -> this.locationRegionList.findElement(By.xpath("./li")).getText().contains(location));
        // this.locationRegionList.findElement(By.xpath("./li")).click();

        WebDriverWait wait = new WebDriverWait(driver, 15);
        if( wait.until(ExpectedConditions.textToBePresentInElement(someElement, "123")) ) {
            params.clear();
        }
    }
}

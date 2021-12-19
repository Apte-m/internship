import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import static java.util.concurrent.TimeUnit.SECONDS;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class FindSomeFilm {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\projects\\java\\antara_java_at_2021_08\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        try {
            Thread.sleep(5_000);
        } catch (InterruptedException e){
            e.printStackTrace();
        }


        // TODO code here
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, SECONDS);

        driver.get("https://www.kinopoisk.ru/s/");

        Select select = new Select(driver.findElement(By.cssSelector("#country")));
//        select.getOptions().forEach( webElement -> {
//            System.out.println(webElement.getText());
//        });

        select.selectByVisibleText("США");

        Select multy = new Select(driver.findElement(By.xpath("//select[contains(@id, 'genre')]")));
        multy.selectByVisibleText("комедия");
        multy.selectByVisibleText("фэнтези");

        WebElement button = driver.findElement(By.xpath("//form[@name='film_search']/input[@value='поиск']"));
        button.click();

        try {
            Thread.sleep(15_000);
        } catch (InterruptedException e){
            e.printStackTrace();
        }

        driver.close();
    }
}
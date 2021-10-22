package paige;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;


import static utils.Settings.getDriver;

public class BasePaige   {
     protected WebDriver driver;
    protected WebDriverWait wait;
    protected Actions actions;
    JavascriptExecutor executor;

    public BasePaige() {

        this.driver = getDriver();
        PageFactory.initElements(driver,this);
        wait = new WebDriverWait(driver,4);
        actions = new Actions(driver);
        executor = (JavascriptExecutor) driver;
    }
}

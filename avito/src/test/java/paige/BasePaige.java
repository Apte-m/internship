package paige;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import static settings.Settings.getWebDriver;

public class BasePaige {
    WebDriver webDriver;


    public BasePaige() {
        this.webDriver = getWebDriver();
        PageFactory.initElements(webDriver,this);
    }
}

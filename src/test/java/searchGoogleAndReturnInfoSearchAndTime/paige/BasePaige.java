package searchGoogleAndReturnInfoSearchAndTime.paige;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import static searchGoogleAndReturnInfoSearchAndTime.settings.Settings.getWebDriver;

public abstract class BasePaige {
    WebDriver webDriver;

    public BasePaige() {
        this.webDriver = getWebDriver();
        PageFactory.initElements(webDriver,this);
    }
}

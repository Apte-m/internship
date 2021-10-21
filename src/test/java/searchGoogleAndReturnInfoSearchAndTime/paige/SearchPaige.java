package searchGoogleAndReturnInfoSearchAndTime.paige;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SearchPaige extends BasePaige {
    @FindBy(name = "q")
    private WebElement element;

    public SearchPaige() {
        super();
    }

    public void findSearchElement(String text) {

        element.click();
        element.sendKeys(text);
        element.sendKeys(Keys.RETURN);
    }

    public void pressEnter() {

        element.sendKeys(Keys.RETURN);
    }
}



package paige;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class MethodPaige extends BasePaige {
    @FindBy(name = "q")
    private WebElement search;

    public MethodPaige() {
        super();
    }

    public MethodPaige goTo() {
        driver.navigate().to("https://www.google.com/");
        return this;
    }

    public MethodPaige clickSearch() {
        actions.moveToElement(search)
                .click()
                .build()
                .perform();
        return this;
    }

    public MethodPaige inputText(String text) {
        executor.executeScript("arguments[0].value = '" + text + "'", search);
        return this;
    }

    public MethodPaige pressEnter() {
        actions.moveToElement(search)
                .sendKeys(Keys.ENTER)
                .build()
                .perform();
        return this;
    }

    public void assertThatInputText() {
       assertThat(search.getAttribute("value"))
               .as("argument incorrect")
               .isEqualToIgnoringCase("selenium");

    }
}

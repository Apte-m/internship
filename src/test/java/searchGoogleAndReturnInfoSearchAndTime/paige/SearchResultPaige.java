package searchGoogleAndReturnInfoSearchAndTime.paige;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class SearchResultPaige extends BasePaige {

    public SearchResultPaige() {
        super();
    }

    public void assertStringSearch(String expected) {

        String result = webDriver.findElement(By.name("q")).getAttribute("value");
        assertThat(result).as("Значение не совпадает ").isEqualToIgnoringCase(expected);

    }

    public void assertWebElements() {
        List<WebElement> webElements = webDriver.findElements(By.xpath("//h3[@class='LC20lb DKV0Md']"));


        assertThat(webElements.stream().map((s) -> s.getText())
                .filter(s -> !s.isEmpty()))
                .allMatch(s -> s.contains("selenium")
                        || s.contains("WebDriver")
                        || s.contains("Selenium")
                        || s.contains("webdriver"));

    }
}


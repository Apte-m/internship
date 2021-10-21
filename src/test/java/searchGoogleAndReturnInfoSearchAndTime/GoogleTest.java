package searchGoogleAndReturnInfoSearchAndTime;

import org.testng.annotations.Test;
import searchGoogleAndReturnInfoSearchAndTime.settings.Settings;


public class GoogleTest extends Settings {


    @Test
    public void googleTest() {
        search.stepSearch("webDriver")
                .verificationOneElementsSearchedData()
                .verificationOneElementStringSearch("webdriver");


    }
}

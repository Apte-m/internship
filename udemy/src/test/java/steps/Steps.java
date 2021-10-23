package steps;

import paige.MethodPaige;

public class Steps {
    MethodPaige paige = new MethodPaige();

    public void verificationInputTheWord () {
        paige.goTo()
                .clickSearch()
                .inputText("selenium")
                .pressEnter()
                .assertThatInputText("selenium");
    }
}

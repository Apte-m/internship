package AtSchool.WebClient;

import org.junit.Test;

public class Example {
    @Test
    public void test1() {
        WebClient webClient = new MySuperPuperWebClient();
        WebClientManager clientManager = new WebClientManager();
        clientManager.workWithClient(webClient);
    }

}

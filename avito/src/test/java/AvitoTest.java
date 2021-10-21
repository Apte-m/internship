import org.testng.annotations.Test;
import settings.Settings;

public class AvitoTest extends Settings {

   
    @Test
    public void startEndpoint (){
        paige.goTo()
                .searchCategory()
                .searchOnTheWord("Принтер")
                .clickTheSearch()
                .setSearchCity("Владивосток")
                .clickTheButton()
                .scroll()
                .clickPriceTheGeneral()
                .clickNeedPrice()
                .info(3);




    }
}

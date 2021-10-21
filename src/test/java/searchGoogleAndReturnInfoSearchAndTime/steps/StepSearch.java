package searchGoogleAndReturnInfoSearchAndTime.steps;

import searchGoogleAndReturnInfoSearchAndTime.paige.SearchPaige;
import searchGoogleAndReturnInfoSearchAndTime.paige.SearchResultPaige;

public class StepSearch {
    private SearchPaige searchPaige = new SearchPaige();


    public StepResult stepSearch(String text) {
        searchPaige.findSearchElement(text);
        searchPaige.pressEnter();
        return new StepResult();


    }


}

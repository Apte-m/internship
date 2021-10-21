package searchGoogleAndReturnInfoSearchAndTime.steps;

import searchGoogleAndReturnInfoSearchAndTime.paige.SearchResultPaige;

public class StepResult {
    private SearchResultPaige searchResultPaige = new SearchResultPaige();

    public StepResult verificationOneElementStringSearch (String expected){
        searchResultPaige.assertStringSearch(expected);
        return this;

    }
    public StepResult verificationOneElementsSearchedData (){
        searchResultPaige.assertWebElements();
        return this;

    }
}

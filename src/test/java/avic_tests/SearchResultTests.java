package avic_tests;

import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;


public class SearchResultTests extends BaseTests{

    private static final String SEARCH_KEYWORD = "Canon";
    private static final String NEGATIVE_SEARCH_KEYWORD = "I";
    private static final String EXPECTED_QUERY = "query=Canon";
    private static final int EXPECTED_AMOUNT_OF_PROPUCTS=12;

    @Test
    public void checkUrlForSearchKey(){
        getHomepage().searchByKeyWord(SEARCH_KEYWORD);
        getSearchResultsPage().waitForTitleToBe(15,"Результати пошуку");
        Assert.assertTrue(getDriver().getCurrentUrl().contains(EXPECTED_QUERY));
    }

    @Test
    public void checkQuantityOfResults(){
        getHomepage().searchByKeyWord(SEARCH_KEYWORD);
        getHomepage().implicitWait(30);
        Assert.assertEquals(getSearchResultsPage().getSearchResultsQuantity(),EXPECTED_AMOUNT_OF_PROPUCTS);
    }

    @Test
    public void searchingNegativeCaseValidation(){
        getHomepage().searchByKeyWord(NEGATIVE_SEARCH_KEYWORD);
        getSearchResultsPage().waitForElementDisplayed(15,getWrongSearchPopUp().getPopupNegativeSearch());
        //Layout validation
        Assert.assertTrue(getWrongSearchPopUp().getPopUpText().isDisplayed());
        Assert.assertTrue(getWrongSearchPopUp().getPopUpTitle().isDisplayed());
        Assert.assertEquals(getWrongSearchPopUp().getPopUpTitle().getText(),"Помилка");
        Assert.assertEquals(getWrongSearchPopUp().getPopUpText().getText(),"Для пошуку потрібно ввести 2 і більше символів");

        getWrongSearchPopUp().getPopupCloseCross().click();
        getSearchResultsPage().waitForElementNotDisplayed(15,getWrongSearchPopUp().getPopupNegativeSearch());
        //validation
        Assert.assertFalse(getWrongSearchPopUp().getPopupNegativeSearch().isDisplayed());

    }

    @Test
    public void descriptionTextSearchResultsValidation(){

        //element
        getHomepage().searchByKeyWord(SEARCH_KEYWORD);
       getSearchResultsPage().waitForElementDisplayed(15,getSearchResultsPage().getTitleText());
        for(WebElement listElement : getSearchResultsPage().getSearchResultsList()){
            Assert.assertTrue(listElement.getText().contains(SEARCH_KEYWORD));
        }
    }

}

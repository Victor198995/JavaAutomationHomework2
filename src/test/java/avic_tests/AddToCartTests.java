package avic_tests;

import org.testng.Assert;
import org.testng.annotations.*;



public class AddToCartTests extends BaseTests {

    private static final String SEARCH_KEYWORD = "Фото";

    @Test
    public void addingToCartValidations() {

        //adding one product and verify value is 1
        getHomepage().searchByKeyWord(SEARCH_KEYWORD);
        getSearchResultsPage().waitForElementDisplayed(15, getSearchResultsPage().getTitleText());

        Assert.assertEquals(getHomepage().getShoppingCartCounter().getText(), "0");
        getSearchResultsPage().click(getSearchResultsPage().getFirstProductBuyLink());
        getSearchResultsPage().waitForElementDisplayed(15, getCartPopUp().getPopUp());
        getCartPopUp().click(getCartPopUp().getCloseCrossButton());
        getSearchResultsPage().waitForElementNotDisplayed(15, getCartPopUp().getPopUp());
        Assert.assertEquals(getHomepage().getShoppingCartCounter().getText(), "1");

        //add one more product and verify value is 2
        getHomepage().click(getHomepage().getShoppingCartLink());
        getSearchResultsPage().waitForElementDisplayed(15, getCartPopUp().getPopUp());
        getCartPopUp().click(getCartPopUp().getAddOneButton());
        getCartPopUp().click(getCartPopUp().getContinueShoppingButton());
        getSearchResultsPage().waitForElementNotDisplayed(15, getCartPopUp().getPopUp());

        getHomepage().waitForElementTextToBe(15, getHomepage().getShoppingCartCounter(), "2");
        Assert.assertEquals(getHomepage().getShoppingCartCounter().getText(), "2");

        //delete one product from cart and verify value is 1
        getHomepage().click(getHomepage().getShoppingCartLink());
        getSearchResultsPage().waitForElementDisplayed(15, getCartPopUp().getPopUp());

        getCartPopUp().click(getCartPopUp().getDeleteOneButton());
        getCartPopUp().click(getCartPopUp().getCloseCrossButton());
        getSearchResultsPage().waitForElementNotDisplayed(15, getCartPopUp().getPopUp());

        getHomepage().waitForElementTextToBe(15, getHomepage().getShoppingCartCounter(), "1");
        Assert.assertEquals(getHomepage().getShoppingCartCounter().getText(), "1");

        //delete all from cart and verify value is 0
        getHomepage().click(getHomepage().getShoppingCartLink());
        getSearchResultsPage().waitForElementDisplayed(15, getCartPopUp().getPopUp());
        getCartPopUp().click(getCartPopUp().getDeleteProductCross());
        getSearchResultsPage().waitForElementNotDisplayed(15, getCartPopUp().getPopUp());
        getHomepage().waitForElementTextToBe(15, getHomepage().getShoppingCartCounter(), "0");
    }


}

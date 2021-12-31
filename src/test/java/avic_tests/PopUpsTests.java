package avic_tests;


import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;


public class PopUpsTests extends BaseTests {

    private static final String SEARCH_KEYWORD = "99 220017";

    @Test
    public void directorLetterPopUpLayoutValidation() {

        getHomepage().waitForElementDisplayed(15,getHomepage().getDirectorMailLink());
        getHomepage().click(getHomepage().getDirectorMailLink());
        getDirectorLetterPopUp().waitForElementDisplayed(15,getDirectorLetterPopUp().getPopUp());
        //validation
        Assert.assertTrue(getDirectorLetterPopUp().getPopUpText().isDisplayed());
        Assert.assertTrue(getDirectorLetterPopUp().getNameInput().isDisplayed());
        Assert.assertTrue(getDirectorLetterPopUp().getEmailInput().isDisplayed());
        Assert.assertTrue(getDirectorLetterPopUp().getConfirmButton().isDisplayed());
        Assert.assertTrue(getDirectorLetterPopUp().getCloseCrossButton().isDisplayed());

        //scenario
        getDirectorLetterPopUp().click(getDirectorLetterPopUp().getCloseCrossButton());
        getDirectorLetterPopUp().waitForElementNotDisplayed(15,getDirectorLetterPopUp().getPopUp());
        Assert.assertFalse(getDirectorLetterPopUp().getPopUp().isDisplayed());
    }

    @Test
    public void restorePasswordPopUpLayoutValidation(){
        //precondition
        getHomepage().click(getHomepage().getSignInLink());
        getSignInPage().waitForUrlToBe(15,"https://avic.ua/ua/sign-in");
        getSignInPage().waitForElementDisplayed(15, getSignInPage().getForgotPasswordLink());
        getSignInPage().click(getSignInPage().getForgotPasswordLink());
        //open popup
        getSignInPage().waitForElementDisplayed(15,getForgotPasswordPopUp().getPopupForgotPassword());
        //validation
        Assert.assertTrue(getForgotPasswordPopUp().getPopUpTitle().isDisplayed());
        Assert.assertEquals(getForgotPasswordPopUp().getPopUpTitle().getText(),"Получить новый пароль");
        Assert.assertTrue(getForgotPasswordPopUp().getEmailInput().isDisplayed());
        Assert.assertTrue(getForgotPasswordPopUp().getConfirmButton().isDisplayed());
        //close popUp
        getForgotPasswordPopUp().click(getForgotPasswordPopUp().getPopupCloseCross());
        getSignInPage().waitForElementNotDisplayed(15,getForgotPasswordPopUp().getPopupForgotPassword());
        Assert.assertFalse(getForgotPasswordPopUp().getPopupForgotPassword().isDisplayed());
    }

    @Test
    public void emptyCartCheckoutPopUpLayoutValidation(){
        //precondition
        getHomepage().click(getHomepage().getShoppingCartLink());
        getHomepage().waitForElementDisplayed(15,getCartPopUp().getPopUp());
        getCartPopUp().click(getCartPopUp().getCheckoutButton());
        //open popup
        getHomepage().waitForElementDisplayed(15,getEmptyCartPopUp().getPopUp());
        //validation
        Assert.assertTrue(getEmptyCartPopUp().getPopUpTitle().isDisplayed());
        Assert.assertTrue(getEmptyCartPopUp().getPopUpText().isDisplayed());
        Assert.assertEquals(getEmptyCartPopUp().getPopUpTitle().getText(),"Кошик порожній!");
        Assert.assertEquals(getEmptyCartPopUp().getPopUpText().getText(),"Щоб зробити покупку, потрібно додати товари в кошик.");
        //close popUp
        getEmptyCartPopUp().click(getEmptyCartPopUp().getPopupCloseCross());
        getSignInPage().waitForElementNotDisplayed(15,getEmptyCartPopUp().getPopUp());
        Assert.assertFalse(getEmptyCartPopUp().getPopUp().isDisplayed());
    }
}

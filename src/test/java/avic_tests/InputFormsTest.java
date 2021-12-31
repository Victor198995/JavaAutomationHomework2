package avic_tests;

import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

public class InputFormsTest extends BaseTests {

     private static final String SEARCH_KEYWORD = "Фото";

    @Test
    public void signInFormLayoutValidation(){
        getHomepage().click(getHomepage().getSignInLink());
        getSignInPage().waitForUrlToBe(15,"https://avic.ua/ua/sign-in");
        //validation
        Assert.assertTrue(getSignInPage().getTitleText().isDisplayed());
        Assert.assertEquals(getSignInPage().getTitleText().getText(),"Вхід та реєстрація");
        Assert.assertTrue(getSignInPage().getEmailPhoneInput().isDisplayed());
        Assert.assertTrue(getSignInPage().getPasswordInput().isDisplayed());
        Assert.assertTrue(getSignInPage().getSubmitButton().isDisplayed());
        Assert.assertTrue(getSignInPage().getForgotPasswordLink().isDisplayed());
    }

    @Test
    public void signInFormErrorMessagesValidation(){
        getHomepage().click(getHomepage().getSignInLink());
        getSignInPage().waitForUrlToBe(15,"https://avic.ua/ua/sign-in");
        getSignInPage().waitForElementClickable(15,getSignInPage().getSubmitButton());
        getSignInPage().click(getSignInPage().getSubmitButton());
        //validation
        Assert.assertTrue(getSignInPage().getErrorMsg().isDisplayed());
    }

    @Test
    public void signUpFormLayoutValidation(){
        getHomepage().click(getHomepage().getSignInLink());
        getSignInPage().waitForUrlToBe(15,"https://avic.ua/ua/sign-in");
        getSignInPage().waitForElementDisplayed(15,getSignInPage().getSignUpLink());
        getSignInPage().click(getSignInPage().getSignUpLink());
        getSignUpPage().waitForUrlToBe(15,"https://avic.ua/ua/sign-up");
        //validation
        Assert.assertTrue(getSignUpPage().getTitleText().isDisplayed());
        Assert.assertEquals(getSignUpPage().getTitleText().getText(),"Реєстрація");
        Assert.assertTrue(getSignUpPage().getPhoneInput().isDisplayed());
        Assert.assertTrue(getSignUpPage().getEmailInput().isDisplayed());
        Assert.assertTrue(getSignUpPage().getPasswordInput().isDisplayed());
        Assert.assertTrue(getSignUpPage().getConfirmPasswordInput().isDisplayed());
        Assert.assertTrue(getSignUpPage().getSubmitButton().isDisplayed());
    }


    @Test
    public void signUpFormErrorMessagesValidation(){
        getHomepage().click(getHomepage().getSignInLink());
        getSignInPage().waitForUrlToBe(15,"https://avic.ua/ua/sign-in");
        getSignInPage().waitForElementDisplayed(15,getSignInPage().getSignUpLink());
        getSignInPage().click(getSignInPage().getSignUpLink());
        getSignUpPage().waitForUrlToBe(15,"https://avic.ua/ua/sign-up");
        getSignUpPage().waitForElementClickable(15,getSignUpPage().getSubmitButton());
        getSignUpPage().getSubmitButton().click();
        //validation
        for(WebElement listElement : getSignUpPage().getErrorMessagesList()){
            Assert.assertTrue(listElement.isDisplayed());
        }
        Assert.assertEquals(getSignUpPage().getErrorMessagesQuantity(),3);
    }

    @Test
    public void checkoutFormLayoutValidation(){
        //precondition
        getHomepage().searchByKeyWord(SEARCH_KEYWORD);
        getSearchResultsPage().waitForElementDisplayed(15,getSearchResultsPage().getTitleText());
        getSearchResultsPage().click(getSearchResultsPage().getFirstProductBuyLink());

        getCartPopUp().waitForElementDisplayed(15,getCartPopUp().getPopUp());
        getCartPopUp().waitForElementClickable(15,getCartPopUp().getCheckoutButton());
        getCartPopUp().getCheckoutButton().click();

        getCheckoutPage().waitForUrlToBe(15,"https://avic.ua/ua/checkout");
        Assert.assertTrue(getCheckoutPage().getTitleText().isDisplayed());
        Assert.assertEquals(getCheckoutPage().getTitleText().getText(),"Оформити замовлення");
        Assert.assertTrue(getCheckoutPage().getNamelInput().isDisplayed());
        Assert.assertTrue(getCheckoutPage().getPhonelInput().isDisplayed());
        Assert.assertTrue(getCheckoutPage().getEmailInput().isDisplayed());
        Assert.assertTrue(getCheckoutPage().getCommentLink().isDisplayed());
        Assert.assertFalse(getCheckoutPage().getCommentTextField().isDisplayed());
        Assert.assertTrue(getCheckoutPage().getSubmitOrderButton().isDisplayed());
        //click on comment section
        getCheckoutPage().click(getCheckoutPage().getCommentLink());
        Assert.assertTrue(getCheckoutPage().getCommentTextField().isDisplayed());
    }


    @Test
    public void checkoutFormErrorMessagesValidation(){
        getHomepage().searchByKeyWord(SEARCH_KEYWORD);
        getSearchResultsPage().waitForElementDisplayed(15,getSearchResultsPage().getTitleText());
        getSearchResultsPage().click(getSearchResultsPage().getFirstProductBuyLink());

        getCartPopUp().waitForElementDisplayed(15,getCartPopUp().getPopUp());
        getCartPopUp().waitForElementClickable(15,getCartPopUp().getCheckoutButton());
        getCartPopUp().getCheckoutButton().click();

        getCheckoutPage().waitForUrlToBe(15,"https://avic.ua/ua/checkout");
        getCheckoutPage().waitForElementClickable(15,getCheckoutPage().getSubmitOrderButton());
        getCheckoutPage().getSubmitOrderButton().click();
        //validation
        for(WebElement listElement : getCheckoutPage().getErrorMessagesList()){
            Assert.assertTrue(listElement.isDisplayed());
        }
        Assert.assertEquals(getCheckoutPage().getErrorMessagesQuantity(),2);
    }




}

package avic_tests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class SiteNavigationTests extends BaseTests {

    //main - sign in-main
    @Test
    public void fromMainToSignIn(){
        //going to signin page
        getHomepage().waitForElementClickable(15,getHomepage().getSignInLink());
        getHomepage().getSignInLink().click();
        getSignInPage().waitForUrlToBe(15,"https://avic.ua/ua/sign-in");
        //url and title validation
        Assert.assertEquals(getDriver().getCurrentUrl(),"https://avic.ua/ua/sign-in");
        Assert.assertEquals(getDriver().getTitle(),"Авторизація");
        //going back
        getSignInPage().waitForElementDisplayed(15,getSignInPage().getHomePageLink());
        getSignInPage().getHomePageLink().click();
        getHomepage().waitForUrlToBe(15,"https://avic.ua/ua");
        Assert.assertEquals(getDriver().getTitle(),"AVIC ™ - зручний інтернет-магазин побутової техніки та електроніки в Україні. | Avic");
    }

    //product cart-sign in-main
    @Test
    public void fromCartToSignIn(){
        //going to signin page
        getHomepage().waitForElementClickable(15,getHomepage().getShoppingCartLink());
        getHomepage().getShoppingCartLink().click();
        getCartPopUp().waitForElementDisplayed(15,getCartPopUp().getSignInLink());
        getCartPopUp().getSignInLink().click();

        getSignInPage().waitForUrlToBe(15,"https://avic.ua/ua/sign-in");
        //url and title validation
        Assert.assertEquals(getDriver().getCurrentUrl(),"https://avic.ua/ua/sign-in");
        Assert.assertEquals(getDriver().getTitle(),"Авторизація");
        //going back
        getSignInPage().waitForElementDisplayed(15,getSignInPage().getHomePageLink());
        getSignInPage().getHomePageLink().click();
        getHomepage().waitForUrlToBe(15,"https://avic.ua/ua");
        Assert.assertEquals(getDriver().getTitle(),"AVIC ™ - зручний інтернет-магазин побутової техніки та електроніки в Україні. | Avic");
    }

    //main-trade in and back
    @Test
    public void fromMainToTradeIn(){
        //going to signin page
        getHomepage().waitForElementClickable(15,getHomepage().getTradeInLink());
        getHomepage().getTradeInLink().click();

        getTradeInPage().waitForUrlToBe(15,"https://avic.ua/ua/tradein");
        //url and title validation
        Assert.assertEquals(getDriver().getCurrentUrl(),"https://avic.ua/ua/tradein");
        Assert.assertEquals(getDriver().getTitle(),"Trade in від Avic – Купити в Києві та Україні, по низькій ціні – Інтернет-магазин Avic.ua");
        //going back
        getSignInPage().waitForElementDisplayed(15,getSignInPage().getHomePageLink());
        getSignInPage().getHomePageLink().click();
        getHomepage().waitForUrlToBe(15,"https://avic.ua/ua");
        Assert.assertEquals(getDriver().getTitle(),"AVIC ™ - зручний інтернет-магазин побутової техніки та електроніки в Україні. | Avic");
    }


    @Test
    public void fromMainToSignUp(){
        //going to signin page
        getHomepage().waitForElementClickable(15,getHomepage().getSignInLink());
        getHomepage().getSignInLink().click();
        getSignInPage().waitForUrlToBe(15,"https://avic.ua/ua/sign-in");
        //url and title validation
        getSignInPage().waitForElementDisplayed(15,getSignInPage().getSignUpLink());
        getSignInPage().getSignUpLink().click();

        Assert.assertEquals(getDriver().getCurrentUrl(),"https://avic.ua/ua/sign-up");
        Assert.assertEquals(getDriver().getTitle(),"Реєстрація");
        //going back
        getSignInPage().waitForElementDisplayed(15,getSignInPage().getHomePageLink());
        getSignInPage().getHomePageLink().click();
        getHomepage().waitForUrlToBe(15,"https://avic.ua/ua");
        Assert.assertEquals(getDriver().getTitle(),"AVIC ™ - зручний інтернет-магазин побутової техніки та електроніки в Україні. | Avic");
    }

    @Test
    public void fromSignUpToSignIn(){
        //going to signin page
        getHomepage().waitForElementClickable(15,getHomepage().getSignInLink());
        getHomepage().getSignInLink().click();
        getSignInPage().waitForUrlToBe(15,"https://avic.ua/ua/sign-in");
        //url and title validation
        getSignInPage().waitForElementDisplayed(15,getSignInPage().getSignUpLink());
        getSignInPage().getSignUpLink().click();
        getSignUpPage().waitForUrlToBe(15,"https://avic.ua/ua/sign-up");
        getSignUpPage().waitForElementDisplayed(15,getSignUpPage().getSignInLink());
        getSignUpPage().getSignInLink().click();

        getSignInPage().waitForUrlToBe(15,"https://avic.ua/ua/sign-in");
        //url and title validation
        Assert.assertEquals(getDriver().getCurrentUrl(),"https://avic.ua/ua/sign-in");
        Assert.assertEquals(getDriver().getTitle(),"Авторизація");
    }
}

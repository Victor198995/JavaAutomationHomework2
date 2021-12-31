package avic_tests;


import org.testng.Assert;
import org.testng.annotations.Test;


public class TradeInTests extends BaseTests{

    @Test
    public void tradeInNavigationValidation(){
       getHomepage().waitForElementDisplayed(15,getHomepage().getTradeInLink());
       getHomepage().click(getHomepage().getTradeInLink());
       getTradeInPage().waitForTitleToBe(15,"Trade in від Avic – Купити в Києві та Україні, по низькій ціні – Інтернет-магазин Avic.ua");

        //tradeInPageValidation
        getTradeInPage().waitForElementDisplayed(15,getTradeInPage().getTradeInTitle());
        Assert.assertEquals(getDriver().getCurrentUrl(),"https://avic.ua/ua/tradein");
        Assert.assertTrue(getTradeInPage().getTradeInContainer().isDisplayed());
    }
}

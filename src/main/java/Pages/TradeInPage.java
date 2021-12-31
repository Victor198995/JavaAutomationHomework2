package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class TradeInPage extends BasePage {
    public TradeInPage(WebDriver driver) {
        super(driver);
    }

    //elements

    @FindBy(xpath = "//h1[@class='page-title'][text()='Trade in від Avic']")
    private WebElement tradeInTitle;

    @FindBy(xpath = "//div[@class='tradein-container']")
    private WebElement tradeInContainer;

    @FindBy(xpath = "//div[@class='header-bottom__logo']//img")
    private WebElement logoImage;

    //getters for elements that should be visible in test classes
    public WebElement getTradeInTitle() {
        return tradeInTitle;
    }

    public WebElement getTradeInContainer() {
        return tradeInContainer;
    }

    public WebElement getLogoImage() {
        return logoImage;
    }
    //methods
}

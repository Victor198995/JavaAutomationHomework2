package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class SearchResultsPage extends BasePage{
    public SearchResultsPage(WebDriver driver) {
        super(driver);
    }
//elements
    @FindBy(xpath = "//div[@class='prod-cart__descr']")
    private List<WebElement> searchResults;

    @FindBy(xpath="//div[text()='Результати пошуку']")
    private WebElement titleText;

    @FindBy(xpath = "//div[@class='item-prod col-lg-3'][1]//a[@class='prod-cart__buy']")
    private WebElement firstProductBuyLink;

    //getters for elements that should be visible in test classes
    public List<WebElement> getSearchResultsList(){
        return searchResults;
    }

    public int getSearchResultsQuantity(){
        return getSearchResultsList().size();
    }

    public WebElement getTitleText() {
        return titleText;
    }

    public WebElement getFirstProductBuyLink() {
        return firstProductBuyLink;
    }

    //methods
}

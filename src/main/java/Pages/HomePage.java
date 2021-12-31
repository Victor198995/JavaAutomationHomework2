package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage {

    public HomePage(WebDriver driver) {
        super(driver);
    }

    //elements
    // private static final String SEARCH_INPUT = "//input[@id='input_search']";
    @FindBy(xpath = "//input[@id='input_search']")
    private WebElement searchInput;

    @FindBy(xpath = "(//a[text()='Trade-in оцінка'])[2]")
    private WebElement tradeInLink;

    @FindBy(xpath = "//a[@class='header-top__item or-color js_addMessage_btn']")
    private WebElement directorMailLink;

    @FindBy(xpath = "(//div[@class='active-cart-item js_cart_count'])[2]")
    private WebElement shoppingCartCounter;

    @FindBy(xpath = "(//div[@class='header-bottom__right-icon'])[2]")
    private WebElement shoppingCartLink;

    @FindBy(xpath = "(//div[@class='header-bottom__right-icon'])[1]")
    private WebElement signInLink;

    private static final String SEARCH_BUTTON = "//button[@class='button-reset search-btn']";


    //getters for elements that should be visible in test classes
    public WebElement getShoppingCartCounter() {
        return shoppingCartCounter;
    }

    public WebElement getTradeInLink() {

        return tradeInLink;
    }

    public WebElement getDirectorMailLink() {

        return directorMailLink;
    }

    public WebElement getShoppingCartLink() {
        return shoppingCartLink;
    }

    public WebElement getSignInLink() {
        return signInLink;
    }

    //methods
    public void searchByKeyWord(String keyword) {
        searchInput.sendKeys(keyword);
        d.findElement(By.xpath(SEARCH_BUTTON)).click();
    }


}

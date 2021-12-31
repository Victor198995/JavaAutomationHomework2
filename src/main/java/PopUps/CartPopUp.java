package PopUps;

import Pages.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CartPopUp extends BasePage {
    public CartPopUp(WebDriver driver) {
        super(driver);
    }
    //elements
    @FindBy(xpath = "//div[@id='js_cart']")
    WebElement popUp;

    @FindBy(xpath = "//a[@class='main-btn main-btn--orange']")
    WebElement continueShoppingButton;

    @FindBy(xpath = "//a[@class='main-btn  main-btn--green']")
    WebElement checkoutButton;

    @FindBy(xpath = "(//i[@class='icon icon-close js-btn-close'])[2]")
    WebElement deleteProductCross;

    @FindBy(xpath = "//button[@class='fancybox-button fancybox-close-small']")
    WebElement closeCrossButton;

    @FindBy(xpath = "//span[@class='js_plus btn-count btn-count--plus ']")
    WebElement addOneButton;

    @FindBy(xpath = "//span[@class='js_minus btn-count btn-count--minus ']")
    WebElement deleteOneButton;

    @FindBy(xpath = "(//a[@class='main-btn bg-black'])[2]")
    WebElement signInLink;

    //getters for elements that should be visible in test classes
    public WebElement getPopUp() {
        return popUp;
    }

    public WebElement getContinueShoppingButton() {
        return continueShoppingButton;
    }

    public WebElement getCheckoutButton() {
        return checkoutButton;
    }

    public WebElement getDeleteProductCross() {
        return deleteProductCross;
    }

    public WebElement getCloseCrossButton() {
        return closeCrossButton;
    }

    public WebElement getAddOneButton() {
        return addOneButton;
    }

    public WebElement getDeleteOneButton() {
        return deleteOneButton;
    }

    public WebElement getSignInLink() {
        return signInLink;
    }
    //methods


}

package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class CheckoutPage extends BasePage {
    public CheckoutPage(WebDriver driver) {
        super(driver);
    }
    //elements
    @FindBy(xpath = "//div[@class='ttl ttl-hidden-mobile']")//Оформити замовлення
    private WebElement titleText;

    @FindBy(xpath = "//a[text()='Я вже купував тут']")
    private WebElement signInLink;

    @FindBy(xpath = "//input[@name='name']")
    private WebElement namelInput;

    @FindBy(xpath = "//input[@name='phone']")
    private WebElement phonelInput;

    @FindBy(xpath = "(//input[@name='email'])[1]")
    private WebElement emailInput;

    @FindBy(xpath = "//a[@class='textarea-btn js-comment-open border-defoult']")
    private WebElement commentLink;

    @FindBy(xpath = "//textarea[@name='comment']")
    private WebElement commentTextField;

    @FindBy(xpath = "//button[@class='submit button-reset main-btn main-btn--green']")
    private WebElement submitOrderButton;

    @FindBy(xpath = "//div[@class='form-field input-field flex error']")
    private List<WebElement> errorMessages;


    //getters for elements that should be visible in test classes

    public WebElement getTitleText() {
        return titleText;
    }

    public WebElement getSignInLink() {
        return signInLink;
    }

    public WebElement getNamelInput() {
        return namelInput;
    }

    public WebElement getPhonelInput() {
        return phonelInput;
    }

    public WebElement getEmailInput() {
        return emailInput;
    }

    public WebElement getCommentLink() {
        return commentLink;
    }

    public WebElement getCommentTextField() {
        return commentTextField;
    }

    public WebElement getSubmitOrderButton() {
        return submitOrderButton;
    }

    public List<WebElement> getErrorMessagesList() {
        return errorMessages;
    }

    //methods

    public int getErrorMessagesQuantity() {
        return errorMessages.size();
    }
}

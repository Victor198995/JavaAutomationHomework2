package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class SignUpPage extends BasePage {
    public SignUpPage(WebDriver driver) {
        super(driver);
    }

    //elements
    @FindBy(xpath = "//div[@class='page-title']")//Реєстрація
    private WebElement titleText;

    @FindBy(xpath = "//input[@name='phone']")
    private WebElement phoneInput;

    @FindBy(xpath = "(//input[@name='email'])[1]")
    private WebElement emailInput;

    @FindBy(xpath = "(//input[@name='password'])[1]")
    private WebElement passwordInput;

    @FindBy(xpath = "(//input[@name='password'])[2]")
    private WebElement confirmPasswordInput;

    @FindBy(xpath = "//button[@class='button-reset main-btn js_validate submit main-btn--green']")
    private WebElement submitButton;

    @FindBy(xpath = "//a[@class='btn-offers']")
    private WebElement signInLink;

    @FindBy(xpath = "//div[contains(@class,'form-field input-field flex ')]")//3 elements
    private List<WebElement> errorMessages;

    //getters for elements that should be visible in test classes
    public WebElement getTitleText() {
        return titleText;
    }

    public WebElement getPhoneInput() {
        return phoneInput;
    }

    public WebElement getEmailInput() {
        return emailInput;
    }

    public WebElement getPasswordInput() {
        return passwordInput;
    }

    public WebElement getConfirmPasswordInput() {
        return confirmPasswordInput;
    }

    public WebElement getSubmitButton() {
        return submitButton;
    }

    public WebElement getSignInLink() {
        return signInLink;
    }

    public List<WebElement> getErrorMessagesList() {
        return errorMessages;
    }

    //methods
    public int getErrorMessagesQuantity() {
        return errorMessages.size();
    }


}

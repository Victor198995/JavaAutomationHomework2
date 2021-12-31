package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SignInPage extends BasePage {

    public SignInPage(WebDriver driver) {
        super(driver);
    }

    //elements
    @FindBy(xpath = "//div[@class='page-title']")//Вхід та реєстрація
    private WebElement titleText;

    @FindBy(xpath = "(//input[@name='login'])[1]")
    private WebElement emailPhoneInput;

    @FindBy(xpath = "(//input[@name='password'])[1]")
    private WebElement passwordInput;

    @FindBy(xpath = "(//input[@name='remember'])[1]")
    private WebElement rememberMeCheckBox;

    @FindBy(xpath = "//button[@class='button-reset main-btn submit main-btn--green']")
    private WebElement submitButton;

    @FindBy(xpath = "//a[@class='btn-password fancybox']")
    private WebElement forgotPasswordLink;

    @FindBy(xpath = "//a[@class='btn-offers']")
    private WebElement signUpLink;

    @FindBy(xpath = "//div[@class='form-field input-field flex error']")
    private WebElement errorMsg;

    //getters for elements that should be visible in test classes
    public WebElement getForgotPasswordLink() {
        return forgotPasswordLink;
    }

    public WebElement getTitleText() {
        return titleText;
    }

    public WebElement getEmailPhoneInput() {
        return emailPhoneInput;
    }

    public WebElement getPasswordInput() {
        return passwordInput;
    }

    public WebElement getRememberMeCheckBox() {
        return rememberMeCheckBox;
    }

    public WebElement getSubmitButton() {
        return submitButton;
    }

    public WebElement getSignUpLink() {
        return signUpLink;
    }

    public WebElement getErrorMsg() {
        return errorMsg;
    }

    //methods
}

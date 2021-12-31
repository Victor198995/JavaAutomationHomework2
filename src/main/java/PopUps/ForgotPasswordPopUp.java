package PopUps;

import Pages.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ForgotPasswordPopUp extends BasePage {

    public ForgotPasswordPopUp(WebDriver driver) {
        super(driver);
    }
    //elements
    @FindBy(xpath = "//div[@id='js_forgotPassword']")
    private WebElement popupForgotPassword;

    @FindBy(xpath = "//button[@class='fancybox-button fancybox-close-small']")
    private WebElement popupCloseCross;

    @FindBy(xpath = "(//div[@class='modal-top']/div[@class='ttl'])[5]")
    private WebElement popUpTitle;

    @FindBy(xpath = "(//input[@name='login'])[2]")
    private WebElement emailInput;

    @FindBy(xpath = "//button[contains(text(),'Получить')]")
    private WebElement confirmButton;

    @FindBy(xpath = "//div[@class='form-field input-field flex error']")
    private WebElement emailFieldErrorMessage;//data-error="Обязательное поле"

    //getters for elements that should be visible in test classes
    public WebElement getPopupForgotPassword() {
        return popupForgotPassword;
    }

    public WebElement getPopupCloseCross() {
        return popupCloseCross;
    }

    public WebElement getPopUpTitle() {
        return popUpTitle;
    }

    public WebElement getEmailInput() {
        return emailInput;
    }

    public WebElement getConfirmButton() {
        return confirmButton;
    }

    public WebElement getEmailFieldErrorMessage() {
        return emailFieldErrorMessage;
    }
}

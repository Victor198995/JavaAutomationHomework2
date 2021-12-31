package PopUps;

import Pages.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.util.List;

public class DirectorLetterPopUp extends BasePage {
    public DirectorLetterPopUp(WebDriver driver) {
        super(driver);
    }

    //elements
    @FindBy(xpath = "//div[@id='js_addMessage']")
    private WebElement popUp;

    @FindBy(xpath = "//div[text()='Надіслати повідомлення']")
    private WebElement popUpText;

    @FindBy(xpath = "(//input[@name='user_name'])[2]")
    private WebElement nameInput;

    @FindBy(xpath = "(//input[@placeholder='Електронна пошта'])[2]")
    private WebElement emailInput;

    @FindBy(xpath = "(//button[contains(text(),'Надіслати повідомлення')])[4]")
    private WebElement confirmButton;

    @FindBy(xpath = "//button[@class='fancybox-button fancybox-close-small']")
    private WebElement closeCrossButton;

    //getters for elements that should be visible in test classes
    public WebElement getPopUp() {
        return popUp;
    }

    public WebElement getPopUpText() {
        return popUpText;
    }

    public WebElement getNameInput() {
        return nameInput;
    }

    public WebElement getEmailInput() {
        return emailInput;
    }

    public WebElement getConfirmButton() {
        return confirmButton;
    }

    public WebElement getCloseCrossButton() {
        return closeCrossButton;
    }
    //methods

}

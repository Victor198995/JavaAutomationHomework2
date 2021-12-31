package PopUps;

import Pages.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class EmptyCartPopUp extends BasePage {
    public EmptyCartPopUp(WebDriver driver) {
        super(driver);
    }

    //elements
    @FindBy(xpath = "//div[@id='modalAlert']")
    WebElement popUp;

    @FindBy(xpath = "//div[@class='ttl js_title']")
    WebElement popUpTitle;//Кошик порожній!

    @FindBy(xpath = "//div[@class='col-xs-12 js_message']")//Щоб зробити покупку, потрібно додати товари в кошик.
    WebElement popUpText;

    @FindBy(xpath = "//button[@class='fancybox-button fancybox-close-small']")
    private WebElement popupCloseCross;

    //getters

    public WebElement getPopUp() {
        return popUp;
    }

    public WebElement getPopUpTitle() {
        return popUpTitle;
    }

    public WebElement getPopUpText() {
        return popUpText;
    }

    public WebElement getPopupCloseCross() {
        return popupCloseCross;
    }
}

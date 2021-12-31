package PopUps;

import Pages.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class WrongSearchPopUp extends BasePage {

    public WrongSearchPopUp(WebDriver driver) {
        super(driver);
    }
    //elements
    @FindBy(xpath = "//div[@id='modalAlert']")
    private WebElement popupNegativeSearch;

    @FindBy(xpath = "//button[@class='fancybox-button fancybox-close-small']")
    private WebElement popupCloseCross;

    @FindBy(xpath = "//div[@class='ttl js_title']")
    private WebElement popUpTitle;

    @FindBy(xpath = "//div[@class='col-xs-12 js_message']")
    private WebElement popUpText;

    //getters for elements that should be visible in test classes
    public WebElement getPopupNegativeSearch() {
        return popupNegativeSearch;
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

    //methods


}

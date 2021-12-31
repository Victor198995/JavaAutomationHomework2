package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class BasePage {
    WebDriver d;

    public BasePage(WebDriver driver) {
        this.d=driver;
        //PageFactory improvement
        PageFactory.initElements(driver,this);
    }
    //general elements
    @FindBy(xpath = "//div[@class='header-bottom__logo']")
    private WebElement homePageLink;

    public WebElement getHomePageLink() {
        return homePageLink;
    }

    //implicit wait
    public void implicitWait(long time){
        d.manage().timeouts().implicitlyWait(Duration.ofSeconds(time));
    }

    //explicit waits
    public void waitForPageLoading(long timeToWait){
        WebDriverWait wait = new WebDriverWait(d,Duration.ofSeconds(timeToWait));
        wait.until(webDriver -> ((JavascriptExecutor) webDriver).executeScript("return document.readyState").equals("complete"));
    }

    public void waitForElementDisplayed(long timeToWait, WebElement element){
        WebDriverWait wait = new WebDriverWait(d,Duration.ofSeconds(timeToWait));
        wait.until(ExpectedConditions.visibilityOf(element));
    }

    public void waitForElementClickable(long timeToWait, WebElement element){
        WebDriverWait wait = new WebDriverWait(d,Duration.ofSeconds(timeToWait));
        wait.until(ExpectedConditions.elementToBeClickable(element));
    }

    public void waitForElementNotDisplayed(long timeToWait, WebElement element){
        WebDriverWait wait = new WebDriverWait(d,Duration.ofSeconds(timeToWait));
        wait.until(ExpectedConditions.invisibilityOf(element));
    }

    public void waitForUrlToBe(long timeToWait, String url){
        WebDriverWait wait = new WebDriverWait(d,Duration.ofSeconds(timeToWait));
        wait.until(ExpectedConditions.urlToBe(url));
    }

    public void waitForTitleToBe(long timeToWait, String title){
        WebDriverWait wait = new WebDriverWait(d,Duration.ofSeconds(timeToWait));
        wait.until(ExpectedConditions.titleIs(title));
    }

    public void waitForElementTextToBe(long timeToWait, WebElement element,String text){
        WebDriverWait wait = new WebDriverWait(d,Duration.ofSeconds(timeToWait));
        wait.until(ExpectedConditions.textToBePresentInElement(element,text));
    }
//click on element
    public void click(WebElement a){
        a.click();
    }
}

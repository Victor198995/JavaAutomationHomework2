package avic_tests;

import Pages.*;
import PopUps.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;


import static io.github.bonigarcia.wdm.WebDriverManager.chromedriver;

public class BaseTests {

   private WebDriver driver;

    @BeforeTest
    public void profileSetup() {
        chromedriver().setup();
    }

    @BeforeMethod
    public void testsSetup() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://avic.ua/ua");
    }

    @AfterMethod
    public void tearDownTest() {
        driver.quit();
    }

    @AfterTest
    public void tearDownSuite() {
        driver.quit();
    }

    //getter
    public WebDriver getDriver() {
        return driver;
    }

    //methods for creation pages instance
    public HomePage getHomepage() {
        return new HomePage(driver);
    }

    public SearchResultsPage getSearchResultsPage() {
        return new SearchResultsPage(getDriver());
    }

    public TradeInPage getTradeInPage() {
        return new TradeInPage(getDriver());
    }

    public SignInPage getSignInPage() {
        return new SignInPage(getDriver());
    }

    public SignUpPage getSignUpPage() {
        return new SignUpPage(getDriver());
    }

    public CheckoutPage getCheckoutPage() {
        return new CheckoutPage(getDriver());
    }

    //methods for creation popups instances

    public DirectorLetterPopUp getDirectorLetterPopUp() {
        return new DirectorLetterPopUp(getDriver());
    }

    public CartPopUp getCartPopUp() {
        return new CartPopUp(getDriver());
    }

    public WrongSearchPopUp getWrongSearchPopUp() {
        return new WrongSearchPopUp(getDriver());
    }

    public EmptyCartPopUp getEmptyCartPopUp() {
        return new EmptyCartPopUp(getDriver());
    }

    public ForgotPasswordPopUp getForgotPasswordPopUp() {
        return new ForgotPasswordPopUp(getDriver());
    }


}

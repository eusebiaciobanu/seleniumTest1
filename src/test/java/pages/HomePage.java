package pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {

    private WebDriver driver;

    public HomePage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }


    @FindBy(css = ".skip-account .label")
    private WebElement accountButton;

    @FindBy(css = "[title='Log In']")
    private WebElement loginLink;

    @FindBy(css = "[title='Register']")
    private WebElement registerLink;

    @FindBy(id = "search")
    private WebElement searchField;

    @FindBy(css = "li.nav-5 > a")
    private WebElement saleLink;

    @FindBy(css = "ul.products-grid li.item:first-child a.link-wishlist")
    private WebElement firstAddToWishlistLink;


    public void clickAccountButton() {
        accountButton.click();
    }

    public void clickLoginLink() {
        loginLink.click();
    }
    public void clickRegisterlink() {registerLink.click();}

    public void clickSaleLink() {
        saleLink.click();
    }

    public void clickAddToWishList() {
        firstAddToWishlistLink.click();
    }

    public void setSearchField(String searchValue) {
        searchField.clear();
        searchField.sendKeys(searchValue + Keys.ENTER);
    }
}

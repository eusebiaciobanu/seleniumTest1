package pages;

import org.openqa.selenium.By;
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
    public void testAddSaleItemToWishlist(){
        driver.get("http://testfasttrackit.info/selenium-test/");
        WebElement saleLink = driver.findElement(By.cssSelector("li.level0.nav-5 > a"));
        saleLink.click();
        WebElement firstProductLink =
                driver.findElements(By.cssSelector("http://testfasttrackit.info/selenium-test/sale.html")).get(0);
        firstProductLink.click();
        WebElement addToWishlistButton =
                driver.findElement(By.cssSelector("http://testfasttrackit.info/selenium-test/wishlist/index/index/wishlist_id/343/"));
        addToWishlistButton.click();

    }


}

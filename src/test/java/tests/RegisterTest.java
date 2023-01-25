package tests;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.HomePage;
import pages.LoginPage;

public class RegisterTest {
    private WebDriver driver;

    @Before
    public void initDriver() {
        System.setProperty("webdriver.chrome.driver", "resources/chromedriver");
        driver = new ChromeDriver();

        driver.manage().window().maximize();
        driver.get("http://testfasttrackit.info/selenium-test/");
    }

    @Test
    public void registerTest() {
        HomePage homePage = new HomePage(driver);
        LoginPage loginPage = new LoginPage(driver);

        homePage.clickAccountButton();
        homePage.clickRegisterlink();
        loginPage.setFirstNameField("Ciobanu");
        loginPage.setMiddleNameField("P");
        loginPage.setLastName("Eusebia");
        loginPage.setEmailField("ciobanueusebia@yahoo.com");
        loginPage.setPasswordField("Iunie2020");
        loginPage.setConfirmPasswordField("Iunie2020");

        loginPage.clickRegisterButton();
    }

    @After
    public void quit() {driver.close();}
}

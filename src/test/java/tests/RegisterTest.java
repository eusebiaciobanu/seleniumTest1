package tests;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.HomePage;
import pages.LoginPage;

import static org.junit.Assert.assertNull;

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
    public void registerTest() throws InterruptedException {
        HomePage homePage = new HomePage(driver);
        LoginPage loginPage = new LoginPage(driver);

        homePage.clickAccountButton();
        homePage.clickRegisterlink();
        loginPage.setFirstNameField("Ciobanu");
        loginPage.setMiddleNameField("P");
        loginPage.setLastName("Eusebia");
        loginPage.setEmailField("ciobanueusebia1@yahoo.com");
        loginPage.setPasswordField("Iunie2020");
        loginPage.setConfirmPasswordField("Iunie2020");

        loginPage.clickRegisterButton();
    }
    @Test
    public void testRegisterTest() {
        System.setProperty("web-driver.chrome.driver", "C:\\I2EWebsiteTest\\Driver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.navigate().to("\"http://testfasttrackit.info/selenium-test/\"");
        String verifyAssertNull = null;
        assertNull(null);
    }

    @After
    public void quit() {driver.close();}
}

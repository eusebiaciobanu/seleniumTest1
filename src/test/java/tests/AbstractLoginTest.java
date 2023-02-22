package tests;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import pages.AccountPage;
import pages.HomePage;
import pages.LoginPage;

public abstract class AbstractLoginTest {

    protected WebDriver driver;
    private HomePage homePage;
    private LoginPage loginPage;
    private AccountPage accountPage;

    @Before
    public void initDriver() {
        System.setProperty("webdriver.chrome.driver", "resources/chromedriver");

        setDriver();

        driver.manage().window().maximize();
        driver.get("http://testfasttrackit.info/selenium-test/");

        homePage = new HomePage(driver);
        accountPage = new AccountPage(driver);
        loginPage = new LoginPage(driver);
    }

    protected abstract void setDriver();

    @Test
    public void loginWithValidData() {
        homePage.clickAccountButton();
        homePage.clickLoginLink();
        loginPage.setEmailField("ciobanueusebia@yahoo.com");
        loginPage.setPasswordField("Iunie2020");
        loginPage.clickLoginButton();
        Assert.assertEquals("Hello, Ciobanu Eusebia Eusebia!", accountPage.getWelcomeText());

    }

    @Test
    public void loginWithValidData1() {

        homePage.clickAccountButton();
        homePage.clickLoginLink();
        loginPage.setEmailField("ciobanueusebia@yahoo.com");
        loginPage.setPasswordField("Iunie2020");
        loginPage.clickLoginButton();

        WebElement welcomeTextElement = driver.findElement(By.cssSelector("body > div > div.page > div.main-container.col2-left-layout > div > div.col-main > div.my-account > div > div.welcome-msg > p.hello > strong"));

        String expectedText = "Hello, Ciobanu Eusebia Eusebia!";
        String actualText = welcomeTextElement.getText();

        if (actualText.equals(expectedText)) {
            System.out.println("S-a logat cu success!");
        } else
            System.err.println("Nu s-a logat. ");

    }

    @Test
    public void loginWithValidData2() {
        driver.findElement(By.cssSelector("#header > div > div.skip-links > div > a > span.label")).click();
        driver.findElement(By.cssSelector("#header-account > div > ul > li.last > a")).click();
        driver.findElement(By.id("email")).sendKeys("ciobanueusebia@yahoo.com");
        driver.findElement(By.id("pass")).sendKeys("Iunie2020");
        driver.findElement(By.id("send2")).click();

        WebElement welcomeTextElement = driver.findElement(By.cssSelector("body > div > div.page > div.main-container.col2-left-layout > div > div.col-main > div.my-account > div > div.welcome-msg > p.hello > strong"));

        String expectedText = "Hello, Ciobanu Eusebia Eusebia!";
        String actualText = welcomeTextElement.getText();

        if (actualText.equals(expectedText)) {
            System.out.println("S-a logat cu success!");
        } else
            System.err.println("Nu s-a logat. ");

    }

    @After
    public void quit() {
        driver.close();
    }
}

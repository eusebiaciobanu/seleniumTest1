import org.junit.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginTest {

    private WebDriver driver;

    @Before
    public void initDriver(){
        System.setProperty("webdriver.chrome.driver", "resources/chromedriver");
        driver = new ChromeDriver();

        driver.manage().window().maximize();
        driver.get("http://testfasttrackit.info/selenium-test/");
    }

    @Test
    public void loginWithValidData(){
        driver.findElement(By.cssSelector(".skip-account .label")).click();
        driver.findElement(By.cssSelector("[title='Log In']")).click();
        driver.findElement(By.id("email")).sendKeys("cosmin@fasttrackit.org");
        driver.findElement(By.id("pass")).sendKeys("123456");
        driver.findElement(By.id("send2")).click();

        WebElement welcomeTextElement = driver.findElement(By.cssSelector(".hello strong"));

        String expectedText = "Hello, Cosmin Fast!";
        String actualText = welcomeTextElement.getText();

        Assert.assertEquals(expectedText,actualText);

        WebElement myAccount = driver.findElement(By.cssSelector(".block-account span"));

        Assert.assertTrue(myAccount.isDisplayed());
    }
    @Test
    public void loginWithValidData1(){

        driver.findElement(By.cssSelector("#header > div > div.skip-links > div > a > span.label")).click();
        driver.findElement(By.cssSelector("#header-account > div > ul > li.last > a")).click();
        driver.findElement(By.id("email")).sendKeys("cosmin@fasttrackit.org");
        driver.findElement(By.id("pass")).sendKeys("123456");
        driver.findElement(By.id("send2")).click();

        WebElement welcomeTextElement = driver.findElement(By.cssSelector("body > div > div.page > div.main-container.col2-left-layout > div > div.col-main > div.my-account > div > div.welcome-msg > p.hello > strong"));

        String expectedText = "Hello, Cosmin Fast!";
        String actualText = welcomeTextElement.getText();

        if (actualText.equals(expectedText)){
            System.out.println("S-a logat cu success!");
        }else
            System.err.println("Nu s-a logat. ");

    }

    @Test
    public void loginWithValidData2(){

        driver.findElement(By.cssSelector("#header > div > div.skip-links > div > a > span.label")).click();
        driver.findElement(By.cssSelector("#header-account > div > ul > li.last > a")).click();
        driver.findElement(By.id("email")).sendKeys("cosmin@fasttrackit.org");
        driver.findElement(By.id("pass")).sendKeys("123456");
        driver.findElement(By.id("send2")).click();

        WebElement welcomeTextElement = driver.findElement(By.cssSelector("body > div > div.page > div.main-container.col2-left-layout > div > div.col-main > div.my-account > div > div.welcome-msg > p.hello > strong"));

        String expectedText = "Hello, Cosmin Fast!";
        String actualText = welcomeTextElement.getText();

        if (actualText.equals(expectedText)){
            System.out.println("S-a logat cu success!");
        }else
            System.err.println("Nu s-a logat. ");


    }

    @After
    public void quit(){
        driver.close();
    }
}

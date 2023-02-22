package tests;

import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeLoginTest extends AbstractLoginTest {
    @Override
    protected void setDriver() {
        driver = new ChromeDriver();
    }
}

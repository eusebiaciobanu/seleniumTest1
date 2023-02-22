package tests;

import org.openqa.selenium.firefox.FirefoxDriver;

public class FirefoxLoginTest extends AbstractLoginTest {
    @Override
    protected void setDriver() {
        driver = new FirefoxDriver();
    }
}

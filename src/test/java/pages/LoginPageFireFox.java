package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPageFireFox {
    private final WebElement LoginPageFireFox;
    @FindBy(id = "lastname")
    private WebElement lastNameField;

    public LoginPageFireFox(WebElement loginPageFireFox, WebDriver driver) {
        LoginPageFireFox = loginPageFireFox;
        PageFactory.initElements(driver, this);
    }

}

package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
    private WebDriver driver;
   @FindBy (id = "lastname")
    private WebElement lastNameField;

    public LoginPage(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }

    @FindBy(id = "email")
    private WebElement emailField;
    @FindBy(id = "send2")
    private WebElement loginButton;

    @FindBy (id = "firstname")
    private WebElement firstNameField;

    @FindBy (id = "middlename")
    private WebElement middleNameField;

    @FindBy (id = "lastName")
    private WebElement LastName;
    @FindBy (id =  "pass")
    private WebElement passwordField;

    @FindBy (id = "confirmation")
    private WebElement confirmPassField;

    @FindBy (css = "button[title='Register']")
    private WebElement registerButton;




    public void setEmailField(String value){ emailField.sendKeys(value);}
    public void clickLoginButton(){ loginButton.click();}
    public void setFirstNameField(String value) {firstNameField.sendKeys(value);}
    public void setMiddleNameField(String value) {middleNameField.sendKeys(value);}
    public void setLastName(String value) {lastNameField.sendKeys(value);}
    public void setPasswordField(String value){passwordField.sendKeys(value);}
    public void setConfirmPasswordField(String value) {confirmPassField.sendKeys(value);}
    public void clickRegisterButton() {registerButton.click();}

}


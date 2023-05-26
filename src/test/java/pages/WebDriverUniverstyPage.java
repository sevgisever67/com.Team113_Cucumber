package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class WebDriverUniverstyPage {
    public WebDriverUniverstyPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//h1[text()='LOGIN PORTAL']")
    public WebElement loginPortalButton;

    @FindBy(id="text")
    public WebElement userNameButton;
    @FindBy(id="password")
    public WebElement passWordButton;

    @FindBy(id="login-button")
    public WebElement logInButton;

    @FindBy(id = "nav-title")
    public WebElement webUniverstyComTexti;

}

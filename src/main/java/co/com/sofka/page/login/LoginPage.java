package co.com.sofka.page.login;

import co.com.sofka.page.common.CommonActionOnPages;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import java.time.Duration;

public class LoginPage extends CommonActionOnPages {

    @CacheLookup
    @FindBy(xpath = "/html/body/div[1]/div/div[3]/div[2]/div[2]/form/div[2]/input")
    protected WebElement username;

    @CacheLookup
    @FindBy(xpath = "/html/body/div[1]/div/div[3]/div[2]/div[2]/form/div[3]/input")
    protected WebElement password;

    @CacheLookup
    @FindBy(id = "btnLogin")
    protected WebElement submit;

    public LoginPage(WebDriver driver, Duration seconds) {
        super(driver, seconds, false);
        pageFactoryInitElement(driver, this);
    }
}

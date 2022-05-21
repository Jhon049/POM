package co.com.sofka.page.login;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import java.time.Duration;

public class LoginPageCases extends LoginPage{
    private static final Logger LOGGER = Logger.getLogger(LoginPageCases.class);

    public LoginPageCases(WebDriver driver, Duration seconds) {
        super(driver, seconds);
    }

    public void login() {
        typeOn(username, "Admin");
        typeOn(password, "admin123");
        doSubmit(submit);
    }
}

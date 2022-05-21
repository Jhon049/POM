package co.com.sofka.page.admin;

import co.com.sofka.page.common.CommonActionOnPages;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class AdminPage extends CommonActionOnPages {

    @CacheLookup
    @FindBy(xpath = "/html/body/div[1]/div[2]/ul/li[1]/ul/li[2]/a")
    protected WebElement jobmenu;

    @CacheLookup
    @FindBy(xpath = "/html/body/div[1]/div[2]/ul/li[1]/ul/li[2]/ul/li[2]/a")
    protected WebElement viewpaygrades;

    public AdminPage(WebDriver driver) {
        super(driver);
        pageFactoryInitElement(driver, this);
    }
}

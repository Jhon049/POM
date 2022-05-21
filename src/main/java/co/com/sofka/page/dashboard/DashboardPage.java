package co.com.sofka.page.dashboard;

import co.com.sofka.page.common.CommonActionOnPages;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class DashboardPage extends CommonActionOnPages {

    @CacheLookup
    @FindBy(id = "menu_admin_viewAdminModule")
    protected WebElement adminbtn;

    public DashboardPage(WebDriver driver) {
        super(driver);
        pageFactoryInitElement(driver, this);
    }
}

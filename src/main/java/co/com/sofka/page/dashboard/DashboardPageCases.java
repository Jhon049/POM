package co.com.sofka.page.dashboard;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;

public class DashboardPageCases extends DashboardPage{
    private static final Logger LOGGER = Logger.getLogger(DashboardPage.class);

    public DashboardPageCases(WebDriver driver) {
        super(driver);
    }

    public void goToAdminPage() throws InterruptedException{
        clickOn(adminbtn);
    }
}

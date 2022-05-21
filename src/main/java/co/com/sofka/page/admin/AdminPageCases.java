package co.com.sofka.page.admin;

import org.openqa.selenium.WebDriver;

public class AdminPageCases extends AdminPage{

    public AdminPageCases(WebDriver driver) {
        super(driver);
    }

    public void viewPayGrades(){
        clickOn(jobmenu);
        clickOn(viewpaygrades);
    }
}

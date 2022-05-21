package co.com.sofka.page.viewpaygrades;

import co.com.sofka.page.dashboard.DashboardPage;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;

public class ViewPayGradePageCases extends ViewPayGradePage{
    private static final Logger LOGGER = Logger.getLogger(DashboardPage.class);

    public ViewPayGradePageCases(WebDriver driver) {
        super(driver);
    }

    public void createPayGrade() throws InterruptedException{
        clickOn(addBtn);
        typeOn(payGradeName,"Grade 111");
        clickOn(saveBtn);
        clickOn(addCurrency);
        typeOn(currencyName,"USD - United States Dollar");
        //clickOn(USD_currency);
        typeOn(minSalary, "10000");
        typeOn(maxSalary, "20000");
        clickOn(saveCurrency);
    }

    public String successfullyCreated() throws InterruptedException{
        String message = new String();
        clickOn(btnCancel);
        message = column.getText();
        return message;
    }
    public String currencyExist() throws InterruptedException{
        String message = "";
        message = columnCurrency.getText();
        return message;
    }
}

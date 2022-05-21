package co.com.sofka.page.viewpaygrades;

import co.com.sofka.page.common.CommonActionOnPages;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class ViewPayGradePage extends CommonActionOnPages {

    @CacheLookup
    @FindBy(id = "btnAdd")
    protected WebElement addBtn;

    @CacheLookup
    @FindBy(id = "payGrade_name")
    protected WebElement payGradeName;

    @CacheLookup
    @FindBy(id = "btnSave")
    protected WebElement saveBtn;

    @CacheLookup
    @FindBy(id = "btnAddCurrency")
    protected WebElement addCurrency;

    @CacheLookup
    @FindBy(id = "payGradeCurrency_currencyName")
    protected WebElement currencyName;

    @CacheLookup
    @FindBy(id = "payGradeCurrency_minSalary")
    protected WebElement minSalary;

    @CacheLookup
    @FindBy(id = "payGradeCurrency_maxSalary")
    protected WebElement maxSalary;

    @CacheLookup
    @FindBy(id = "btnSaveCurrency")
    protected WebElement saveCurrency;

    @CacheLookup
    @FindBy(id = "btnCancel")
    protected WebElement btnCancel;

    @CacheLookup
    @FindBy(xpath = "/html/body/div[1]/div[3]/div[1]/div/div[2]/form/div[4]/table/tbody/tr[1]/td[2]/a")
    protected WebElement column;

    @CacheLookup
    @FindBy(xpath = "/html/body/div[1]/div[3]/div[1]/div/div[2]/form/div[4]/table/tbody/tr[1]/td[3]")
    protected WebElement columnCurrency;

    public ViewPayGradePage(WebDriver driver) {
        super(driver);
        pageFactoryInitElement(driver, this);
    }
}

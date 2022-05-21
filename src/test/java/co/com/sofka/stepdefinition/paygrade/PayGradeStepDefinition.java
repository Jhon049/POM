package co.com.sofka.stepdefinition.paygrade;

import co.com.sofka.page.admin.AdminPageCases;
import co.com.sofka.page.dashboard.DashboardPageCases;
import co.com.sofka.page.login.LoginPageCases;
import co.com.sofka.page.viewpaygrades.ViewPayGradePageCases;
import co.com.sofka.stepdefinition.setup.WebUI;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.apache.log4j.Logger;
import org.junit.jupiter.api.Assertions;
import java.time.Duration;

public class PayGradeStepDefinition extends WebUI {
    private static final Logger LOGGER = Logger.getLogger(PayGradeStepDefinition.class);
    private LoginPageCases loginPageCases;
    private DashboardPageCases dashboardPageCases;
    private AdminPageCases adminPageCases;
    private ViewPayGradePageCases viewPayGradePageCases;

    @Given("que el usuario administrativo ingreso a la seccion pay grades")
    public void queElUsuarioAdministrativoIngresoALaSeccionPayGrades(){
        try{
            setUpLog4j2();
            setUpWebDriver();
            generalStUp();
            loginPageCases = new LoginPageCases(driver, Duration.ofSeconds(3));
            loginPageCases.login();

            dashboardPageCases = new DashboardPageCases(driver);
            dashboardPageCases.goToAdminPage();

            adminPageCases = new AdminPageCases(driver);
            adminPageCases.viewPayGrades();

        }catch (Exception exception){
            quiteDriver();
            Assertions.fail(exception.getMessage(), exception);
            LOGGER.error(exception.getMessage(), exception);
        }
    }

    @When("el usuario adiciona un pay grade incluyendo los datos de currency")
    public void elUsuarioAdicionaUnPayGradeIncluyendoLosDatosDeCurrency(){
        try{
            viewPayGradePageCases = new ViewPayGradePageCases(driver);
            viewPayGradePageCases.createPayGrade();

        }catch(Exception exception){
            quiteDriver();
            Assertions.fail(exception.getMessage(), exception);
            LOGGER.error(exception.getMessage(), exception);
        }
    }

    @Then("debera aparecer el pay grade en la tabla junto al currency")
    public void deberaAparecerElPayGradeEnLaTablaJuntoAlCurrency(){
        try {
            Assertions.assertEquals("Grade 111", viewPayGradePageCases.successfullyCreated());
            Assertions.assertNotEquals("",viewPayGradePageCases.currencyExist());
            quiteDriver();
        } catch (InterruptedException exception) {
            quiteDriver();
            Assertions.fail(exception.getMessage(), exception);
            LOGGER.error(exception.getMessage(), exception);
        }
    }
}

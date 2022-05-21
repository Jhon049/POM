package co.com.sofka.runner.paygrade;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        snippets = CucumberOptions.SnippetType.CAMELCASE
        ,publish = true
        ,features = {"src/test/resources/features/payGrade/payGrade.feature"}
        ,glue = "co.com.sofka.stepdefinition.paygrade"
)
public class PayGrade {
}

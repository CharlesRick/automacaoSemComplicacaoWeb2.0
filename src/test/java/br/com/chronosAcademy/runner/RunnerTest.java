package br.com.chronosAcademy.runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/features/",
        tags = "@loginComSucesso",
        glue = "br.com.chronosAcademy.steps",
        plugin = {"json:target/reports/cucumberReports.json","pretty"},
        snippets = CucumberOptions.SnippetType.CAMELCASE

)
public class RunnerTest {
}

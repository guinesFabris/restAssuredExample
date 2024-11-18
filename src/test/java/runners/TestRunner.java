package runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/java/features", // Caminho para o diretório de features
        glue = "steps",                      // Pacote onde estão os Step Definitions
        plugin = {"pretty", "html:target/cucumber-reports.html"}, // Relatórios
        monochrome = true                    // Saída mais legível no console
)
public class TestRunner {
}

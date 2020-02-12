package co.com.todo1.runners;

import co.com.todo1.utils.runnerpersonalizado.BeforeSuite;
import co.com.todo1.utils.runnerpersonalizado.DataToFeature;
import co.com.todo1.utils.runnerpersonalizado.RunnerPersonalizado;
import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import org.junit.runner.RunWith;

import java.io.IOException;

import static co.com.todo1.utils.constantes.TipoClaseConstante.CLASE_RUNNER;

@RunWith(RunnerPersonalizado.class)
@CucumberOptions(
        features = {"src/test/resources/features/feature.feature"},
        glue = {"co.com.todo1.stepdefinitions"},
        snippets = SnippetType.CAMELCASE
)
public class Runner {
    private Runner() {throw new IllegalStateException(CLASE_RUNNER);}

    @BeforeSuite
    public static void test() throws IOException {
        DataToFeature.overrideFeatureFiles("./src/test/resources/features/feature.feature");
    }
}
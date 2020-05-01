package com.pruebadocker.autweb.runners;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "src/test/resources/features/loguin_mercury_tours.feature",
        glue = "com.pruebadocker.autweb.step_definitions",
        snippets = SnippetType.CAMELCASE
)
public class LoguinMercuryToursRunners {
}

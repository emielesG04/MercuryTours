package com.pruebadocker.autweb.step_definitions;

import com.pruebadocker.autweb.questions.TheContentLoguinMercury;
import com.pruebadocker.autweb.tasks.DataEnteredLoguinMercury;
import com.pruebadocker.autweb.tasks.OpenTheBrowser;
import com.pruebadocker.autweb.user_interfaces.MercuryToursHomePage;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.WebDriver;

import java.util.List;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.is;

public class LoguinMercuryToursStepDefinitions {

    @Managed(driver = "chrome")
    private WebDriver herBrowser;
    private Actor Elvis = Actor.named("Susan");
    private MercuryToursHomePage mercuryToursHomePage;

    @Before
    public void setUp() {
        Elvis.can(BrowseTheWeb.with(herBrowser));
    }


    @Given("^that Elvis is on the portal$")
    public void thatElvisIsOnThePortal() {

        Elvis.wasAbleTo(OpenTheBrowser.on(mercuryToursHomePage));
    }

    @When("^he records the information$")
    public void heRecordsTheInformation(List<com.pruebadocker.autweb.models.DataEnteredLoguinMercury> dataEntered) {
       Elvis.attemptsTo(DataEnteredLoguinMercury.withData(dataEntered.get(0)));

    }

    @Then("^Elvis You should see the following (.*)$")
    public void elvisYouShouldSeeTheFollowingType(String message)  {
        Elvis.should(seeThat(TheContentLoguinMercury.message(), is(equalTo(message))));

    }
}

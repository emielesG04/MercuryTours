package com.pruebadocker.autweb.step_definitions;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static org.hamcrest.Matchers.equalTo;

import org.openqa.selenium.WebDriver;

import com.pruebadocker.autweb.questions.TheContent;
import com.pruebadocker.autweb.tasks.OpenTheBrowser;
import com.pruebadocker.autweb.tasks.Translate;
import com.pruebadocker.autweb.user_interfaces.GoogleTranslatePage;
import com.pruebadocker.autweb.user_interfaces.TranslateHomePage;

import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.thucydides.core.annotations.Managed;

public class GoogleTranslateStepDefinitions {
	
	@Managed(driver = "chrome")
	private WebDriver herBrowser;
	private Actor susan = Actor.named("Susan");
	private TranslateHomePage translateHomePage;
	
	@Before
	public void setUp() {
		susan.can(BrowseTheWeb.with(herBrowser));
	}
	
	@Given("^that Susan wants to translate a word$")
	public void thatSusanWantsToTranslateAWord() throws Exception {
	    susan.wasAbleTo(OpenTheBrowser.on(translateHomePage));
	}

	@When("^she translate the word '(.*)' from English to Spanish$")
	public void sheTranslateTheWordFromEnglishToSpanish(String word) throws Exception {
		susan.attemptsTo(Translate.the(word));
	}

	@Then("^she should see the word '(.*)' in the screen$")
	public void sheShouldSeeTheWordInTheScreen(String word) throws Exception {
		susan.should(seeThat(TheContent.of(GoogleTranslatePage.TARGET_LANGUAGE_TEXTAREA), equalTo(word)));
	}


}

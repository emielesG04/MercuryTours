package com.pruebadocker.autweb.tasks;

import static net.serenitybdd.screenplay.Tasks.instrumented;

import com.pruebadocker.autweb.user_interfaces.GoogleTranslatePage;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

public class Translate implements Task {
	private static final String SOURCE_LENGUAGE = "English";
	private static final String TARGET_LENGUAGE = "Spanish";
	
	private String word;
	

	public Translate(String word) {
		this.word = word;
	}

	@Override
	public <T extends Actor> void performAs(T actor) {
		actor.attemptsTo(
				Click.on(GoogleTranslatePage.SOURCE_LANGUAGE_OPTION),
				Enter.theValue(SOURCE_LENGUAGE).into(GoogleTranslatePage.SEARCH_SOURCE_LENGUAGE),
				Click.on(GoogleTranslatePage.SOURCE_LANGUAGE),
				Click.on(GoogleTranslatePage.TARGET_LANGUAGE_OPTION),
				Enter.theValue(TARGET_LENGUAGE).into(GoogleTranslatePage.SEARCH_TARGET_LENGUAGE),
				Click.on(GoogleTranslatePage.TARGET_LANGUAGE),
				
				Enter.theValue(word).into(GoogleTranslatePage.SOURCE_LANGUEGE_TEXTAREA));
		
	}

	public static Translate the(String word) {
		return instrumented(Translate.class, word);
	}
}

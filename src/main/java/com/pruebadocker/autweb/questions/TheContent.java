package com.pruebadocker.autweb.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.targets.Target;

public class TheContent implements Question<String> {
	
	private Target target;
	
	public TheContent(Target target) {
		this.target = target;
	}

	@Override
	public String answeredBy(Actor actor) {
		return target.resolveFor(actor).getTextValue();
	}

	public static TheContent of(Target target) {

		return new TheContent(target);
	}

}

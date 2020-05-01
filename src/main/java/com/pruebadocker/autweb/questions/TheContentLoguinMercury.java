package com.pruebadocker.autweb.questions;

import com.pruebadocker.autweb.user_interfaces.EnterLoguinData;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.matchers.WebElementStateMatchers;
import net.serenitybdd.screenplay.questions.Text;
import net.serenitybdd.screenplay.waits.WaitUntil;

public class TheContentLoguinMercury implements Question<String> {
    @Override
    public String answeredBy(Actor actor) {

        actor.attemptsTo(WaitUntil.the(EnterLoguinData.VALIDATED_FIELD, WebElementStateMatchers.isVisible()));
        return Text.of(EnterLoguinData.VALIDATED_FIELD).viewedBy(actor).asString();
    }
    public static TheContentLoguinMercury message(){

        return new TheContentLoguinMercury();
    }
}

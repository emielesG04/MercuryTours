package com.pruebadocker.autweb.tasks;

import com.pruebadocker.autweb.user_interfaces.EnterLoguinData;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

public class DataEnteredLoguinMercury implements Task {

    private com.pruebadocker.autweb.models.DataEnteredLoguinMercury dataEnteredLoguinMercury;

    public DataEnteredLoguinMercury(com.pruebadocker.autweb.models.DataEnteredLoguinMercury dataEntered) {

        this.dataEnteredLoguinMercury = dataEntered;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {


        actor.attemptsTo(Enter.theValue(dataEnteredLoguinMercury.getUserName()).
                into(EnterLoguinData.NAME));

        actor.attemptsTo(Enter.theValue(dataEnteredLoguinMercury.getPassword()).
                into(EnterLoguinData.PASSWORD));

        actor.attemptsTo(Click.on(EnterLoguinData.LOGUIN));
    }

    public static DataEnteredLoguinMercury withData(com.pruebadocker.autweb.models.DataEnteredLoguinMercury dataEnteredLoguinMercury) {
        return new DataEnteredLoguinMercury(dataEnteredLoguinMercury);
    }
}

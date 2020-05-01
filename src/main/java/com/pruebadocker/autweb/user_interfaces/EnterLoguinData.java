package com.pruebadocker.autweb.user_interfaces;

import net.serenitybdd.screenplay.targets.Target;

public class EnterLoguinData {


    public static final Target LOGUIN = Target.
            the("Es el  campo en donde se digita la contraseña  de usuario")
            .locatedBy("//input[@name='login']");

    public static final Target NAME = Target.
            the("Es el campo nombre")
            .locatedBy("//input[@name='userName']");

    public static final Target PASSWORD = Target
            .the("Es el campo contraseña")
            .locatedBy("//input[@name='password']");

    public static final Target VALIDATED_FIELD = Target
            .the("Es el campo de validación que ingreso correctamente")
            .locatedBy("//*[text() = 'Type:']");


}

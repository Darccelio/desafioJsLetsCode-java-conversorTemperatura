package com.letscode.conversor.service;

public class ConversorTemperatura {

    public static final float CELSIUS = 18f;

    public static float toConvertCelsiusToKelvin( float CELCIUS ) {

        return (CELCIUS * 1.8f) + 32;
    }

    public static float toConvertCelsiusToReaumur( float CELCIUS ) {
        return CELCIUS * 0.8f;
    }

    public static float toConvertCelsiusToRankine( float CELCIUS ) {
        return (CELCIUS * 1.8f) + 491;
    }

    public static float toConvertCelsiusToFahrenheit( float CELCIUS ) {
        return (CELCIUS * 1.8f) + 32;
    }


//    final float CELSIUS_TO_KELVIN = (CELCIUS * 1.8f) + 32;
//    final float CELSIUS_TO_REAUMUR = CELCIUS * 0.8f;
//    final float CELSIUS_TO_RANKINE = (CELCIUS * 1.8f) + 491;
//    final float CELSIUS_TO_FAHRENHEIT = (CELCIUS * 1.8f) + 32;




}

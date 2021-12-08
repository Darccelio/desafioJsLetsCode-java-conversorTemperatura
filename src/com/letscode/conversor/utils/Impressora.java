package com.letscode.conversor.utils;

public class Impressora {

    private final static String MENSAGEM_INSERCAO_GRAUS_CELCIUS = "Por favor, insira uma tempera a ser convertida .....: ";


    public static void imprimirMensagemInsercaoGrausCelcius() {
        System.out.print(MENSAGEM_INSERCAO_GRAUS_CELCIUS);
    }

    public static void imprimirResultadoConversaoCelciusFarenheit(float grausCelcius, float resultado) {
        System.out.printf("%.2fºC (Célcius) são %.2fºF (Farenheit) %n", grausCelcius, resultado);
    }

    public static void imprimirResultadoConversaoCelciusKelvin(float grausCelcius, float resultado) {
        System.out.printf("%.2fºC (Célcius) são %.2fºK (Kelvin) %n", grausCelcius, resultado);
    }

    public static void imprimirResultadoConversaoCelciusRéaumur(float grausCelcius, float resultado) {
        System.out.printf("%.2fºC (Célcius) são %.2fºRe (Réaumur) %n", grausCelcius, resultado);
    }

    public static void imprimirResultadoConversaoCelciusRankine(float grausCelcius, float resultado) {
        System.out.printf("%.2fºC (Célcius) são %.2fºRa (Rankine) %n", grausCelcius, resultado);
    }


//    System.out.printf("%.2fº Celsius equivale a %.2fº Kelvin (K) %n",CELCIUS,CELSIUS_TO_KELVIN);
//    System.out.printf("%.2fº Celsius equivale a %.2fº Réaumur (Re) %n",CELCIUS,CELSIUS_TO_REAUMUR);
//    System.out.printf("%.2fº Celsius equivale a %.2fº Rankine (Ra) %n",CELCIUS,CELSIUS_TO_RANKINE);
//    System.out.printf("%.2fº Celsius equivale a %.2fº Fahrenheit (F)%n",CELCIUS,CELSIUS_TO_FAHRENHEIT);


}
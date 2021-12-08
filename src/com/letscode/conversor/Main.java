package com.letscode.conversor;

import com.letscode.conversor.service.ConversorTemperatura;
import com.letscode.conversor.utils.Impressora;
import com.letscode.conversor.utils.Leitor;

//        Escreva um programa que, com base em uma temperatura em graus celsius, a converta e exiba em Kelvin (K), Réaumur (Re), Rankine (Ra), Fahrenheit (F) seguindo as fórmulas:
//
//        F = (C * 1.8) + 32
//        K = C + 273.15
//        Re = C * 0.8
//        Ra = (C * 1.8) + 491

//        Considere a conversão de 18 ºC e a precisão de duas casas decimais

public class Main {

    public static void main(String[] args) {

        System.out.println("Bem vindo ao conversor de temperatura \n");

        final float GRAUS_CELCIUS = Leitor.escanerGrausCelcius();

        final float GRAUS_FARENHEIT = ConversorTemperatura.toConvertCelsiusToFahrenheit(GRAUS_CELCIUS);

        Impressora.imprimirResultadoConversaoCelciusFarenheit(GRAUS_CELCIUS, GRAUS_FARENHEIT);





    }
}

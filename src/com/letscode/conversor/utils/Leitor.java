package com.letscode.conversor.utils;

import java.util.Scanner;

public class Leitor {

    private static Scanner sc = new Scanner(System.in);

    public static float escanerGrausCelcius() {
        Impressora.imprimirMensagemInsercaoGrausCelcius();
        return sc.nextFloat();
    }



}

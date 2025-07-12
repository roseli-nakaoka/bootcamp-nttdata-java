package dev.roselinakaoka.code1.challenge01;

import java.util.Scanner;

/*
 * * Code Challenge 01 - Programa que verifica se o visitante pode acessar
 * a sala especial da biblioteca.  O sistema deve permitir a entrada apenas para
 * visitantes autorizados e com idade mínima de 18 anos. A entrada do programa é
 * se o visitante possui ou não autorização e sua idade.
 * Bootcamp: NTT Data - Java e IA para Iniciantes
 * Code Challenge: Explorando os Fundamentos da Linguagem de Programação Java
 * Autor: Roseli Nakaoka
 * Data: 04/07/2025
 */

public class AccessControl {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Entrada de dados do usuário
        boolean hasPermission = scanner.nextBoolean(); // Lê um valor booleano (true ou false)
        int age = scanner.nextInt(); // Lê a idade como inteiro

        // TODO: Verifique condições de acesso
        String message = "";
        if (hasPermission) {
            if (age >= 18) {
                message = "Acesso permitido";
            } else {
                message = "Idade insuficiente";
            }
        } else {
            message = "Acesso negado";
        }

        System.out.println(message);

        scanner.close();
    }
}
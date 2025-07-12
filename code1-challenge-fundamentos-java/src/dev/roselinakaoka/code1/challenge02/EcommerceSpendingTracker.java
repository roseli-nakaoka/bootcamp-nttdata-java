package dev.roselinakaoka.code1.challenge02;

import java.util.Locale;
import java.util.Scanner;

/*
 * * Code Challenge 02 - Programa que calcula o valor total de items comprados e o 
 * seu valor médio, dado o número de items e o valore de cada item. 
 * Bootcamp: NTT Data - Java e IA para Iniciantes
 * Code Challenge: Explorando os Fundamentos da Linguagem de Programação Java
 * Autor: Roseli Nakaoka
 * Data: 04/07/2025
 */

public class EcommerceSpendingTracker {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.US);
        int purchaseCount = scanner.nextInt();

        if (purchaseCount == 0) {
            System.out.println("Nenhuma compra registrada.");
        } else {
            double totalSpent = 0.0;

            // TODO: Leia os valores das compras e calcule a média
            double item;
            for (int i = 0; i < purchaseCount; i++) {
                do {
                    item = scanner.nextDouble();
                } while (item <= 0.0);
                totalSpent += item;
            }

            System.out.printf("%.2f%n", totalSpent);
            System.out.printf("%.2f%n", totalSpent / purchaseCount); // TODO: Imprima a média
        }

        scanner.close();
    }
}
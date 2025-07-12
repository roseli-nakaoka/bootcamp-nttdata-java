package dev.roselinakaoka.code2.challenge02;

import java.util.Scanner;

/*
 * * Challenge 02 - Corrigir o programa que calcula o valor total considerando
 * frete nulo para valor total de compra maior ou igual a R$ 200.00 e adicionando
 * 5% de desconto se for a primeira compra realizado pelo cliente.
 * Bootcamp: NTT Data - Java e IA para Iniciantes
 * Curso: Fundamentos da Linguagem de Programação Java
 * Autor: Roseli Nakaoka
 * Data: 10/07/2025
 */

public class OrderProcessor {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double itemsValue = scanner.nextDouble();
        double shipping = scanner.nextDouble();
        boolean firstPurchase = scanner.nextBoolean();

        double discount = 0;

        if (firstPurchase == true) {
            discount = itemsValue * 0.05;
        }

        double discountedValue = itemsValue - discount;

        if (itemsValue >= 200.00) {
            shipping = 0;
        }

        double finalValue = discountedValue + shipping;

        System.out.println(String.format("%.2f", finalValue));

        scanner.close();
    }
}
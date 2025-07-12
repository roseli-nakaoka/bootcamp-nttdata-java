package dev.roselinakaoka.code2.challenge01;

import java.util.Scanner;

/*
 * * Challenge 01 - Corrigir o programa que calcula o desconto de 10% sobre o
 * valor do produto se utilização do cupom "DESC10" e aplicação de cashback em
 * caso de valor final com desconto maior ou igual à R$ 150.00.
 * Bootcamp: NTT Data - Java e IA para Iniciantes
 * Curso: Fundamentos da Linguagem de Programação Java
 * Autor: Roseli Nakaoka
 * Data: 10/07/2025
 */

public class CashbackCalculator {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double productsValue = scan.nextDouble();
        scan.nextLine();
        String couponCode = scan.nextLine();

        double discount = 0;
        double cashback = 0;

        if (couponCode.trim().equalsIgnoreCase("DESC10")) {
            discount = productsValue * 0.10;
        }

        double discountedValue = productsValue - discount;

        if (discountedValue >= 150.00)
            cashback = 15.00;

        double finalValue = discountedValue - cashback;

        System.out.printf("Valor final: R$ %.2f | Cashback: R$ %.2f\n", finalValue, cashback);

        scan.close();
    }
}
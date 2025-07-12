package dev.roselinakaoka.curso2.exercicio02;

import java.util.Scanner;

/*
 * * Exercício 02 - Programa de cáculo do IMC (Índice de Massa Corpórea)
 * Bootcamp: NTT Data - Java e IA para Iniciantes
 * Curso: Estruturas de Controle Java
 * Autor: Roseli Nakaoka
 * Data: 03/07/2025
 */
public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        //Cabeçalho
        System.out.println("\nCáculo de IMC (Índice de Massa Corpórea)\n");

        // Solicita a altura
        System.out.print("Digite a altura (m): ");
        var altura = scanner.nextDouble();
        scanner.nextLine(); // limpa o ENTER pendente

        // Solicita o peso
        System.out.print("Digite o peso (kg): ");
        var peso = scanner.nextDouble();
        scanner.nextLine(); // limpa o ENTER pendente

        // Cálculo do IMC
        var imc = peso / (altura * altura);
        System.out.printf("IMC = %.1f\n", imc);

        if (imc <= 18.5) {
            System.out.println("Abaixo do peso");
        } else if (imc > 18.5 && imc <= 24.9) {
            System.out.println("Peso ideal");
        } else if (imc > 24.9 && imc <= 29.9) {
            System.out.println("Levemente acima do peso");
        } else if (imc > 29.9 && imc <= 34.9) {
                System.out.println("Obesidade Grau I");
        } else if (imc > 34.9 && imc <= 39.9) {
            System.out.println("Obesidade Grau II (Severa)");
        } else if (imc > 39.9) {
                System.out.println("Obesidade Grau III (Mórbida)");
        }
        scanner.close();
    }
}
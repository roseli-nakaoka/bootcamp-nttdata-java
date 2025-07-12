package dev.roselinakaoka.curso1.exercicio03;

import java.util.Scanner;

/*
 * * Exercício 03 - Programa que calcula a área do retângulo
 * Bootcamp: NTT Data - Java e IA para Iniciantes
 * Curso: Fundamentos da Linguagem de Programação Java
 * Autor: Roseli Nakaoka
 * Data: 02/07/2025
 */

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Solicita a base do retângulo
        System.out.print("Digite a base do retângulo: ");
        var base = scanner.nextDouble();
        scanner.nextLine(); // Limpa o enter pendente

        // Solicita a altura do retângulo
        System.out.print("Digite a altura do retângulo: ");
        var altura = scanner.nextDouble();
        scanner.nextLine(); // Limpa o enter pendente

        // Calcula a área do quadrado
        var area = base * altura;

        // Exibe o resultado
        System.out.printf("Área do retângulo = %.2f\n", area);

        scanner.close();

    }
}
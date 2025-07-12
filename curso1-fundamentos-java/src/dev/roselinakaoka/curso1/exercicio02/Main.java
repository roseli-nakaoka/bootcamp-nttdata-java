package dev.roselinakaoka.curso1.exercicio02;

/*
 * * Exercício 02 - Programa que calcula a área do quadrado
 * Bootcamp: NTT Data - Java e IA para Iniciantes
 * Curso: Fundamentos da Linguagem de Programação Java
 * Autor: Roseli Nakaoka
 * Data: 02/07/2025
 */

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Solicita o lado do quadrado
        System.out.print("Digite o lado do quadrado: ");
        var lado = scanner.nextDouble();
        scanner.nextLine(); // Limpa o enter pendente

        // Calcula a área do quadrado
        var area = lado * lado;

        //Exibe o resultado
        System.out.printf("Área do quadrado = %.2f\n", area);

        scanner.close();
    }
}
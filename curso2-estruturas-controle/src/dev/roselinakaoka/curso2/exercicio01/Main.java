package dev.roselinakaoka.curso2.exercicio01;

import java.util.Scanner;

/*
 * * Exercício 01 - Programa que gera a tabela de multiplicação de 1 à 10
 * para um dado número.
 * Bootcamp: NTT Data - Java e IA para Iniciantes
 * Curso: Estruturas de Controle Java
 * Autor: Roseli Nakaoka
 * Data: 03/07/2025
 */
public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Solicita o número para gerar a tabela de multiplicação
        System.out.print("Digite o número para gerar a tabela de multiplicação: ");
        var numero = scanner.nextInt();
        scanner.nextLine(); // limpa o ENTER pendente

        // Gera a tabela de multiplicação
        for(int i = 0; i<10; i++) {
            System.out.printf("%2d x %d = %d\n", (i+1), numero, (i+1)*numero);
        }
        scanner.close();
    }
}
package dev.roselinakaoka.curso2.exercicio04;

import java.util.Scanner;

/*
 * * Exercício 04 - Programa que dado um número inicial, testa se os novos números dados
 * são divisíveis pelo número incial. Quando um número divisivel for encontrado, o
 * programa é interrompido.
 * Bootcamp: NTT Data - Java e IA para Iniciantes
 * Curso: Estruturas de Controle Java
 * Autor: Roseli Nakaoka
 * Data: 03/07/2025
 */
public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        var primeiro_numero = 0;
        var numero = 0;
        var resultado = 0;

        //Cabeçalho
        System.out.println("\nTesta a divisibilidade dos números pelo primeiro número\n");

        // Solicita o valor do intervalo inicial
        System.out.println("Digite o primeiro número: ");
        primeiro_numero = scanner.nextInt();
        scanner.nextLine(); // limpa o ENTER pendente
        System.out.print("\n");

        // Solicita o valor do intervalo final que deve ser maior que o intervalo inicial;

        do {
            System.out.println("Digite o número para verificação: ");
            numero = scanner.nextInt();
            scanner.nextLine();

            if (numero <= primeiro_numero) {
                System.out.println("Número inválido! Tente novamente.\n");
                continue;
            }

            resultado = numero % primeiro_numero;
            System.out.printf("%d %% %d = %d \n\n", numero, primeiro_numero, resultado);
            if(numero%primeiro_numero != 0 ) {
                System.out.printf("Número não divisível por %d ! Fim da execução.\n", primeiro_numero);
            }

        } while ( resultado == 0);

        scanner.close();
    }
}
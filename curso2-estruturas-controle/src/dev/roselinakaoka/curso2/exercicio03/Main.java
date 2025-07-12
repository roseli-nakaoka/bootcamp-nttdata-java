package dev.roselinakaoka.curso2.exercicio03;

import java.util.Scanner;

/*
 * * Exercício 03 - Programa que lista em ordem decrescente todos os números pares ou
 * ímpares de acordo com a seleção dentro de um intervalo fornecido pelo usuário.
 * Bootcamp: NTT Data - Java e IA para Iniciantes
 * Curso: Estruturas de Controle Java
 * Autor: Roseli Nakaoka
 * Data: 03/07/2025
 */
public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        var primeiro_numero = 0;
        var segundo_numero = 0;
        var opcao = 0;

        //Cabeçalho
        System.out.println("\nListagem de Números Pares ou Impares dentro de um intervalo)\n");

        // Solicita o valor do intervalo inicial
        System.out.print("Digite o primeiro número: ");
        primeiro_numero = scanner.nextInt();
        scanner.nextLine(); // limpa o ENTER pendente

        // Solicita o valor do intervalo final que deve ser maior que o intervalo inicial;

        do {
            System.out.print("Digite o segundo número, maior que o primeiro: ");
            segundo_numero = scanner.nextInt();
            scanner.nextLine();

            if (segundo_numero <= primeiro_numero) {
                System.out.println("Número inválido! Tente novamente.");
            }
        } while (segundo_numero <= primeiro_numero);

        // Solicita a opção <0> Par ou <1> Impar
        do {
            System.out.print("Digite a opção <0> Par ou <1> Ímpar: ");
            opcao = scanner.nextInt();
            scanner.nextLine(); // limpa o ENTER pendente

            if (opcao != 0 && opcao != 1) {
                System.out.println("Opção Inválida! Tente novamente.");
            }

        } while (opcao != 0 && opcao != 1);

        // Setar o valor inicial da lista de acordo com a opção selecionada
        var valor_incial = segundo_numero;
        if((segundo_numero%2 == 0 && opcao == 1) || (segundo_numero%2 !=0 && opcao==0 ))
            valor_incial = segundo_numero - 1;

        // Lista em ordem crescente os numeros pares ou impares em ordem decrescente
        for (int num = valor_incial; num >= primeiro_numero; num-=2) {
            System.out.println(num);
        }
        scanner.close();
    }
}
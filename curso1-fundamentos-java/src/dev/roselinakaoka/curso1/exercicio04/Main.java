package dev.roselinakaoka.curso1.exercicio04;

/*
 * * Exercício 04 - Programa que lê o nome e ano de nascimento de 2 usuários e imprime
 * a diferença de idade entre eles
 * Bootcamp: NTT Data - Java e IA para Iniciantes
 * Curso: Fundamentos da Linguagem de Programação Java
 * Autor: Roseli Nakaoka
 * Data: 02/07/2025
 */

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Solicita o nome da primeira pessoa
        System.out.print("Digite o nome da primeira pessoa: ");
        var nome_pessoa01 = scanner.nextLine();

        // Solicita o ano de nascimento da primeira pessoa
        System.out.print("Digite o ano de nascimento da primeira pessoa: ");
        var anoNascimento_pessoa01 = scanner.nextInt();
        scanner.nextLine(); // limpa o ENTER pendente

        // Solicita o nome da segunda pessoa
        System.out.print("Digite o nome da segunda pessoa: ");
        var nome_pessoa02 = scanner.nextLine();

        // Solicita o ano de nascimento da segunda pessoa
        System.out.print("Digite o ano de nascimento da segunda pessoa: ");
        var anoNascimento_pessoa02 = scanner.nextInt();
        scanner.nextLine(); // limpa o ENTER pendente

        // Calcula a diferença de idades
        var diferenca_idade = Math.abs(anoNascimento_pessoa01 - anoNascimento_pessoa02);

        // Exibe a mensagem final
        System.out.printf("A diferença de idade entre %s e %s é de %d anos\n", nome_pessoa01, nome_pessoa02,
                diferenca_idade);

        scanner.close();

    }
}
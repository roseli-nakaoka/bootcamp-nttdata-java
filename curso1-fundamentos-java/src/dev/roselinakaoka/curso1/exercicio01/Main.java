package dev.roselinakaoka.curso1.exercicio01;

import java.time.Year;
import java.util.Scanner;

/*
 * * Exercício 01 - Programa que lê nome e ano de nascimento do usuário e imprime
 * uma saudação com sua idade.
 * Bootcamp: NTT Data - Java e IA para Iniciantes
 * Curso: Fundamentos da Linguagem de Programação Java
 * Autor: Roseli Nakaoka
 * Data: 02/07/2025
 */
public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Obtém o ano corrente
        int anoCorrente = Year.now().getValue();

        // Solicita o nome
        System.out.print("Digite o seu nome: ");
        var nome = scanner.nextLine();

        // Solicita o ano de nascimento
        System.out.print("Digite o ano do seu nascimento: ");
        var anoNascimento = scanner.nextInt();
        scanner.nextLine(); // limpa o ENTER pendente

        // Calcula a idade
        var idade = anoCorrente - anoNascimento;

        // Exibe a mensagem final
        System.out.printf("Olá %s, você tem %d anos!\n", nome, idade);

        scanner.close();

    }
}